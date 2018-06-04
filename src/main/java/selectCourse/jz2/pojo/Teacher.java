package selectCourse.jz2.pojo;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_teacher")
public class Teacher {
    private int id;
    private String username;//教师登录用户名，即教师工号
    private String password;
    private String name;
    private String email;
    private String major;
    private Set<Course> courses;

    @OneToMany(mappedBy = "teacher")
    @LazyCollection(LazyCollectionOption.EXTRA)
    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Teacher() {
    }

    public Teacher(int id, String username, String password, String name, String email, String major) {
        super();    this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.major = major;
    }

    public Teacher(String username, String password, String name, String email, String major) {
        super();   this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.major = major;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
