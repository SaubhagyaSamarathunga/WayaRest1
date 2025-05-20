
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= input.nextLine();
        
        System.out.println("Enter Age: ");
        int age = input.nextInt();
        
        System.out.println("Enter Grade Level: ");
        int gradelevel = input.nextInt();
        
        System.out.println("Input major: ");
        String major = input.nextLine();
        
        Student obj1 = new Student(name, age);
        obj1.attendClasses();
        obj1.displayInfo();
        obj1.study();
        
        HighSchoolStudents obj2 = new HighSchoolStudents(name, age, gradelevel);
        obj2.study();
        obj2.attendProm();
        
        CollegeStudents obj3 = new CollegeStudents(name, age, major);
        obj3.study();
        obj3.research();
    }
}
