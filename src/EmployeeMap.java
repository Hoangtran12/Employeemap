import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    private Map<Integer, Employee> employeeMap;
    
    public EmployeeMap() {
        employeeMap = new HashMap<>();
    }
    
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }
    
    public Employee findEmployeeById(int id) {
        return employeeMap.get(id);
    }
}