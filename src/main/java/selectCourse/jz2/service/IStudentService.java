package selectCourse.jz2.service;

import selectCourse.jz2.pojo.Student;

import java.util.List;

public interface IStudentService {
    public void add(Student student);

    public void delete(int id);

    public void update(Student student);

    public Student load(int id);

    public Student get(int id);

    public List<Student> list();

    public List<Student> list(Object arg);

    public List<Student> list(Object args[]);

    public Student login(String num, String password);
}
