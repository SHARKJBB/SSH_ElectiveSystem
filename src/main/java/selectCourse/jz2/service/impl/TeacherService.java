package selectCourse.jz2.service.impl;

import selectCourse.jz2.dao.ITeacherDao;
import selectCourse.jz2.exception.UserException;
import selectCourse.jz2.pojo.Teacher;
import selectCourse.jz2.service.ITeacherService;
import selectCourse.jz2.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherDao teacherDao;

    public void add(Teacher teacher) {
        // TODO Auto-generated method stub
        long count = teacherDao.loadByTeacherUserName(teacher.getUsername());
        if(count > 0) {
            throw new UserException("该教师工号已存在");
        }
        String password = teacher.getPassword().split(",")[1];
        password = password.trim();
        if (password.equals("")) {
            teacher.setPassword(CodeUtil.getMD5Encoding("888888"));
        } else {
            teacher.setPassword(CodeUtil.getMD5Encoding(password));
        }
        teacherDao.add(teacher);
    }

    public void delete(int id) {
        // TODO Auto-generated method stub
        Teacher teacher = teacherDao.load(id);
        teacherDao.delete(teacher);
    }

    public void update(Teacher teacher) {
        String password = teacher.getPassword().split(",")[1];
        password = password.trim();
        if (password.equals("")) {
            teacher.setPassword(CodeUtil.getMD5Encoding("888888"));
        } else {
            teacher.setPassword(CodeUtil.getMD5Encoding(password));
        }
        // TODO Auto-generated method stub
        //teacher.setPassword(CodeUtil.getMD5Encoding(teacher.getPassword()));
        teacherDao.update(teacher);
    }

    public Teacher load(int id) {
        // TODO Auto-generated method stub
        return teacherDao.load(id);
    }

    public Teacher get(int id) {
        // TODO Auto-generated method stub
        return teacherDao.get(id);
    }

    public List<Teacher> list() {
        // TODO Auto-generated method stub
        String hql = "select t from Teacher t";
        List<Teacher> teachers = teacherDao.list(hql, null);
        return teachers;
    }

    public List<Teacher> list(Object arg) {
        // TODO Auto-generated method stub
        List<Teacher> teachers = this.list(new Object[]{arg});
        return teachers;
    }

    public List<Teacher> list(Object[] args) {
        // TODO Auto-generated method stub
        String hql = "select t from Teacher t where ";
        for(int i = 0; i < args.length; i++) {
            if(i == 0) {
                hql += args[i] + "=?";
            }
            hql += "," + args[i] + "=?";
        }
        List<Teacher> teachers = teacherDao.list(hql, args);
        return teachers;
    }

    public Teacher login(String username, String password) {
        // TODO Auto-generated method stub
        Teacher teacher = teacherDao.login(username);
        if(teacher == null) {
            throw new UserException("该老师不存在");
        }
        if(!teacher.getPassword().equals(CodeUtil.getMD5Encoding(password))) {
            throw new UserException("密码错误");
        }
        return teacher;
    }

}
