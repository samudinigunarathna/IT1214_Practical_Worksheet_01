class Person{
    private String name;
    private int age;

    void setPerson(String name, int age){
        this.name=name;
        this.age=age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    void Display(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
}

class App{
    public static void main(String[] args){
    Person p1=new Person();
    p1.Display();    
    }
}