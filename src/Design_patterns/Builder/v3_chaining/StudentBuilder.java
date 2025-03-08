package Design_patterns.Builder.v3_chaining;

public class StudentBuilder {
    private String fName;
    private String lName;
    private int age;
    private String email;
    private int std;
    private String division;
    private int gradYear;
    private String city;

    public String getfName() {
        return fName;
    }

    public StudentBuilder setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public String getlName() {
        return lName;
    }

    public StudentBuilder setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getStd() {
        return std;
    }

    public StudentBuilder setStd(int std) {
        this.std = std;
        return this;
    }

    public String getDivision() {
        return division;
    }

    public StudentBuilder setDivision(String division) {
        this.division = division;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public String getCity() {
        return city;
    }

    public StudentBuilder setCity(String city) {
        this.city = city;
        return this;
    }
}