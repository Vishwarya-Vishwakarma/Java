// final variable   // safe driving

// class A{
// 	int speed = 50;
// 	void isSafe(){
// 		if(speed==50){
// 		System.out.print("safe driving");
// 		}
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		 A obj = new A();
// 		 obj.isSafe();
// 	}
// }

//.......

class Demo{
	final int Bikelimit = 50;

	void changeBikeLimit(){
		int Bikelimit = 150;
	}
}
class FinalPro1{
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.changeBikeLimit();
		System.out.println(obj.Bikelimit);
	}
}


//   ......o\p error occur

// class Demo{
// 	final int Bikelimit = 50;

// 	void changeBikeLimit(){
// 		Bikelimit = 150;
// 	}
// }
// class Finalpro1{
// 	public static void main(String[] args) {
// 		Demo obj = new Demo();
// 		obj.changeBikeLimit();
// 		System.out.print(obj.Bikelimit);
// 	}
// }


// finalkeyword in  method 

//  error of override

// class Lamborgini{
// 	boolean haveCar = true;

// 	 final void run(){   //
// 		System.out.print("bhjnu"+haveCar);
// 	 }
// }
// class Car extends Lamborgini{
// 	   void run(){
// 	  System.out.print("byuhniu"+haveCar);
//     }
// }
// class Main{
// 	public static void main(String[] args) {
// 	Car obj = new Car();
// 	obj.run();	
// 	 }
// }

//  .... error of override

// class Bike{
// 	final void run(){
// 		System.out.print("runing");
// 	}
// }
// class Car extends Bike{
// 	void run(){
// 		System.out.println("running safly");
// 	}
// 	public static void main(String[] args) {
// 		Car honda = new Car();
// 		honda.run();
// 	}
// }


// final class 

// class Final{
// 	void run(){
// 	System.out.print("final keyword");
// 	}
// }
// class Main extends Final{
// 	public static void main(String[] args) {
// 		new Final().run();
// 	}
// }

// o/p 15 ,pgl

// final class A{
// 	int a = 5;
// 	void fun(){
// 		System.out.print("vish");
// 	}
// }
// class B{
// 	A o = new A();
// 	int b = o.a + 10;
// 	void funn(){
// 		o.fun();
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		System.out.println(new B().b);
// 		new B().funn();
// 	}
// }










