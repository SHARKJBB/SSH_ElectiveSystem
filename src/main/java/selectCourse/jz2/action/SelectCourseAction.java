package selectCourse.jz2.action;

import selectCourse.jz2.pojo.Course;
import selectCourse.jz2.pojo.Student;
import selectCourse.jz2.pojo.StudentCourse;
import selectCourse.jz2.pojo.Sw;
import selectCourse.jz2.service.ICourseService;
import selectCourse.jz2.service.ISWService;
import selectCourse.jz2.service.IStudentCourseService;
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
@Scope ("prototype")
public class SelectCourseAction  extends ActionSupport implements ModelDriven<StudentCourse> {
	private StudentCourse selectCourse;
	
	@Autowired
	private ISWService swService;
	
	@Autowired
	private ICourseService courseService;
	
	@Autowired
	private IStudentCourseService studentCourseService;
	
	public String addInput() {
		List<Sw> sws = swService.list();
		ServletActionContext.getRequest().getSession().setAttribute("isOpen", sws.get(0).isFlag());
		ActionContext.getContext().put("courses", courseService.list());
		return SUCCESS;
	}
	
	public String add() {
		Student loginStudent = (Student) ServletActionContext.getRequest().getSession().getAttribute("loginStudent");
		Course course = courseService.get(selectCourse.getId());
		selectCourse.setStudent(loginStudent);
		selectCourse.setCourse(course);
		studentCourseService.add(selectCourse);
		return "redirect";
	}
	public String delete() {
		studentCourseService.delete(selectCourse.getId());
		return "redirect";
	}
	
	public String updateInput() {
		StudentCourse cr = studentCourseService.get(selectCourse.getId());
		try {
			BeanUtils.copyProperties(selectCourse, cr);
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
		studentCourseService.update(selectCourse);
		return "redirect";
	}
	
	public String list() {
		Student loginStudent = (Student) ServletActionContext.getRequest().getSession().getAttribute("loginStudent");
		ArrayList<StudentCourse> studentCourses = new ArrayList<StudentCourse>(studentCourseService.list());
		for (int i = 0; i < studentCourses.size(); i ++) {
			StudentCourse item = studentCourses.get(i);
			if (item.getStudent().getId() != loginStudent.getId()) {
				studentCourses.remove(i);
			}
		}
		ActionContext.getContext().put("studentCourses", studentCourses);
		return SUCCESS;
	}
	
	public StudentCourse getModel() {
		if (selectCourse == null) {
			selectCourse = new StudentCourse();
		}
		return selectCourse;
	}
}
