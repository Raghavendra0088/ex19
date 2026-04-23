public class Grade {

  static char gradeFunction(double avg) {
    if (avg >= 90) return 'A';
    else if (avg >= 80) return 'B';
    else if (avg >= 70) return 'C';
    else if (avg >= 60) return 'D';
    else return 'F';
  }

  public static void main(String[] args) {

    if (args.length < 1 || args.length > 5) {
      System.out.println("Provide 1 to 5 grades as arguments.");
      return;
    }

    double sum = 0.0;

    for (String arg : args) {
      double grade = Double.parseDouble(arg);
      sum += grade;
    }

    double avg = sum / args.length;
    System.out.println("Average: " + avg);
    System.out.println("Letter grade: " + gradeFunction(avg));
  }
}
