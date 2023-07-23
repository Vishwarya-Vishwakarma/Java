// call by reference

// class CallByMet{
// 	int data = 50;

// 	void change(CallByMet o){
// 		o.data = o.data+100; // changes will be in the instance variable
// 	}

// public static void main(String[] args) {
// 	CallByMet obj = new CallByMet();

// 	System.out.println("before change" +obj.data); // 50
// 	obj.change(obj); // passing object
// 	System.out.println("after passing" +obj.data); // 150
//  }
// }

// call by value

// class CallByMet{
// 	int data=50;

// 	void change(int value){
// 		value = data+100; // changes will be in the local variable only

// 	}

// 	public static void main(String[] args) {
// 		CallByMet obj = new CallByMet();
// 		System.out.println("before change "+obj.data); // o/p 50
// 		obj.change(500);
// 		System.out.println("after change "+obj.data); // o/p 50

// 	}
//  }

//print a=5.

// class Acme{
// 	public static void a(){
// 		int a = 5;
// 		System.out.print(a);
// 	}
// 	public static void main(String[] args) {
// 		Acme.a();
// 	}
// }

