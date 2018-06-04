package selectCourse.jz2.pojo;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "t_classroom")
public class Classroom {
    private int id;
    private String name;
    private Set<Course> courses;

    @OneToMany(mappedBy = "classroom")
    @LazyCollection(LazyCollectionOption.EXTRA)
    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Classroom() {
    }

    public Classroom(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
