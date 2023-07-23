// add two no.(without passing parameter)/ default constructer

// class Demo{
// 	Demo(){  // constructer
// 		int a =2,b=3,sum;
// 		sum = a+b;
// 		System.out.print(sum);
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Demo o = new Demo();
// 	}
// }


 //passing parameter.

// class Demo{
// 	Demo(int a,int b){
//   System.out.print(a+b);
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Demo o = new Demo(2,3);
// 	}
// }
	
	
// constructer overloading..

// class Demo{
// 	Demo(int a, int b){
// 		System.out.println(a+b);
// 	}
// 	Demo(int a, float b){
// 		System.out.println(a+b);
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Demo o1 = new Demo(3,4.45f);
// 		Demo o2 = new Demo(3,9);
// 	}
// }

//SOMU
// class Xenon{
// 	public static void main(String[] args) {
// 		String s1 = "Ahmad";int s=0;int ch2=0;
// 		//s1=s1.toLowerCase();
// 		for(int i = 0; i<s1.length();i++)
// 		{
// 			char ch1 = s1.charAt(i);
// 			int ch = s1.charAt(i);
// 			s=s+ch;
	
// 			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'|| ch1=='A' )
// 			{
// 				ch2=ch1+ch2;
// 			}
// 		}
// 		System.out.print(s/ch2);
// 	}
// }

// print......

// class Demo{
// 	Demo(){
// 		System.out.println("m a constructor");
// 	}
// 	void display(){
// 		System.out.println("not a constructor");
// 	}
// }
// class oop{
// 	public static void main(String[] args) {
// 		Demo o = new Demo();
// 		o.display();
// 	}
// }

//       ...OR...

//class Demo{
// 	Demo(){
// 		System.out.println("m a constructor");
// 	}
// 	void display(){
// 		System.out.println("not a constructor");
// 	}
// }
// class oop{
// 	public static void main(String[] args) {
// 		Demo o = new Demo();
// 		// o.display();
// 	}
// }