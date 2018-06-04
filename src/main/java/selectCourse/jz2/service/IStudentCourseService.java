package selectCourse.jz2.service;

import selectCourse.jz2.pojo.StudentCourse;

import java.util.List;

public interface IStudentCourseService {

    public void add(StudentCourse studentCourse);

    public void delete(int id);

    public void update(StudentCourse studentCourse);

    public StudentCourse load(int id);

    public StudentCourse get(int id);

    public List<StudentCourse> list();

}
