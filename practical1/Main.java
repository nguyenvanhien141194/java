package practical1;

import Labsession7.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean p = true;
        ArrayList<Student> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (p) {
            System.out.println("1. Add student");
            System.out.println("2. Display student");
            System.out.println("3. Save");
            System.out.println("4. Exit");
            int opt = sc.hasNextInt() ? sc.nextInt() : 4;
            switch (opt) {
                case 1:
                    List.add(Main.addStudent());
                    break;

            }
        }
    }

    public static Student addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập StudentID :");
        String StudendID = sc.nextLine();
        sc.nextLine();
        System.out.println("nhập name :");
        String Name = sc.nextLine();
        System.out.println("nhập Address :");
        String Address = sc.nextLine();
        System.out.println("nhập Phone :");
        String Phone = sc.nextLine();
        return new Student (StudendID,Name,Address,Phone);

    }
   public static void  editStudent(ArrayList<Student>List){

   }
}
