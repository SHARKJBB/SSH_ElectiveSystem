package selectCourse.jz2.action;

import selectCourse.jz2.pojo.Classroom;
import selectCourse.jz2.service.IClassroomService;
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
public class ClassroomAction extends ActionSupport implements ModelDriven<Classroom>{

    private Classroom classroom;

    @Autowired
    private IClassroomService classroomService;

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String addInput() {
        return SUCCESS;
    }

    public String add() {
        classroomService.add(classroom);
        return "redirect";
    }

    public String delete() {
        classroomService.delete(classroom.getId());
        return "redirect";
    }

    public String updateInput() {
        Classroom cr = classroomService.get(classroom.getId());
        try {
            BeanUtils.copyProperties(classroom, cr);
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
        classroomService.update(classroom);
        return "redirect";
    }

    public String list() {
        List<Classroom> classrooms = classroomService.list();
        ActionContext.getContext().put("classrooms", classrooms);
        return SUCCESS;
    }

    public Classroom getModel() {
        if (classroom == null) {
            classroom = new Classroom();
        }
        return classroom;
    }
}
