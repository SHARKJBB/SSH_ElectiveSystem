package selectCourse.jz2.service.impl;

import selectCourse.jz2.dao.IUserDao;
import selectCourse.jz2.exception.UserException;
import selectCourse.jz2.pojo.User;
import selectCourse.jz2.service.IUserService;
import selectCourse.jz2.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    public User login(String username, String password) {
        // TODO Auto-generated method stub
        User user = userDao.login(username);
        if(user == null) {
            throw new UserException("用户名不存在");
        }
        if(!user.getPassword().equals(CodeUtil.getMD5Encoding(password))) {
            throw new UserException("密码错误");
        }
        return user;
    }
}
