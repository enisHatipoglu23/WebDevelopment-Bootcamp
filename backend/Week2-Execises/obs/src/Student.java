public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    // constant variable
    final int passNote = 55;
    // Constructor method
    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0;
        isPass = false;
    }
    // gets students note variables
    void addExamNote(int course1, int perf1, int course2, int perf2, int course3, int perf3){
        if(course1 >= 0 && course1 <= 100){
            this.course1.note = course1;
            this.course1.perfNote = perf1;
        }
        if(course2 >= 0 && course2 <= 100){
            this.course2.note = course2;
            this.course2.perfNote = perf2;
        }
        if(course3 >= 0 && course3 <= 100){
            this.course3.note = course3;
            this.course3.perfNote = perf3;
        }
    }
    // calculates average
    void calcAverage(){
        this.average = ((course1.calcResult())+(course2.calcResult()) + (course3.calcResult()))/3;
    }
    // prints users exam info's and their average
    void printNote(){
        System.out.println(course1.name + " Result's:\tExam: " + course1.note + "\tSpeaking: " + course1.perfNote + "\t Average of note's: " + course1.calcResult());
        System.out.println(course2.name + " Result's:\tExam: " + course2.note + "\tSpeaking: " + course2.perfNote + "\t Average of note's: " + course2.calcResult());
        System.out.println(course3.name + " Result's:\tExam: " + course3.note + "\tSpeaking: " + course3.perfNote + "\t Average of note's: " + course3.calcResult());
    }
    // checks if average greater than pass note
    void isPass(){
        calcAverage();
        if(this.average >= passNote){
            System.out.println("Your " + classes + "th grade average is " + this.average + ".");
            System.out.println("You have successfuly passed the grade !\nCongratulations!\n");
            isPass = true;
        }else{
            System.out.println("Sorry your result's are NOT enough to pass the grade.");
        }
        printNote();
    }
}
