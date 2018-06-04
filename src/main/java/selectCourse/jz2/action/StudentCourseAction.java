package selectCourse.jz2.action;

import selectCourse.jz2.pojo.StudentCourse;
import selectCourse.jz2.pojo.Sw;
import selectCourse.jz2.service.ICourseService;
import selectCourse.jz2.service.ISWService;
import selectCourse.jz2.service.IStudentCourseService;
import selectCourse.jz2.service.IStudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Controller
@Scope("prototype")
public class StudentCourseAction extends ActionSupport implements ModelDriven<StudentCourse>{

    private StudentCourse studentCourse;

    @Autowired
    private IStudentCourseService studentCourseService;
    
    @Autowired
    private ICourseService courseService;
    
    @Autowired
    private IStudentService studentService;
    
    @Autowired
    private ISWService swService;

    public StudentCourse getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(StudentCourse studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String addInput() {
        List<Sw> sws = swService.list();
        ServletActionContext.getRequest().getSession().setAttribute("isOpen", sws.get(0).isFlag());
        ActionContext.getContext().put("courses", courseService.list());
        ActionContext.getContext().put("students", studentService.list());
        return SUCCESS;
    }

    public String add() {
        studentCourseService.add(studentCourse);
        return "redirect";
    }

    public String delete() {
        studentCourseService.delete(studentCourse.getId());
        return "redirect";
    }

    public String updateInput() {
        StudentCourse cr = studentCourseService.get(studentCourse.getId());
        try {
            BeanUtils.copyProperties(studentCourse, cr);
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
        studentCourseService.update(studentCourse);
        return "redirect";
    }

    public String list() {
        List<StudentCourse> studentCourses = studentCourseService.list();
        ActionContext.getContext().put("studentCourses", studentCourses);
        return SUCCESS;
    }

    public StudentCourse getModel() {
        if (studentCourse == null) {
            studentCourse = new StudentCourse();
        }
        return studentCourse;
    }
}
