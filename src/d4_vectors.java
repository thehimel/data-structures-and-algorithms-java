//https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html

import java.util.List;
import java.util.Objects;
import java.util.Vector;

class Emp {
    private String firstName;
    private String lastName;
    private int id;

    //Generate Constructor
    public Emp(String firstName, String lastName, int id) {
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
        Emp emp = (Emp) o;
        return id == emp.id &&
                firstName.equals(emp.firstName) &&
                lastName.equals(emp.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }
}

public class d4_vectors {
    public static void main(String[] args){
        List<Emp> empList = new Vector<>();
        empList.add(new Emp("Jane", "Jones", 123));
        empList.add(new Emp("John", "Doe", 4567));
        empList.add(new Emp("Mary", "Smith", 22));
        empList.add(new Emp("Mike", "Wilson", 3245));

        //using lambda for printing in a loop
        //employeeList.forEach(employee -> System.out.println(employee));

        //using method reference for printing in a loop
        //employeeList.forEach(System.out::println);

        //get item at index 1
        System.out.println(empList.get(1));

        //check whether the list is empty
        System.out.println(empList.isEmpty());

        //replace the element at index 1
        empList.set(1, new Emp("John", "Adams", 4568));

        //employeeList.forEach(System.out::println);

        //print the size of the list
        System.out.println(empList.size());

        //add an item at the index 3. Others will shift and create room for the new item.
        empList.add(3, new Emp("John", "Doe", 4567));


        //remove item at index 4
        empList.remove(4);

        /*
        check whether the list contains the element or not implementing equals() and hashCode().
        Won't work without equals() and hashCode().
         */
        System.out.println(empList.contains(new Emp("Mary", "Smith", 22)));

        //converting ArrayList to Employee array
        Emp[] empArray = empList.toArray(new Emp[empList.size()]);
        for(Emp emp : empArray){
            System.out.println(emp);
        }
    }
}
