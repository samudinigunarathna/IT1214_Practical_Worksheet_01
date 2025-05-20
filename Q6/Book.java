class Book{
    private String name;
    private String Author;
    private double price;

    void setBook(String name, String author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
        System.out.println("Harry Potter","J.K.Rowling",1600);
    }
}

class App{
    public static void main(String[] args){
        Book book=new Book();

    }
}