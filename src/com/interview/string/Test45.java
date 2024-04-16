package com.interview.string;

import java.util.*;
import java.util.stream.Collectors;

public class Test45 {
    public static void main(String[] args) {
        System.out.println("Hello");

        List<Emp41> e1 = new ArrayList<>();
        e1.add(new Emp41(1, 20.00 , "A"));
        e1.add(new Emp41(2, 10.00, "B"));
        e1.add(new Emp41(3, 230.00, "c"));
        e1.add(new Emp41(4, 80.00,"d"));
        e1.add(new Emp41(5, 50.00, "E"));

        findEmpSalaryDESC(e1);
        convertToMapAndSortBasedONSalary(e1);

    }

    private static void convertToMapAndSortBasedONSalary(List<Emp41> e1) {
        Map<Integer, Emp41> map = e1.stream().collect(Collectors.toMap(Emp41::getId , e->e));


        Map<Integer, Emp41> map1 =       map .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Emp41::getSalary).reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new));


        map1.forEach((id, E) -> System.out.println(id+ "   "+E));
    }

    private static void findEmpSalaryDESC(List<Emp41> e1) {

        List<Emp41> list =
                e1.stream()
                        .sorted(Comparator.comparingDouble(Emp41::getSalary).reversed())
        .collect(Collectors.toList());

        System.out.println(list);
    }
}

class Emp41{

    private int id;
    private double salary;
    private String name;

    @Override
    public String toString() {
        return "Emp41{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emp41(int id, double salary) {
        this.id = id;

        this.salary = salary;
    }

    public Emp41(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
/*

// emp , name , id salary

@RestController
@RequestMapping("/employees")
class EmpCURDController{

    @Autowired
    private EmpCURDService empCURDService;


    public ResponseEntity<List<EmpCURD>> getAllEmp(){

        List<EmpCURD> empCURDS = empCURDService.getAllEmp();
        return new ResponseEntity<>(empCURDS, HttpStatus.OK);
    }

    @GetMapping("/{empId}")
    public ResponseEntity<EmpCURD> getEmpById(@PathVariable(empId) int empId ){

       Optional<EmpCURD> empCURDOptional = empCURDService.getEmpById(empId);
       if(empCURDOptional.isPresent())
       return new ResponseEntity<>()
    }

}


class EmpCURD {

    private int id ;
    private String name;
    private Double salary;

    public EmpCURD(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

interface EmpCURDRepo extends JPARepository<EmpCURD , Integer>

class EmpCURDService{

}


*/
