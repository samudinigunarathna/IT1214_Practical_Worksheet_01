class Shape{
    void area(){
        System.out.println("Area not Defined");
    }
}

class Circle extends Shape{
    double radius;

    void circle(double radius){
        this.area=area;
    }
}

class App{
    public static void main(String[] args){
        Circle.cir=new Circle();
        cir.circle();

    }
}