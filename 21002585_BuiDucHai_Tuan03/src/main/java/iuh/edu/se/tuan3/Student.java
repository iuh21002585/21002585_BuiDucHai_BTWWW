package iuh.edu.se.tuan3;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String dobDay;
    private String dobMonth;
    private String dobYear;
    private String email;
    private String mobile;
    private String gender;
    private String address;
    private String city;
    private String pincode;
    private String state;
    private String country;
    private List<String> hobbies;
    private String board10;
    private String percent10;
    private String year10;
    private String board12;
    private String percent12;
    private String year12;
    private String boardGrad;
    private String percentGrad;
    private String yearGrad;
    private String boardMasters;
    private String percentMasters;
    private String yearMasters;
    private String course;

    // Constructor mặc định
    public Student() {}

    // Constructor đầy đủ
    public Student(String firstName, String lastName, String dobDay, String dobMonth, String dobYear,
                   String email, String mobile, String gender, String address, String city,
                   String pincode, String state, String country, List<String> hobbies,
                   String board10, String percent10, String year10,
                   String board12, String percent12, String year12,
                   String boardGrad, String percentGrad, String yearGrad,
                   String boardMasters, String percentMasters, String yearMasters,
                   String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
        this.hobbies = hobbies;
        this.board10 = board10;
        this.percent10 = percent10;
        this.year10 = year10;
        this.board12 = board12;
        this.percent12 = percent12;
        this.year12 = year12;
        this.boardGrad = boardGrad;
        this.percentGrad = percentGrad;
        this.yearGrad = yearGrad;
        this.boardMasters = boardMasters;
        this.percentMasters = percentMasters;
        this.yearMasters = yearMasters;
        this.course = course;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDobDay() { return dobDay; }
    public void setDobDay(String dobDay) { this.dobDay = dobDay; }

    public String getDobMonth() { return dobMonth; }
    public void setDobMonth(String dobMonth) { this.dobMonth = dobMonth; }

    public String getDobYear() { return dobYear; }
    public void setDobYear(String dobYear) { this.dobYear = dobYear; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public List<String> getHobbies() { return hobbies; }
    public void setHobbies(List<String> hobbies) { this.hobbies = hobbies; }

    public String getBoard10() { return board10; }
    public void setBoard10(String board10) { this.board10 = board10; }

    public String getPercent10() { return percent10; }
    public void setPercent10(String percent10) { this.percent10 = percent10; }

    public String getYear10() { return year10; }
    public void setYear10(String year10) { this.year10 = year10; }

    public String getBoard12() { return board12; }
    public void setBoard12(String board12) { this.board12 = board12; }

    public String getPercent12() { return percent12; }
    public void setPercent12(String percent12) { this.percent12 = percent12; }

    public String getYear12() { return year12; }
    public void setYear12(String year12) { this.year12 = year12; }

    public String getBoardGrad() { return boardGrad; }
    public void setBoardGrad(String boardGrad) { this.boardGrad = boardGrad; }

    public String getPercentGrad() { return percentGrad; }
    public void setPercentGrad(String percentGrad) { this.percentGrad = percentGrad; }

    public String getYearGrad() { return yearGrad; }
    public void setYearGrad(String yearGrad) { this.yearGrad = yearGrad; }

    public String getBoardMasters() { return boardMasters; }
    public void setBoardMasters(String boardMasters) { this.boardMasters = boardMasters; }

    public String getPercentMasters() { return percentMasters; }
    public void setPercentMasters(String percentMasters) { this.percentMasters = percentMasters; }

    public String getYearMasters() { return yearMasters; }
    public void setYearMasters(String yearMasters) { this.yearMasters = yearMasters; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}


