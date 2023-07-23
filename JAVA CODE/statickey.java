// Static Variable

// Calculate Area of Circle.....  SV

// class Test{
// 	int r;
// 	static float pi = 3.14f;
// 	Test(int a){
// 		r = a;
// 	}
// 	void CalculateArea(){
// 		System.out.print(pi*r*r);
// 	}
// }
// class Area{
// 	public static void main(String[] args) {
// 		Test obj = new Test(10);
// 		obj.CalculateArea();
// 	}
// }


// Without using Static keyword.....SV

// class Counter{
// 	int count = 0; // will get memory each time when the instance is created

// 	Counter(){
// 		count++;
// 		System.out.println(count); // 1,1,1
// 	}

// 	public static void main(String[] args) {
// 		Counter c1 = new Counter();
// 		Counter c2 = new Counter();
// 		Counter c3 = new Counter();
// 	}
// }

// using Static keyword  SV

// class Counter{
// 	static int count = 0; // will get memory only once and retain its value
    
//     Counter(){
//     	count++; // incrementing value of static
//     	System.out.println(count);
//     }

//     public static void main(String[] args) {
//     	// creating objects
//     	Counter c1 = new Counter();
//     	Counter c2 = new Counter();
//     	Counter c3 = new Counter();
//     }
// }

// WITHOUT STATIC KEYWORD     SV

// class Test{
// 	int a = 12;
// }

// class Main{
// 	public static void main(String[] args) {
// 		Test obj = new Test();
// 		System.out.println(obj.a);
// 	}
// }

// using static keyword

// class Test{
// 	int a = 12;
// 	 static int b = 5;
// }

// class Main{
// 	public static void main(String[] args) {
// 		Test obj = new Test();
// 		System.out.println(obj.a);
// 		System.out.print(Test.b);  /// ....
// 	}
// }

///.......

// class Student{
// 	int rollNo;
// 	String name;
// 	static String college = "LPU";

// 	void setData(int rollNo,String name){
// 		this.rollNo = rollNo;
// 		this.name = name;
// 	}
// 	void getData(){
// 		System.out.println(rollNo+" "+name+" "+college);
// 	}
// }
// class StaticPro1{
// 	public static void main(String[] args) {

// 		Student std1 = new Student();
// 		std1.setData(1,"Avi");
// 		std1.getData();

// 		Student std2 = new Student();
// 		std2.setData(2,"Ashu");
// 		std2.getData();
// 	}
// }

// change string method

// class Vishu{
// 	int rollNo;
// 	String name;
// 	static String college = "LPU";

// 	static void changecollageName(){
// 		college = "ITM";
// 	}
// 	void setData(int rollNo,String name){
// 		this.rollNo = rollNo;
// 		this.name = name;
// 	}
// 	void getData(){
// 		System.out.println(rollNo+" "+name+" "+college);
// 	}
// }
// class Static{
// 	public static void main(String[] args) {
// 		Vishu o1 = new Vishu();
// 		o1.setData(1,"mussu");
// 		o1.getData();
// 		Vishu.changecollageName();

// 		Vishu o2 = new Vishu();
// 		o2.setData(2,"muskan");
// 		o2.getData();
// 	}
// }


// print ....

// class Student{
// 	static double pi=3.14d;
// 	int a = 2;
// }
// class StaticPro1{
// 	public static void main(String[] args) {

// 		Student obj = new Student();

// 		System.out.println(Student.pi); // when we use static , then we can also call pi through class.
// 		System.out.println(obj.pi);
// 		System.out.println(obj.a);
// 	}
// }

// 2 --- Static Method 

// class Vishu{
// 	static double PI = 3.14d;
// 	int a = 8;

//  	static void Static(){
//  		System.out.println(PI);
// 	}
//  	void NonStatic(){
//  		System.out.print(a);
// 	}
// }
// class Static{
// 	public static void main(String[] args) {
// 		Vishu obj = new Vishu();
// 		Vishu.Static(); // or obj.WithStatic();
// 		obj.NonStatic();
// 	}
// } 	


// .....  OR  .......

// class Vishu{
// 	static double g = 1.8;
// 	int a = 3;

// 	static void Static(){
// 		System.out.print(g);
// 	}
// 	void NonStatic(){
// 		System.out.println(a);
// 	}
// }	
// class Static{
// 	public static void main(String[] args) {
// 		new Vishu().NonStatic();
// 		Vishu.Static();
// 	}
// }

// ... non static method can access static method as well as non static

// class Vishu{
// 	static double pi = 3.14d;
// 	int a = 5;
 
// 	 static void Static(){
// 	 }

// 	 void NonStatic(){
// 	 	System.out.println(pi);
// 	 	System.out.print(a);
// 	 }
// }
// class Static{
// 	public static void main(String[] args) {
// 		new Vishu().NonStatic();
// 	}
// }

// static method can not access non static method

// class Vishu{
// 	static double pi = 3.14d;
// 	int a = 5;

// 	static void Static(){
// 		 NonStatic(); // non static() cannot be reffer from 
// 		}

// 		void NonStatic(){
// 	      	System.out.print(pi);
// 	      	System.out.print(a);
// 	    }      
// }
// class Static{
// 	public static void main(String[] args) {
// 		 Vishu.Static();
// 	}
// }

// .... change the value of static

// class Vishu{
// 	static double pi = 3.14;
// 	int a=3;

// 	static void Static(){
// 		System.out.print(pi=3.17);
// 	}

// 		void NonStatic(){
// 			System.out.println(a);
// 		}
// }
// class Static{
// 	public static void main(String[] args) {
// 		new Vishu().NonStatic();
// 		Vishu.Static();
// 	}
// }

// static method

// class Test{
// 	static int a = 5;
// 	static void isRun(){
// 		System.out.print(a);
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		new Test().isRun();
// 	}
// }

// static can not reference non static

// class Test{
// 	int a = 23;
// 	static void isRun(){
// 		System.out.print(this.a);
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		new Test().isRun();
// 	}
// }


// class Price{
// 	int a = 4;
// }
// class Test extends Price{
// 	int a = 50;
// 	void isRun(){
// 		int a = 3;
// 			System.out.print(super.a);  // 4
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		new Test().isRun();
// 	}
// }

// static can not reference non static

// class Price{
// 	int a = 4;
// }
// class Test extends Price{
// 	int a = 50;
// 	static void isRun(){
// 		int a = 3;
// 			System.out.print(super.a);
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		new Test().isRun();
// 	}
// }

// 3 _____ Static Block

// print

// class StaticBlock{
// 	public static void main(String[] args) {
// 		System.out.print("this is main block"); // 2
// 	}
// 	static{
// 		System.out.println("this is static block"); // 1
// 	}
// }

// print

// class StaticBlock{
// 	public static void main(String[] args) {
// 		System.out.print("2"); // 2
// 	}
// 	static{
// 		System.out.println("1"); // 1
// 	}
// }






























































































































































































































































































































































































































































































































































































































































































