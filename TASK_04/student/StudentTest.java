package TASK_3.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        student1.setRollNum(1);
        student1.setStudent_Name("Akash");
        student1.setCourse_Name("Git Advance");
        student1.setMarks1(80);
        student1.setMarks2(70);
        student1.setMarks3(90);
        
        student2.setRollNum(2);
        student2.setStudent_Name("Sakshi");
        student2.setCourse_Name("Git Basics");
        student2.setMarks1(60);
        student2.setMarks2(70);
        student2.setMarks3(80);
        
        student3 = new Student();
        student3.setRollNum(3);
        student3.setStudent_Name("Harshita");
        student3.setCourse_Name("Python");
        student3.setMarks1(30);
        student3.setMarks2(20);
        student3.setMarks3(16);
        
        student4.setRollNum(6);
        student4.setStudent_Name("Akansha");
        student4.setCourse_Name("visual Basics");
        student4.setMarks1(55);
        student4.setMarks2(65);
        student4.setMarks3(75);
        
        student5.setRollNum(7);
        student5.setStudent_Name("Anurag");
        student5.setCourse_Name("Mastering JavaScript");
        student5.setMarks1(70);
        student5.setMarks2(75);
        student5.setMarks3(80);
        
        System.out.println(student1);
        System.out.println(student1.calculateGrade());
        System.out.println(student2);
        System.out.println(student2.calculateGrade());
        System.out.println(student3);
        System.out.println(student3.calculateGrade());
        System.out.println(student4);
        System.out.println(student4.calculateGrade());
        System.out.println(student5);
        System.out.println(student5.calculateGrade());
    }
}
