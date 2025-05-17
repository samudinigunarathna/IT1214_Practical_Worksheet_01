class Rectangle{
	private int width=6;
	private int length=10;
	
	void Rectangle(int width, int length){
		this.width=width;
		this.length=length;
	}
	void Rectangle(){
	}
	
	int Area(){
		int area=width*length;
		return area;
	}
}

class App{
	public static void main(String[] args){
		Rectangle rec=new Rectangle();
		System.out.println("Area of the Rectangle is "+rec.Area());
	}
}