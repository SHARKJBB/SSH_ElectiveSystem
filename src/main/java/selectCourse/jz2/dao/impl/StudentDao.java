package selectCourse.jz2.dao.impl;

import selectCourse.jz2.dao.IStudentDao;
import selectCourse.jz2.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao extends BaseDao<Student> implements IStudentDao {

    public Student login(String num) {
        // TODO Auto-generated method stub
        String hql = "select s from Student s where num=?";
        Student student = (Student) openSession().createQuery(hql)
                .setParameter(0, num).uniqueResult();
        return student;
    }

    public long loadByStudentNum(String num) {
        String hql = "select count(*) from Student where num=?";
        Long count = (Long) openSession().createQuery(hql)
                .setParameter(0, num).uniqueResult();
        return count;
    }

}
