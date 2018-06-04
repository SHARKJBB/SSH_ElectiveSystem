package selectCourse.jz2.dao;

import selectCourse.jz2.pojo.User;

public interface IUserDao extends IBaseDao<User> {
    public User login(String username);
}
