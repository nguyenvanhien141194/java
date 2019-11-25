package practical1;

public class Student {
    public String StudentID;
    public String Name;
    public String Address;
    public String Phone;

    public Student(String studentID, String name, String address, String phone) {
        StudentID = studentID;
        Name = name;
        Address = address;
        Phone = phone;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
