class Book{
    private String name;
    private String author;
    private double price;

    void setBook(String name, String author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
        System.out.println(name+" "+author+" "+price);
    }
}

class App{
    public static void main(String[] args){
        Book bo=new Book();
        bo.setBook("Harry Potter","J.K.Rowling",1600);
    }
}