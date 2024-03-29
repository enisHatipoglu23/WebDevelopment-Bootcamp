public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    int recentYear;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.recentYear = 2024;
    }
    double tax(){
            double taxAmount = 0;
            if(this.salary > 0 && this.salary < 1000){
                System.out.println(this.salary + "₺ no tax for this this amount of salary. ");return taxAmount;
            }else if(this.salary>1000){
                taxAmount = this.salary*0.03;
            }else{
                System.out.println("invalid input");
            }
            return taxAmount;
    }
    // calculating bonus amount according to work hours.
    double bonus(){
        double extraHours,pricePerExtraHours = 30;
        if(this.workHours>40){
            extraHours = this.workHours - 40;
            return pricePerExtraHours * extraHours;
        }else{
            System.out.println("You didn't work extra this week. "); return 0;
        }
    }
    // calculating raise according to specifications
    double raiseSalary(){
        int yearCalc = recentYear - hireYear;
        if (yearCalc < 10) {
            return this.salary*0.05;
        }else if(yearCalc > 9 && yearCalc < 20){
            return this.salary*0.1;
        }else if (yearCalc > 19) {
            return this.salary*0.15;
        }
        return 0;
    }
    // printing results
    String toString(Employee employee){
        if(this.salary<=0){
            System.out.println("Please enter a valid input. Salary can NOT be negative or zero. ");
        }else{
            System.out.println("Name :\t" + this.name + "\nWork Hours :\t" + this.workHours + "\nHire Year :\t" + this.hireYear);
            System.out.println("Tax: " + this.tax() + "₺\tBonus: " + this.bonus() + "₺\tRaise: " + this.raiseSalary()+"₺");
            this.salary += this.raiseSalary() + this.bonus() - this.tax();
            System.out.println("Total Salary :\t" + this.salary + " ₺ ");
        }
        return null;
    }
}
