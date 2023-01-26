public class Employee {
    int EmpId;
    int Salary;
    String dept;
    
    Employee(int empId, int sal, String dep){
        EmpId = empId;
        Salary = sal;
        dept = dep;
    }
    public static void main(String args[]) {
        Employee harsha = new Employee(101, 3000, "Testing");
        Employee varsha = new Employee(102, 5000, "Engineering");

        System.out.println("EmpId " + harsha.EmpId + " Salary " + harsha.Salary + " Dept " + harsha.dept);
        System.out.println("EmpId " + varsha.EmpId + " Salary " + varsha.Salary + " Dept " + varsha.dept);
    }
}