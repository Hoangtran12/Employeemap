public class EmployeeMapDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(9782, "Lee Brice");
        Employee emp2 = new Employee(3543, "Kane Brown");
        Employee emp3 = new Employee(3683, "Luke Comb");  
        
        EmployeeMap empMap = new EmployeeMap();
        empMap.addEmployee(emp1);
        empMap.addEmployee(emp2);
        empMap.addEmployee(emp3);
        
        Employee foundEmp = empMap.findEmployeeById(9782);
        System.out.println(foundEmp.getName()); 
        
        foundEmp = empMap.findEmployeeById(3543);
        System.out.println(foundEmp.getName());
        
        foundEmp = empMap.findEmployeeById(3683);
        System.out.println(foundEmp.getName());
    }
}