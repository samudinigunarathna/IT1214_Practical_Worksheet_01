class Vehicle{
    String color="Red";
    int seats=4;

    void Display(){
        System.out.println("color of the vehicle "+color+" No of seats "+seats);
    }
}

class Car extends Vehicle{
    String model="Corolla";

    void Display(){
        System.out.println("Model of the car "+model+ " Color of the car "+color+" No of seats "+seats);
    }
}

class App{
    public static void main(String[] args){
        Vehicle vehi = new Vehicle();
        Car car= new Car();
        
        vehi.Display();
        car.Display();
    } 
}