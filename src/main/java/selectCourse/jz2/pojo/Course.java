package selectCourse.jz2.pojo;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_course")
public class Course {
    private int id;
    private String name;
    private int credit;
    private int classHour;
    private String week;
    private String time;
    private Classroom classroom;
    private Teacher teacher;
    private Set<StudentCourse> studentCourses;

    public Course() {
    }

    public Course(int id, String name, int credit, int classHour, String week, String time, Classroom classroom, Teacher teacher, Set<StudentCourse> studentCourses) {
        super();
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.classHour = classHour;
        this.week = week;
        this.time = time;
        this.classroom = classroom;
        this.teacher = teacher;
        this.studentCourses = studentCourses;
    }

    public Course(int id, String name, int credit, int classHour, Classroom classroom, Teacher teacher, Set<StudentCourse> studentCourses) {
        super();
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.classHour = classHour;
        this.classroom = classroom;
        this.teacher = teacher;
        this.studentCourses = studentCourses;
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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getClassHour() {
        return classHour;
    }

    public void setClassHour(int classHour) {
        this.classHour = classHour;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @ManyToOne()
    @JoinColumn(name = "classid")
    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @ManyToOne()
    @JoinColumn(name = "tid")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @OneToMany(mappedBy = "course")
    @LazyCollection(LazyCollectionOption.EXTRA)
    public Set<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", classHour=" + classHour +
                '}';
    }
}
