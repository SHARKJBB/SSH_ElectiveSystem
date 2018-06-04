package selectCourse.jz2.action;

import selectCourse.jz2.pojo.User;
import selectCourse.jz2.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    @Autowired
    private ITeacherService teacherService;


    public User getModel() {
        // TODO Auto-generated method stub
        return null;
    }


}
