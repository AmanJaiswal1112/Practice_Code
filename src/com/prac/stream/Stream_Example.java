package com.prac.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_Example {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList = addObject();

        //Group the Employees by city
        Map<String, List<Employee>> city = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(city);

        //Find the count of male and female employees present in the organization.
        Map<String, Long> map = empList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
        System.out.println(map);

        //Print the names of all departments in the organization.
        List<String> deptName = empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());
        System.out.println(deptName);

        //Find maximum age of employee.
        OptionalInt max = empList.stream().mapToInt(Employee::getAge).max();
        if (max.isPresent())
            System.out.println("Maximum age of Employee: " + max.getAsInt());

        // Print Average age of Male and Female Employees.
        Map<String, Double> avgAge = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAge);

        //Print the number of employees in each department.
        Optional<Employee> oldestEmp = empList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmp.get();
        System.out.println("Oldest employee details:: \n" + oldestEmployee);

        // Find youngest female employee.
        Optional<Employee> employeeOptional = empList.stream().filter(e -> e.getGender().equals("F")).min(Comparator.comparingInt(Employee::getAge));
        Employee yongestEmployee = employeeOptional.get();
        System.out.println("Yongest employee details:: \n" + yongestEmployee);

        //Find the department name which has the highest number of employees.
        Map<String, Long> maxNoOfEmployeesInDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(maxNoOfEmployeesInDept);

        Map.Entry<String, Long> a = maxNoOfEmployeesInDept.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Max no of employees present in Dept :: " + a.getValue());

        //Find if there any employees from HR Department.
        Optional<Employee> stringOptional =empList.stream().filter(e->e.getDeptName() == "HR").findAny();
        if(stringOptional.isPresent())
            System.out.println("Find if there any employees from HR Department"+stringOptional.get());

        // Find the department names that these employees work for, where the number of employees in the department is over 3.
        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue() >3).collect(Collectors.toList()).forEach(System.out::println);

        //Sorting a Stream by age and name fields.
        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        Comparator<Employee> ageComparator = Comparator.comparingInt(Employee::getAge);
        Comparator<Employee> idComparator = Comparator.comparingInt(Employee::getId);

        empList.stream().sorted(nameComparator.thenComparing(ageComparator)).forEach(System.out::println);
      //  empList.stream().sorted(idComparator).forEach(System.out::println);
        //Highest experienced employees in the organization.
        Optional<Employee> optional = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        if(optional.isPresent())
            System.out.println(optional.get());


        //Find Second Highest salary in the organisation.
        Optional<Employee> emp2 =   empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println("Highest Salary in the organisation : " + emp2.get().getSalary());

        //Nth Highest salary.
        int n = 2;// this can be any nth number highest salary
        Optional<Employee> emp3 = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed()).skip(n-1).findFirst();
        System.out.println("Second Highest Salary in the organisation : " + emp3.get().getSalary());



    }

    private static List<Employee> addObject() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
        return empList;
    }
}



class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;

    public Employee(int id, String name, int age, long salary, String gender,
                    String deptName, String city, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
}