package selectCourse.jz2.action;

import selectCourse.jz2.pojo.Course;
import selectCourse.jz2.pojo.Teacher;
import selectCourse.jz2.service.ICourseService;
import selectCourse.jz2.service.ITeacherService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {

    @Autowired
    private ITeacherService teacherService;
    
    @Autowired
    private ICourseService courseService;

    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String addInput() {
        return SUCCESS;
    }

    public String add() {
        teacherService.add(teacher);
        return "redirect";
    }

    public String list() {
        List<Teacher> teachers = teacherService.list();
        ActionContext.getContext().put("teachers",teachers);
        return SUCCESS;
    }

    public String update() {
        teacherService.update(teacher);
        return "redirect";
    }

    public String delete() {
        teacherService.delete(teacher.getId());
        return "redirect";
    }
    
    public String show() {
        Teacher loginTeacher = (Teacher) ServletActionContext.getRequest().getSession().getAttribute("loginTeacher");
        ArrayList<Course> courses = new ArrayList<Course>(courseService.list());
        for (int i = 0; i < courses.size(); i ++) {
            Course item = courses.get(i);
            if (item.getTeacher().getId() != loginTeacher.getId()) {
                courses.remove(i);
            }
        }
        ServletActionContext.getRequest().getSession().setAttribute("courses", courses);
        return "show";
    }

    public String updateInput() {
        Teacher t = teacherService.get(teacher.getId());
        try {
            BeanUtils.copyProperties(teacher, t);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public Teacher getModel() {
        // TODO Auto-generated method stub
        if (teacher == null) {
            teacher = new Teacher();
        }
        return teacher;
    }

}
