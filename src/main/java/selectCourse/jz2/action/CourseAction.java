package selectCourse.jz2.action;

import selectCourse.jz2.pojo.Course;
import selectCourse.jz2.service.IClassroomService;
import selectCourse.jz2.service.ICourseService;
import selectCourse.jz2.service.ITeacherService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Controller
@Scope("prototype")
public class CourseAction extends ActionSupport implements ModelDriven<Course> {
    private Course course;

    @Autowired
    private ICourseService courseService;

    @Autowired
    private ITeacherService teacherService;
    
    @Autowired
    private IClassroomService classroomService;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String addInput() {
        //需要s:select时，必须先将list初始化
        ActionContext.getContext().put("teachers",teacherService.list());
        ActionContext.getContext().put("classrooms",classroomService.list());
        return SUCCESS;
    }

    public String add() {
        courseService.add(course);
        return "redirect";
    }

    public String delete() {
        courseService.delete(course.getId());
        return "redirect";
    }

    public String updateInput() {
        ActionContext.getContext().put("teachers",teacherService.list());
        ActionContext.getContext().put("classrooms",classroomService.list());
        Course c = courseService.get(course.getId());
        System.out.println(c.toString());
        try {
            BeanUtils.copyProperties(course, c);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String update() {
        courseService.update(course);
        return "redirect";
    }

    public String list() {
        List<Course> courses = courseService.list();
        ActionContext.getContext().put("courses", courses);
        return SUCCESS;
    }

    public Course getModel() {
        // TODO Auto-generated method stub
        if (course == null) {
            course = new Course();
        }
        return course;
    }
}
