public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    int recentYear;
    double taxAmount;
    double bonusAmount;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.recentYear = 2024;
        this.taxAmount = 0;
        this.bonusAmount = 0;
    }
    void tax(){
        if(this.salary >= 0){
            if(this.salary < 1000){
                System.out.println("No tax for this this amount of salary. ");
            }else{
                this.taxAmount = this.salary*0.03;
                System.out.println("Salary:\t" + this.salary + " ₺\nTax:\t" + this.taxAmount + " ₺");
            }
        }else{
            System.out.println("Invalid input. Please enter positive value. ");
        }
    }
    // calculating bonus amount accourding to work hours.
    void bonus(){
        double extraHours;
        double pricePerExtraHours = 30;
        if(this.workHours>40){
            extraHours = this.workHours - 40;
            this.bonusAmount = pricePerExtraHours * extraHours;
            System.out.println("Your weekly bonus amount is " + this.bonusAmount + " ₺ ");
        }else{
            System.out.println("You didn't work extra this week. ");
        }
    }
    // calculating raise according to specifications
    void raiseSalary(){
        int yearCalc = recentYear - hireYear;
        if (yearCalc < 10) {
            System.out.println("Raise :\t" + this.salary*0.05);
            this.salary += this.salary*0.05;
        }
        if(yearCalc > 9 && yearCalc < 20){
            System.out.println("Raise :\t" + this.salary*0.1);
            this.salary += this.salary*0.1;
        }
        if (yearCalc > 19) {
            System.out.println("Raise :\t" + this.salary*0.15);
            this.salary += this.salary*0.15;
        }
    }
    // printing results
    void tosString(){
        System.out.println("Name :\t" + this.name);
        tax();
        System.out.println("Work Hours :\t" + this.workHours);
        System.out.println("Hire Year :\t" + this.hireYear);
        bonus();
        raiseSalary();
        this.salary += this.bonusAmount - this.taxAmount;
        System.out.println("Total Salary :\t" + this.salary + " ₺ ");

    }
}
