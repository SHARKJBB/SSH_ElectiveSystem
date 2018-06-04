package selectCourse.jz2.dao;

import selectCourse.jz2.pojo.Course;

public interface ICourseDao extends IBaseDao<Course>{
    public long loadByCourseName(String name);
}
