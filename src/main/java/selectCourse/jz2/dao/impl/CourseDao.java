package selectCourse.jz2.dao.impl;

import selectCourse.jz2.dao.ICourseDao;
import selectCourse.jz2.pojo.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao extends BaseDao<Course> implements ICourseDao{

    /**
     * 根据课程名称查询是否存在一个相同的课程
     */
    public long loadByCourseName(String name) {
        String hql = "select count(*) from Course where name=?";
        Long count = (Long) openSession().createQuery(hql)
                .setParameter(0, name).uniqueResult();
        return count;
    }
}
