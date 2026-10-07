package pembelajaran_01;

public class student {
   
    private Integer NPM;
    private String Fullname;
    private String ClassName;
    private Integer Semester;
    private Float GPA;

    public Integer getNPM(Integer value) {
        this.NPM = value;
        return NPM;
    }

    public String getFullname(String value) {
        this.Fullname = value;
        return Fullname;
    }

    public String getClassName(String value) {
        this.ClassName = value;
        return ClassName;
    }

    public Integer getSemester(Integer value) {
        this.Semester = value;
        return Semester;
    }

    public Float getGPA(Float value) {
        this.GPA = value;
        return GPA;
    }
}