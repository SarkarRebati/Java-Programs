class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;
  
    public void printSalary(){
      System.out.println(salary);
    }
  
  }
  
  class Employee extends Member{
    String specialization;
  }
  
  class Manager extends Member{
    String department;
  }
  
  class Ans{
    public static void main(String[] args){
      Employee e = new Employee();
      e.name = "Rebati Sarkar";
      e.age = 23;
      e.number = "8927933854";
      e.address = "xyz";
      e.salary = 1234;
      e.specialization = "xyzxyz";
  
      Manager m = new Manager();
    }
  }									
