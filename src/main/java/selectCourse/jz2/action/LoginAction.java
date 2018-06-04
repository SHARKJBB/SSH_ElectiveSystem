package selectCourse.jz2.action;

import selectCourse.jz2.exception.UserException;
import selectCourse.jz2.pojo.Student;
import selectCourse.jz2.pojo.Teacher;
import selectCourse.jz2.pojo.User;
import selectCourse.jz2.service.IStudentService;
import selectCourse.jz2.service.ITeacherService;
import selectCourse.jz2.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class LoginAction {
    @Autowired
    private IUserService userService;
    @Autowired
    private ITeacherService teacherService;
    @Autowired
    private IStudentService studentService;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    /**
     * 用户登录方法：
     * 管理员登录以后,角色为1
     * 老师登录以后,角色为2
     * 学生登录以后,角色为3
     */
    public String login() {
        //以a开头,说明登录用户是管理员,角色为1
        if (username.startsWith("a")) {
            User loginUser = null;
            try {
                loginUser = userService.login(username, password);
            } catch (UserException e) {
                ActionContext.getContext().put("error", e.getMessage());
                return "error";
            }
            ActionContext.getContext().put("user", username);
            //把登录用户添加到session中
            ServletActionContext.getRequest().getSession().setAttribute("loginUser", loginUser);
            //把登录用户角色添加到session中
            ServletActionContext.getRequest().getSession().setAttribute("role", 1);
        }
        //以t开头,说明登录用户是管理员,角色为2
        else if (username.startsWith("t")) {
            Teacher loginTeacher = null;
            try {
                loginTeacher = teacherService.login(username, password);
            } catch (UserException e) {
                ActionContext.getContext().put("error", e.getMessage());
                return "error";
            }
            ActionContext.getContext().put("user", username);
            ServletActionContext.getRequest().getSession().setAttribute("loginTeacher", loginTeacher);
            ServletActionContext.getRequest().getSession().setAttribute("role", 2);
        } else {
            Student loginStudent = null;
            try {
                loginStudent = studentService.login(username, password);
            } catch (UserException e) {
                ActionContext.getContext().put("error", e.getMessage());
                return "error";
            }
            ActionContext.getContext().put("user", username);
            ServletActionContext.getRequest().getSession().setAttribute("loginStudent", loginStudent);
            ServletActionContext.getRequest().getSession().setAttribute("role", 3);
        }
        return "success";
    }

    /**
     * 跳转到页面顶部方法
     */
    public String top() {
        return "success";
    }

    /**
     * 跳转到页面左部方法
     */
    public String left() {
        int role = (Integer) ServletActionContext
                .getRequest().getSession().getAttribute("role");
        //管理员
        if (role == 1) {
            return "left1";
        }
        //老师
        else if (role == 2) {
            return "left2";
        }
        //学生
        else if (role == 3) {
            return "left3";
        } else {
            return null;
        }
    }

    /**
     * 跳转到欢迎界面方法
     */
    public String welcome() {
        return "success";
    }

    /**
     * 退出
     */
    public String logout() {
        //清空session
        ServletActionContext.getRequest().getSession().invalidate();
        return "success";
    }
}
