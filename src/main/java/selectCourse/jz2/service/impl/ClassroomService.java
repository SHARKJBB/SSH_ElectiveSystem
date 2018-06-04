package selectCourse.jz2.service.impl;

import selectCourse.jz2.dao.IClassroomDao;
import selectCourse.jz2.exception.UserException;
import selectCourse.jz2.pojo.Classroom;
import selectCourse.jz2.service.IClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService{

    @Autowired
    private IClassroomDao classroomDao;

    public void add(Classroom classroom) {
        long count = classroomDao.loadByClassroomName(classroom.getName());
        if(count > 0) {
            throw new UserException("该班级已存在");
        }
        classroomDao.add(classroom);
    }

    public void delete(int id) {
        Classroom classroom = classroomDao.load(id);
        classroomDao.delete(classroom);
    }

    public void update(Classroom classroom) {
        classroomDao.update(classroom);
    }

    public Classroom load(int id) {
        return classroomDao.load(id);
    }

    public Classroom get(int id) {
        return classroomDao.get(id);
    }

    public List<Classroom> list() {
        String hql = "from Classroom";
        return classroomDao.list(hql,null);
    }
}
