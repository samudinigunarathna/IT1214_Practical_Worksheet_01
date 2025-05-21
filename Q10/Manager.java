class Employee{
    private String name;
    private int id;
    private double salary;

    void setEmployee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

        System.out.println(name+" "+id+" "+" "+salary);
    }

    void DisplayDetails(){
        
    }
}

class Manager extends Employee{

}

class App{
    public static void main(String[] args){
        
    }
}
