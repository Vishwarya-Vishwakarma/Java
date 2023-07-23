// ..... private ..... 

// class Pgl{
// 	private int a = 23;    // int type

// 	void isAccess(){
// 		System.out.print(a);
// 	}
// }
// class Test extends Pgl{

// }
// class Acme{
// 	public static void main(String[] args) {
// 		Test obj = new Test();
// 		obj.isAccess();
// 	}
// }


//   ... protected ...

// class Pgl{
// 	protected int a = 765;

// 	void isAccess(){
// 		System.out.println(a);  // 2__765
// 	}
// }     
// class Test extends Pgl{
// 	void yes(){
// 		System.out.print(a);  // 3___765
// 	}
// }             
// class Acme{
// 	public static void main(String[] args) {
// 		Test obj = new Test();
// 		System.out.print(obj.a);  // 1__765
// 		obj.isAccess();
// 		obj.yes();
// 	}
// }

//  .... PUBLIC ....

// class Pgl{
// 	public int a = 345;
// }

// class Test extends Pgl{

// }
// class Acme{
// 	public static void main(String[] args) {
// 		Test obj = new Test();
// 		System.out.print(obj.a);
// 	}
// }
