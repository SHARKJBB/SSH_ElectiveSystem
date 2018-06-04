package selectCourse.jz2.service;

import selectCourse.jz2.pojo.Classroom;

import java.util.List;

public interface IClassroomService {

    public void add(Classroom classroom);

    public void delete(int id);

    public void update(Classroom classroom);

    public Classroom load(int id);

    public Classroom get(int id);

    public List<Classroom> list();

}
