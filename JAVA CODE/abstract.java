// abstract   1 -

// abstract class A{
// 	abstract void run();
// 	void add(int a,int b){
// 		System.out.print(a+b);
// 	}
// }
// class B extends A{
// 	void run(){
// 		System.out.println("good");
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		B obj = new B();
// 		obj.run();
// 		obj.add(2,3);
// 	}
// }

// 2- 

// abstract class Area{
// 	abstract void run();
// }
// class Triangle extends Area{
// 	void run(){ // create the functionality of abstract method as above
// 		System.out.print("area of tri");
// 	}
// }
// class Pentagon extends Area{
// 	void run(){ // 
// 		System.out.print("area of Pentagon");
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		Triangle obj = new Triangle();
// 		obj.run();
// 	}
// }

// 3- 

// abstract class Bank{
// 	abstract int getRateOfInterest();
// }
// class SBI extends Bank{
// 	int getRateOfInterest(){
// 		return 3;
// 	}
// }
// class PNB extends Bank{
// 	int getRateOfInterest(){
// 		return 4;
// 	}
// }
// class AbstractionPro3{
// 	public static void main(String[] args) {
// 		SBI b1 = new SBI();
// 		System.out.println("Rate of Interest : "+b1.getRateOfInterest()+"%");
	
// 		PNB b2 = new PNB();
// 		System.out.println("Rate of Interest : "+b2.getRateOfInterest()+"%");
// 	}
// }

//  ........

// abstract class Mobile{
// 	abstract void call();
// 	abstract void music();
// 	abstract void camera();
// 	abstract void chatting();
// } 
// class Tablet extends Mobile{
// 	void call(){
// 		System.out.println("calling function");
// 	}
// 	void music(){
// 		System.out.println("music function");
// 	}
// 	void camera(){
// 		System.out.println("camera function");
// 	}
// 	void chatting(){
// 		System.out.println("chatting function");
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		Tablet samsung = new Tablet();
// 		samsung.call();
// 		samsung.music();
// 		samsung.camera();
// 		samsung.chatting();
// 	}
// }

