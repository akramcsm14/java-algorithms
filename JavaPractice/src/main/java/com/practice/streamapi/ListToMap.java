package com.practice.streamapi;


import java.util.*;

public class ListToMap {
    public static void main(String[] args) {

        List<Employee> list = getEmployeeList();

        //
        /** Using Stream
         * Create map of employee lastName (caseInsensitive) and list of employees
         * Name: samson ==>[Employee [firstName=Mary, lastName=Samson, doj=Sat Jan 17 19:13:58 UTC 1970]]
         Name: johny ==>[Employee [firstName=Johny, lastName=Johny, doj=Sun Jan 18 17:07:15 UTC 1970]]
         Name: curtis ==>[Employee [firstName=Martin, lastName=Curtis, doj=Sun Jan 18 06:53:49 UTC 1970], Employee [firstName=Mary, lastName=CURTIS, doj=Sun Jan 18 06:53:49 UTC 1970]]
         Name: "" ==>[Employee [firstName=John, lastName=null, doj=01 Jan 2016 09:00:00 GMT]]
         */
        Map<String, Set<Employee>> mp = new HashMap<>();
        list.stream().map(emp->{
            mp.computeIfAbsent(Optional.ofNullable(emp.getLastName()).orElse("").toLowerCase(), s->new HashSet<Employee>());
            return emp;
        }).forEach(emp -> mp.computeIfPresent(Optional.ofNullable(emp.getLastName()).orElse("").toLowerCase(), (key, val) -> {
            val.add(emp);
            return mp.get(Optional.ofNullable(emp.getLastName()).orElse("").toLowerCase());
        }));
        System.out.println(mp);

    }

    private static List<Employee> getEmployeeList() {

        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("Johny", "Johny", 3, new Date(1530435600)); // 01 Jul 2018 09:00:00 GMT
        Employee e2 = new Employee("Martin", "Curtis", 10, new Date(1493629200)); // 01 may 2017 09:00:00 GMT
        Employee e3 = new Employee("Mary", "CURTIS", 3, new Date(1493629200)); // 01 may 2017 09:00:00 GMT
        Employee e4 = new Employee("Mary", "Samson", 7, new Date(1451638800)); // 01 Jan 2016 09:00:00 GMT
        Employee e5 = new Employee("John", null, 2, new Date(1451638800)); // 01 Jan 2016 09:00:00 GMT

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);


        return employeeList;
    }

}

class Employee {
    private final String firstName;
    private final String lastName;
    private final int prevExperience;
    private final Date doj;

    public Employee(String firstName, String lastName, int prevExperience, Date doj) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.prevExperience = prevExperience;
        this.doj = doj;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPrevExperience() {
        return prevExperience;
    }

    public Date getDoj() {
        return doj;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", doj=" + doj + "]";
    }
}

