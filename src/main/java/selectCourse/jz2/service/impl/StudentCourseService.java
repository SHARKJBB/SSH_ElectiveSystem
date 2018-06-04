package selectCourse.jz2.service.impl;

import selectCourse.jz2.dao.IStudentCourseDao;
import selectCourse.jz2.pojo.StudentCourse;
import selectCourse.jz2.service.IStudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseService implements IStudentCourseService {
	@Autowired
	private IStudentCourseDao studentCourseDao;
	
	public void add(StudentCourse studentCourse) {
		studentCourseDao.add(studentCourse);
	}
	
	public void delete(int id) {
		StudentCourse studentCourse = studentCourseDao.load(id);
		studentCourseDao.delete(studentCourse);
	}
	
	public void update(StudentCourse studentCourse) {
		studentCourseDao.update(studentCourse);
	}
	
	public StudentCourse load(int id) {
		return studentCourseDao.load(id);
	}
	
	public StudentCourse get(int id) {
		return studentCourseDao.get(id);
	}
	
	public List<StudentCourse> list() {
		String hql = "from StudentCourse";
		return studentCourseDao.list(hql, null);
	}
}
