import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee{
    private String firstName;
    private String lastName;
    private int id;

    //Generate Constructor
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //Generate Getter and Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Generate toString() for printing nicely
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    //Generate equals() and hashCode() to perform contains() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }
}

public class d3_arrray_lists {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //using lambda for printing in a loop
        //employeeList.forEach(employee -> System.out.println(employee));

        //using method reference for printing in a loop
        //employeeList.forEach(System.out::println);

        //get item at index 1
        System.out.println(employeeList.get(1));

        //check whether the list is empty
        System.out.println(employeeList.isEmpty());

        //replace the element at index 1
        employeeList.set(1, new Employee("John", "Adams", 4568));

        //employeeList.forEach(System.out::println);

        //print the size of the list
        System.out.println(employeeList.size());

        //add an item at the index 3. Others will shift and create room for the new item.
        employeeList.add(3, new Employee("John", "Doe", 4567));


        //remove item at index 4
         employeeList.remove(4);

        /*
        check whether the list contains the element or not implementing equals() and hashCode().
        Won't work without equals() and hashCode().
         */
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        //converting ArrayList to Employee array
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }
    }
}
