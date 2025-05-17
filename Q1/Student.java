class Student{
	private String name;
	private int reg_No;
	private String course;
	
	void Student(String name,int reg_No,String course){
		this.name=name;
		this.reg_No=reg_No;
		this.course=course;
	}
	
	void SetName(String name){
		this.name=name;
	}
	void DisplayName(){
		System.out.println(name);
	}
	void SetReg_No(int reg_No){
		this.reg_No=reg_No;
	}
	void DisplayReg_No(){
		System.out.println(reg_No);
	}
	void setCourse(String course){
		this.course=course;
	}
	void DisplayCourse(){
		System.out.println(course);
	}
	
	String GetName(){
		return name;
	}
	int GetReg_No(){
		return reg_No;
	}
	String GetCourse(){
		return course;
	}
	void Display(){
		System.out.println(name+" "+reg_No+" "+course);
	}
}

class App{
	public static void main(String[] args){
		Student st=new Student();
		st.Student("Ama",63,"IT");
		st.Display();
		st.DisplayName();
		st.DisplayReg_No();
		st.DisplayCourse();
	}
	
}