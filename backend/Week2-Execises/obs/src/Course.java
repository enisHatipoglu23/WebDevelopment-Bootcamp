public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int perfNote;
    double result;

    // Constructor method
    Course(String name, String code, String prefix, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.perfNote = 0;
        this.teacher = teacher;
    }
    double calcResult(){
        this.result = (this.note*0.8) + this.perfNote*0.2;
        return this.result;
    }
    // teacher checker method
    void addTeacher(){
        if(teacher.branch.equals(this.prefix)){
            System.out.println("Successfuly added !\nTeacher's Info: ");
            printTeacher();
        }else{
            System.out.println("This course's prefix is " + this.prefix + " please pay attention to teacher's branch ! ");
        }
    }

    // prints teacher if its suitable
    void printTeacher(){
        if(teacher != null){
            System.out.println("The professor of "+ this.name + " is " + teacher.name + ".");
        }else{
            System.out.println("Course doesn't has any teacher yet.");
        }
    }
}
















