class Shape{
    double area;
    private double radius;

    void area(){
        System.out.println("Area not Defined");
    }
}

class Circle extends Shape{
    double radius;

    void circle(double radius, double area){
        this.radius=radius;
        this.area=area;
        System.out.println(radius);
    }

    void area(){
        area= radius*3.14;
        System.out.println("The Area of The Circle is "+area);
    }
}

class App{
    public static void main(String[] args){
        Circle cir=new Circle();
        cir.circle(7,0);
        cir.area();

    }
}