package Business.Employee;

public class Employee {
    
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }
    
     @Override
    public String toString() {
        return name;
    }
    
    
}
