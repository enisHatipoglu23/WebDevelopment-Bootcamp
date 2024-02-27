public class Main {
    public static void main(String[] args) {
        // input examples
        Teacher teacher1 = new Teacher("İbrahim Atmaca", "5353535", "FM");
        Teacher teacher2 = new Teacher("Tuğçe Tezel", "505505", "IML");
        Teacher teacher3 = new Teacher("Volkan Kovan", "545545", "ML");

        Course course1 = new Course("Fluid Mechanics", "101", "FM",teacher1);
        Course course2 = new Course("Manufacturing Methods", "101", "IML",teacher2);
        Course course3 = new Course("Machine Elements", "101", "ML",teacher3);

        System.out.println("*****\n");
        course1.addTeacher();
        System.out.println("*****\n");
        course2.addTeacher();
        System.out.println("*****\n");
        course3.addTeacher();
        System.out.println("*****\n");

        Student student1 = new Student("Enis Hatipoğlu", "116", "4", course1,course2,course3);
        student1.addExamNote(60, 55, 70,45,85,40);
        student1.isPass();


    }
}