class Calculator{

    double Add(int a, int b){
        return (a + b);
    }
    double Add(double a, double b){
        return (a + b);
    }
    double Add(int a, int b, int c){
        return (a + b + c);
    }
}

class App{
    public static void main(String[] args){
        Calculator cal=new Calculator();
        System.out.println(cal.Add());
    }
}