package package01;

public class Main {
  public static void main(String[] args) {
    var teacher = new Person();
    teacher.age = 33;
    teacher.name = "Alejandro";
    teacher.gender = "M";
    teacher.heigth = 1.73f;

    teacher.walk();

    var student = new Person();
    student.age = 20;
    student.name = "Sebastian";
    student.heigth = 1.72f;
    student.gender = "M";

    student.walk();

    System.out.println("Teacher name is: " + teacher.name);
    System.out.println("Student name is: " + student.name);
    System.out.println("Teacher heigth is: " + teacher.heigth);
    System.out.println("Student heigth is: " + student.heigth);
  }
}
