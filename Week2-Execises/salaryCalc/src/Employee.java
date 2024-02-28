public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(){

    }
    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax(){
        if(this.salary >= 0){
            if(this.salary < 1000){
                System.out.println("no tax for this this amount of salary. ");
            }
        }

    }
}
