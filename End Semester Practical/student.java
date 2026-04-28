@Entity
@Table(name="students")
public class Student{
    @ID
    @GeneratedValue(stratergy=GenerationType.IDENTITY)
    private long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email", unique = true, nullable = false)
    private String email;

    @Column(name="course")
    private String course;

    public Student(String name, String email, String course){
        this.name=name;
        this.email=email;
        this.course=course;
    }

    public long getID(){return id;}
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
