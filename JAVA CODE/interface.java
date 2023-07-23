// interface

// interface printable{
// 	//function signature or prototype
// 	void print();
// }
// class Copy implements printable{
// 	public void print(){
// 		System.out.print("Hello");
// 	}
// }
// class Interface{
// 	public static void main(String[] args) {
// 		Copy obj = new Copy();
// 		obj.print();
// 	}
// }

// interface

// interface Drawable{
// 	public void draw();
// 	int A = 23;	
// }
// class Rectangle implements Drawable{
// 	public void draw(){
// 		System.out.println("draw a Rectangle");
// 	}
// }
// class Circle implements Drawable{
// 	public void draw(){
// 		System.out.println("draw a Circle");
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		Circle cirobj = new Circle();
// 		cirobj.draw();

// 		System.out.print(Rectangle.A);

// 		Rectangle recobj = new Rectangle();
// 		recobj.draw();
// 	}
// }

//  ........

// interface Bank{
// 	float rateOfInterest();
// }
// class SBI implements Bank{
// 	public float rateOfInterest(){
// 		return 3.12f;
// 	}
// }
// class PNB implements Bank{
// 	public float rateOfInterest(){
// 		return 6.98f;
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		SBI sbi = new SBI();
// 		PNB pnb = new PNB();
// 		System.out.println("ROI: "+sbi.rateOfInterest());
// 		System.out.println("ROI: "+pnb.rateOfInterest());
// 	}
// }

//......

// interface Print{
// 	void display();
// }
// abstract class Copy{
// 	public abstract void display();

// 	void testing() {
// 		System.out.println("wanna go with js");
// 	}
// }
// class InterfaceTest extends Copy implements Print{
// 	public void display(){
// 		System.out.println("print copy");
// 	}
// 	public static void main(String[] args){
// 		InterfaceTest obj = new InterfaceTest();
// 		obj.display();
// 		obj.testing();
// 	}
// }

// one class is inheriting more than one class

// interface Sketching{
// 	public void sketch();
// }

// interface Painting{
// 	public void paint();
// }

// class MultipleINByInterface implements Sketching,Painting{
// 	public void sketch(){
// 		System.out.print("I am Sketching");
// 	}
// 	public void paint(){
// 		System.out.println("I am Painting");
// 	}
// 	public static void main(String[] args) {
// 		MultipleINByInterface obj = new MultipleINByInterface();
// 		obj.sketch();
// 		obj.sketch();
// 	}
// }


//.........error interface can inherit classes or not.

// abstract class A{
// 	void run(){
// 		System.out.print("apple");
// 	}
// }
// abstract class B{
// 	void test(){
// 		System.out.print("triangle");
// 	}
// }
// interface add implements A,B{
// 	public void check();
// }
// class Demo{
// 	public static void main(String[] args) {
// 		interface obj = new interface();
// 		obj.test();
// 		obj.run();
// 	}
// }

