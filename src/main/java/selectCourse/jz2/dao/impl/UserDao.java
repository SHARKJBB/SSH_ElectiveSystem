package selectCourse.jz2.dao.impl;

import selectCourse.jz2.dao.IUserDao;
import selectCourse.jz2.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> implements IUserDao {

    public User login(String username) {
        // TODO Auto-generated method stub
        String hql = "select u from User u where username=?";
        User user = (User) openSession().createQuery(hql)
                .setParameter(0, username).uniqueResult();
        return user;
    }

}
