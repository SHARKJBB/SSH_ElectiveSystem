package selectCourse.jz2.dao;

import selectCourse.jz2.pojo.Classroom;

public interface IClassroomDao extends IBaseDao<Classroom> {

    public long loadByClassroomName(String name);
}
