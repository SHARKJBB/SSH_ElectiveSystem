package selectCourse.jz2.service.impl;

import selectCourse.jz2.dao.ICourseDao;
import selectCourse.jz2.exception.UserException;
import selectCourse.jz2.pojo.Course;
import selectCourse.jz2.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private ICourseDao courseDao;

    public void add(Course course) {
        // TODO Auto-generated method stub
        long count = courseDao.loadByCourseName(course.getName());
        if(count > 0) {
            throw new UserException("该课程已存在");
        }
        courseDao.add(course);
    }

    public void delete(int id) {
        // TODO Auto-generated method stub
        Course course = courseDao.load(id);
        courseDao.delete(course);
    }

    public void update(Course course) {
        // TODO Auto-generated method stub
        courseDao.update(course);
    }

    public Course load(int id) {
        // TODO Auto-generated method stub
        return courseDao.load(id);
    }

    public Course get(int id) {
        // TODO Auto-generated method stub
        return courseDao.get(id);
    }

    public List<Course> list() {
        // TODO Auto-generated method stub
        String hql = "from Course";
        return courseDao.list(hql, null);
    }

}
