/*. Employee Management:
 Create a class named Employee with attributes like name, ID, and salary.
 Create subclasses for Manager, Developer, and Tester inheriting from Employee.
 Add specific attributes and methods for each subclass (e.g., bonus for Manager, 
projectsHandled for Developer).
 Calculate the total salary for all employees, considering any bonuses or allowances. */

class Employee{
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("salary: " + salary + "$");
    }


}

class Manager extends Employee{
    int bonus;

    public Manager(String name, int id, int salary, int bonus){
        super(name,id,salary);
        this.bonus = bonus;
    }

    public int addSalary(){
        bonus =+ salary;
        return salary;
    } 

    public void displayInfo(){
        super.displayInfo();
        salary += bonus;
        System.out.println("Total Salary:  "+ salary);
    }
}

class Developer extends Employee{
    Boolean projectsHandled;

    public Developer(String name, int id, int salary, boolean projectsHandled){
        super(name, id, salary);
        this.projectsHandled = projectsHandled;

    }

    public boolean projectAssigned(){
        return true;

    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Project Assigned:  "+ projectsHandled);
    }
}



public class EmployeeManagement {
    public static void main(String[] args) {
        Employee [] employees = new Employee[2];

        employees[0] = new Manager("Ali", 22, 10, 2);
        employees[1] = new Developer("sam", 2, 5, true);

        for (Employee employee : employees) {

            employee.displayInfo();            
        }
    }
}
