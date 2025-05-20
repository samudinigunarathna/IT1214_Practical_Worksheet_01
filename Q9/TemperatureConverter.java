class TemperatureConverter{
    private double celsius;
    private double fahrenheit;

    void toCelsius(double fahrenheit){
        this.fahrenheit=fahrenheit;
        celsius=(fahrenheit - 32)*5/9;

        System.out.println("Celsius "+celsius);
    }

    double getCelsius(){
        return celsius;
    }

    void toFahrenheit(double celsius){
        this.celsius=celsius;
        fahrenheit= (celsius*9/5)*32;

        System.out.println("Fahrenheit "+fahrenheit);

    }

    double getFahrenheit(){
        return fahrenheit;
    }
}

class App{
    public static void main(String[] args){
        TemperatureConverter tempconv=new TemperatureConverter();
        tempconv.toCelsius(90);
        tempconv.toFahrenheit(73);
    }
}