package Binary.search.tree;

import red.balanced.tree.RedBlackTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exe {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree<Integer, Student> students = new BinarySearchTree<Integer, Student>();

        try{
            File obj = new File("Global_University_Students.csv");
            Scanner scanner = new Scanner(obj);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String [] info = data.split(";");

                int studentID = Integer.parseInt(info[0]);
                String fullName = info[1];
                String dateOfBirth = info[2];
                String universityName = info[3];
                String departmentCode = info[4];
                String departmentName = info[5];
                int yearOfEnrollment = Integer.parseInt(info[6]);

                Student student = new Student(studentID, fullName, dateOfBirth, universityName, departmentCode, departmentName,yearOfEnrollment);
                students.put(studentID, student);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.print("Enter the ID of the student You want to retrieve: ");
        Scanner sc = new Scanner(System.in);
        int studentID = sc.nextInt();
        Student st = students.get(studentID);

        if(st != null) {
            System.out.println(st.toString());
            System.out.println("\nThe student was retrieved from the BST in " + students.steps + " steps");
        }
        else {
            System.out.println("The student with a given ID does not exist.");
            System.out.println("The search was completed in " + students.steps + " steps.");
        }
    }
}
