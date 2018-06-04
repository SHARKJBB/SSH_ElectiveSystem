package selectCourse.jz2.dao;

import selectCourse.jz2.pojo.Student;

public interface IStudentDao extends IBaseDao<Student> {
    public Student login(String num);

    public long loadByStudentNum(String num);
}
