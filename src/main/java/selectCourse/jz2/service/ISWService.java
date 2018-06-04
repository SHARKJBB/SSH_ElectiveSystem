package selectCourse.jz2.service;


import selectCourse.jz2.pojo.Sw;

import java.util.List;

public interface ISWService {

    public void update();

    public Sw load(int id);

    public Sw get(int id);

    public List<Sw> list();
}
