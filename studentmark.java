import java.util.Scanner;

interface Student {
  void getMarks();
}

interface Result {
  void displayResult();
}

class Grade implements Student, Result {
  String name;
  int python, cProg, maths, physics, chemistry, ethics;
  float total, aggregate;

  public void getMarks() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the student's name: ");
    name = input.nextLine();
    System.out.print("Enter the marks in python: ");
    python = input.nextInt();
    System.out.print("Enter the marks in c programming: ");
    cProg = input.nextInt();
    System.out.print("Enter the marks in Mathematics: ");
    maths = input.nextInt();
    System.out.print("Enter the marks in Physics: ");
    physics = input.nextInt();
    System.out.print("Enter the marks in Chemistry: ");
    chemistry = input.nextInt();
    System.out.print("Enter the marks in Professional Ethics: ");
    ethics = input.nextInt();
    input.close();
  }

  public void displayResult() {
    total = python + cProg + maths + physics + chemistry + ethics;
    aggregate = total / 6;
    System.out.println("Total= " + total);
    System.out.println("Aggregate = " + aggregate);
    if (aggregate > 75) {
      System.out.println("Class: DISTINCTION");
    } else if (aggregate > 60 && aggregate <= 75) {
      System.out.println("Class: FIRST DIVISION");
    } else if (aggregate > 50 && aggregate <= 60) {
      System.out.println("Class: SECOND DIVISION");
    } else if (aggregate > 40 && aggregate <= 50) {
      System.out.println("Class: THIRD DIVISION");
    } else {
      System.out.println("Class: FAIL");
    }
  }
}

public class studentmark {
  public static void main(String[] args) {
    Grade obj = new Grade();
    obj.getMarks();
    obj.displayResult();
  }
}
