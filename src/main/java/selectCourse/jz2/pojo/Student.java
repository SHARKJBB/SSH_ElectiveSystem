package selectCourse.jz2.pojo;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_student")
public class Student {
    private int id;
    private String name;
    private String password;
    private String num;//学生登录用户名，即学生工号
    private String sex;
    private Set<StudentCourse> studentCourse;

    public Student() {
    }

    public Student(String name, String password, String num, String sex, Set<StudentCourse> studentCourse) {
        super();
        this.name = name;
        this.password = password;
        this.num = num;
        this.sex = sex;
        this.studentCourse = studentCourse;
    }

    public Student(int id, String name, String password, String num, String sex, Set<StudentCourse> studentCourse) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.num = num;
        this.sex = sex;
        this.studentCourse = studentCourse;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @OneToMany(mappedBy = "student")
    @LazyCollection(LazyCollectionOption.EXTRA)
    public Set<StudentCourse> getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(Set<StudentCourse> studentCourse) {
        this.studentCourse = studentCourse;
    }
}
