package Binary.search.tree;

public class Student {
    int StudentID;
    String fullName;
    String dateOfBirth;
    String universityName;
    String departmentCode;
    String departmentName;
    int yearOfEnrollment;


    public Student(int studentID, String fullName, String dateOfBirth, String universityName, String departmentCode, String departmentName, int yearOfEnrollment) {
        this.StudentID = studentID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.universityName = universityName;
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.yearOfEnrollment = yearOfEnrollment;
    }

    @Override
    public String toString() {
        return "Student ID: " + StudentID +
                "\nName and surname: " + fullName +
                "\nDate of birth: " + dateOfBirth +
                "\nUniversity: " + universityName +
                "\nDepartment code: " + departmentCode +
                "\nDepartment: " + departmentName +
                "\nYear of enrollment: " + yearOfEnrollment;
    }
}
