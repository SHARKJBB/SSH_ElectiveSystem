package selectCourse.jz2.dao;

import selectCourse.jz2.pojo.Teacher;

public interface ITeacherDao extends IBaseDao<Teacher> {
    public Teacher login(String username);

    public long loadByTeacherUserName(String username);
}
