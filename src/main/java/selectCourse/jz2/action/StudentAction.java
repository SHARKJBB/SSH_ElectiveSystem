package selectCourse.jz2.action;

import selectCourse.jz2.pojo.Student;
import selectCourse.jz2.pojo.StudentCourse;
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
import selectCourse.jz2.util.CodeUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
public class StudentAction extends ActionSupport implements ModelDriven<Student> {

    private Student student;

    @Autowired
    private IStudentService studentService;
    
    @Autowired
    private IStudentCourseService studentCourseService;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String addInput() {
        return SUCCESS;
    }

    public String add() {
        studentService.add(student);
        return "redirect";
    }

    public String list() {
        List<Student> students = studentService.list();
        ActionContext.getContext().put("students",students);
        return SUCCESS;
    }

    public String update() {
        studentService.update(student);
        return "redirect";
    }

    public String delete() {
        studentService.delete(student.getId());
        return "redirect";
    }

    public String updateInput() {
        Student s = studentService.get(student.getId());
        try {
            BeanUtils.copyProperties(student, s);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return SUCCESS;
    }
    
    public String show() {
        Student loginStudent = (Student) ServletActionContext.getRequest().getSession().getAttribute("loginStudent");
        ArrayList<StudentCourse> studentCourses = new ArrayList<StudentCourse>(studentCourseService.list());
        for (int i = 0; i < studentCourses.size(); i ++) {
            StudentCourse item = studentCourses.get(i);
            if (item.getStudent().getId() != loginStudent.getId()) {
                studentCourses.remove(i);
            }
        }
        ServletActionContext.getRequest().getSession().setAttribute("studentCourses", studentCourses);
        return "show";
    }

    public Student getModel() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }
}
