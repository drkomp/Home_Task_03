/**
 * Created by drkomp on 24.09.2016.
 */
public class CollegeStudent extends Student {
    private int year;
    private String major;

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString()+", year:"+year+", major:"+major;
    }
}
