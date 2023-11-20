package ProxyPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try {
            EmployeeDao empTable = new EmployeeDaoProxy();
            empTable.create("ADMIN", new EmployeeDo());
            System.out.println("Operations Success.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
