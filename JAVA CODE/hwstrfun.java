// WAP TO REPLACE ALL 'A' CHARACTERS FROM 'E'.

// class Replace{
// 	public static void main(String[] args) {
// 		String v = "Vishwarya";
// 		System.out.println(v.replace('a','m')); //Vishwmrym
// 		System.out.println(v.replace('V','w')); //wishwarya
// 		System.out.println(v.replace('v','w')); //Vishwarya
// 	}
// }

// ....OR.....

// import java.util.Scanner;
// class Test{
// 	void replace(String a){
// 		System.out.print(a.replace('a','u'));
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Enter the String m : ");
// 		String m = obj.nextLine();
// 		Test place = new Test();
// 		place.replace(m);
// 	}
// }

//WAP LENGTH OF STRING.

// class Ghost{
// 	public static void main(String[] args) {
// 		String v = "gyuyuryuhi";
// 		System.out.print(v.length());
// 	}
// }

// ......OR.....

// import java.util.Scanner;
// class Test{
// 	void length(String r){
// 		System.out.print(r.length());
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Enter the value m: ");
// 		String m = obj.nextLine();
// 		Test find = new Test();
// 		find.length(m);
// 	}
// }

//WAP TO GET CHARACTER AT THE GIVEN INDEX IN A STRING.

// class Result{
// 	public static void main(String[] args) {
// 		String v = "hbuihewuich";
// 		char []ch = v.toCharArray();
// 		for(int i=0; i<ch.length; ++i){
// 		}
// 			System.out.print(ch[6]);
// 	}
// }

//..... Or .....

// import java.util.Scanner;
// class Test{
// 	void res(String b, int d){
// 		char []ch = b.toCharArray();
// 			//for(int i=0; i<ch.length; ++i){
         
// 		System.out.print(ch[d]);
// 	 }
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Enter String m: ");
// 		String m = obj.nextLine();
// 		System.out.print("Enter index i: ");
// 		int i = obj.nextInt();
// 		Test value = new Test();
// 		value.res(m,i);
// 	}
// }

//WAP TO REMOVE some PARTICULAR CHARACTER FROM STRING.

// class Remove{
// 	public static void main(String[] args) {
// 		String v = "adjoadkslm";
// 		String val = v.substring(0,6);
// 		String cal = v.substring(7,10);
// 		System.out.print(val.trim()+cal);	//o/p adjoadslm	
// 	}
// }

// import java.util.Scanner;
// class Remove{
// public static void main(String[] args) {
// 	Scanner obj = new Scanner(System.in);
// 	System.out.print("Enter String s: ");
// 	String s = obj.nextLine();
// 	char ch = s.toCharArray();

// 	for(int i=0;i<ch.length;i++){
// 		System.out.print("Enter index i: ");

// 	String val = v.substring(i,i);
// 	 String cal = v.substring(i,i);
// 	System.out.print(val.trim()+cal);
//     }
//   }
// }