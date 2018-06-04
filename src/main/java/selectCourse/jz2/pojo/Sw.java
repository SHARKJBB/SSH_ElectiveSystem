package selectCourse.jz2.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_switch")
public class Sw {
    private int id;
    private boolean flag;

    public Sw(int id, boolean flag) {
        this.id = id;
        this.flag = flag;
    }

    public Sw() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
