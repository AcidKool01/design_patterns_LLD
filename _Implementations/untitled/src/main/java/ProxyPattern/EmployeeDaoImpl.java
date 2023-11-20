package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        // creates a new table
        System.out.println("created new row in the EMPLOYEE table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        // delete a row
        System.out.println("Deleted the row with id: " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        // fetch row;
        System.out.println("Fetching the data from DB");
        return new EmployeeDo();
    }
}
