import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GradeCalculator {
    Scanner sc = new Scanner(System.in);
    void calc() {
        //using scanner class to get user info


        System.out.println("Student ID:");
        String studentId = sc.nextLine();

        Map<String, Double> points = new HashMap<>();
        Map<String, Integer> credits = new HashMap<>();


        //getting lesson number for "for loop".
        System.out.println("How many lessons do you have? ");
        int lessonsNum = sc.nextInt();

        for (int i = 1; i <= lessonsNum; i++) {

            //get lessons name, points and credits from user.
            System.out.println(i + ". Lesson: ");
            String lesson = sc.next();

            //user's midTerm exam %40
            System.out.println(lesson + " mid-term result: ");
            double midTerm = sc.nextDouble() * 0.4;

            //user's final exam %60
            System.out.println(lesson + " final result: ");
            double finalE = sc.nextDouble() * 0.6;


            System.out.println(lesson + " total point: ");
            double point = midTerm + finalE;
            System.out.println(point);

            System.out.println(lesson + " lesson's credit: ");
            int credit = sc.nextInt();

            points.put(lesson, point);
            credits.put(lesson, credit);
        }

        //printing user input.
        System.out.println("Lessons, Points, Credits, GNO...");
        System.out.println("------------------------");
        System.out.println(studentId);

        int totalCredits = 0;
        double letterPoints = 0;
        String gradeToLetter = null;
        double gno = 0;

        //creating output by pulling the variables(lesson, point, credit) we added to the Map<>
        for (Map.Entry<String, Double> entry : points.entrySet()) {

            String lessonName = entry.getKey();
            double point = entry.getValue();
            int credit = credits.get(lessonName);
            totalCredits += credit;

            //calculating user's letter grade according to exam points.
            if (point >= 90 && point <= 100) {
                gradeToLetter = "AA";
                letterPoints = 4.0;
            }
            if (point >= 80 && point < 90) {
                gradeToLetter = "AB";
                letterPoints = 3.50;
            }
            if (point >= 75 && point < 80) {
                gradeToLetter = "BB";
                letterPoints = 3.0;
            }
            if (point >= 65 && point <= 75) {
                gradeToLetter = "BC";
                letterPoints = 2.50;
            }
            if (point >= 60 && point < 65) {
                gradeToLetter = "CC";
                letterPoints = 2.00;
            } else if (point < 60) {
                gradeToLetter = "FF";
                letterPoints = 0.00;
            }

            gno += letterPoints * credit;

            //printing all the info we need.
            System.out.println("Lesson name: " + lessonName + "\n" +
                    lessonName + "'s point: " + point + "\n" + lessonName + "'s credit: "
                    + credit + "\n" + lessonName + "'s grade: " + gradeToLetter +
                    "\n" + lessonName + "'s grade: " + letterPoints);

            System.out.println("***");
        }

        System.out.println("GNO: " + gno / totalCredits);
        sc.close();


    }

}