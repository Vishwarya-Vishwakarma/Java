// print Vishwarya.

// class Test{
// 	void kuxv(){ //method
// 		System.out.println("Vishwarya");
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Test name = new Test(); //create object of class
// 		name.kuxv();//call 
// 	}
// }


//sub. of two no.

// class Test{
// 	void subt(int a, int b){
// 		System.out.print(a-b);
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Test obj=new Test();
// 		obj.subt(45,21);
// 	}
// }

// ....or....

// class Test{
//   void subt(){
//     int a=5,b=3;
//    System.out.print(a-b);
//  }
// }
// class Demo{
//  public static void main(String[] args) {
//    Test obj=new Test();
//    obj.subt();
//  }
// }

//add. of two no.

// class Test{
// 	void add(int a,int b){
// 		System.out.print(a+b);
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Test kuxv=new Test();
// 		kuxv.add(1,2);
// 	}
// }
                
// check positive or negative.

  // class Test{
  // 	void check(){
  //     int a = 9;
  // 		if (a>=0)
  // 			System.out.print("Postive");
  // 		else
  // 			System.out.print("Negative");
  // 	}
  // }
  // class Demo{
  // 	public static void main(String[] args) {
  // 		Test obj = new Test();
  // 		obj.check();
  // 	}
  // }


// check even or odd.

// class Test {
// 	void check(int a){
// 		if(a%2==0)
// 			System.out.print("even");
// 		else
// 			System.out.print("odd");
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Test kuxv=new Test();
// 		kuxv.check(5);
// 	}
// }


//   Sum of digits of on. given by user.

// import java.util.Scanner;
// class Test{
// 	void sumOfItsDigit(int a){
// 		int sum = 0, r;
// 		while(a > 0) {
// 			r = a % 10;
// 			sum = sum + r;
//       sum=1;
// 		}
// 		System.out.print(sum);
// 	}
// }
// class Demo {
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Input value : ");
// 		int a = obj.nextInt();
// 		Test o = new Test();
// 		o.sumOfItsDigit(a);
// 	}
// }


// // sum of factorial. 

// import java.util.Scanner;
// class Test{
// 	void sumOfItsDigit(int a){
// 		int sum = 0, r,fact=1;
// 		while(a > 0) {
// 			r = a % 10;
// 			for(int i=1;i<=r;i++){
// 			fact=fact*i;		// 1,2,6..1,2...1
// 			sum = sum + fact;		// 6,2,1
// 				a = a / 10;		// 12,1,0
// 			}
//   	}
// 		System.out.print(sum);
// 	}
// }
// class Demo {
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Input value : ");
// 		int r = obj.nextInt();
// 		Test o = new Test();
// 		o.sumOfItsDigit(r);
// 	}
// }


// reverse. (input given by user).

//  import java.util.Scanner;
//  class Test{
//  void reverse(int a){
//  	int rev=0,rem;
//  while(a>0){
	
//  	rem=a%10; 
//  	rev=rev*10+rem;
//     a=a/10;
// }
// System.out.print(rev);

// }
//  }
//  class Demo{
//  	public static void main(String[] args) {
//  		Scanner obj = new Scanner(System.in);
//  		System.out.print("Enter a : ");
//  		int a=obj.nextInt();
//  		Test pgl = new Test();
//  		pgl.reverse(a);
//  	}
//  }


// // check prime or not of given no.


// class Prime{
// 	public static void main(String[] args) {
// 		int num=5 ,i;
// 		for( i=2; i<5; i++){
// 			if(num%i==0){
// 				System.out.print("Not Prime number");
// 				break;
// 			}
// 		}
// 			 if(num==i){
// 				System.out.print("Prime number");
// 			}else{
// 				System.out.print("Nothing");
// 			}
// 	}
// }

// //perfect no.

// import java.util.Scanner;
// class Test{
// 	void kuxv(int a){
// 		int sum=0;
// 	for(int i=1; i<a; i++){
// 		if(a%i==0)
// 		{
// 			sum=sum+i;
// 		}
// 	}
// 		if (sum==a)
// 			System.out.print("perfect no.");
// 		else
// 			System.out.print("not perfect no.");  
// }
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Enter a: ");
// 		int a = obj.nextInt();
// 		Test perfect = new Test();
// 		perfect.kuxv(a);
// 	}
// }

//  Strong no.

// import java.util.Scanner;
// 	class Test
// 	{
// 		void kuxv(int a)
// 		{
// 			int p=1,s=0,t=a;
// 			while(a>0)
// 			{
// 				int d=a%10;//5,4,1
// 				for(int i=1;i<=d;i++)
// 				{
// 					p=p*i;//120,24,1
// 				}
// 				s=s+p;//120,144,145
// 				p=1;//1
// 				a=a/10;//14,1,0
// 			}
// 			if (s==t)
// 				System.out.print("strong no.");
// 			else
// 				System.out.print("not strong no.");
// 		}
// 	}
// 	class Demo
// 	{
// 		public static void main(String[] args) 
// 		{
// 			Scanner obj=new Scanner(System.in);
// 			System.out.print("Enter b: ");
// 			int b = obj.nextInt();
// 			Test strong=new Test();
// 			strong.kuxv(b);
// 		}
// 	}


// QUE..find factor then factorial of factor then sum of factorial.....(VALUE GIVEN BY USER).


// import java.util.Scanner;
// class Test{
// 	void check(int a ) {//6
// 		int sum = 0;
// 		for (int i=1; i<=a; i++) { // 1,2,3,4,5,6
// 			if (a % i == 0){ //1,2,3,6
//       			int fact = 1,j;
//       			for (j=1; j<=i; j++) { // 1,2
//       			     fact=fact*j;//1,2--1,2,6--1,2,6,24,120,720
//       			}
//       			sum = sum + fact; // 1,+2,+6,+720  = 729
// 			}	
// 		}
//       			System.out.println(sum); // 729
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print(" Enter a: ");
// 		int a=obj.nextInt();
// 		Test factor = new Test();
// 		factor.check(a);
// 	}
// }

//....OR......

// class Test{
// 	void check(int a ){//6
// 		int sum = 0;
// 		for (int i=1; i<=a; i++){
// 			if (a%i==0){
				 
//       			int fact = 1,j;
//       			for (j=1; j<=i; j++){
//       				fact=fact*j;//1,2--1,2,6--1,2,6,24,120,720
//       			}
//       			sum = sum + fact;
				
// 			}

// 		}
//       			System.out.print(sum);//1,2,6,720
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Test factor = new Test();
// 		factor.check(6);
// 	}
// }

// swapping

// import java.util.Scanner;
// class Test{ // a=2,b=3
//   void swapping(int a, int b){
//     a = a + b;  // 5
//     b = a - b;
//     a = a - b;
//   System.out.println(a);
//   System.out.println(b);
//   }
// }
// class Demo{
//   public static void main(String[] args) {
//     Scanner obj = new Scanner(System.in);
//     System.out.print("Enter value a: ");
//     int a = obj.nextInt();
//     System.out.print("Enter value b: ");
//     int b = obj.nextInt();
//     Test check = new Test();
//     check.swapping(a,b);
//   }
// }

//palindrome no.

// import java.util.Scanner;
// class Test{
//   void check(int a){   //121
//     int p=a;
//     int rem,rev=0;
//     while(a>0){
//       rem = a%10;   //1,2,1
//       rev=rev*10+rem;   // 1 2 1
//       a = a/10;   // 12, 1 ,0
//     }
//       if (rev==p)
//         System.out.print("PALINDROME");
//       else
//         System.out.print(" NOT PALINDROME");

//   }
// }
// class Demo{
//   public static void main(String[] args) {
//     Scanner obj = new Scanner(System.in);
//     System.out.print("Enter value b: ");
//     int b = obj.nextInt();
//     Test pgl = new Test();
//     pgl.check(b);
//   }
// }


// series = 1^1 + 2^2+...... (print upto the term user given)

// import java.lang.Math;
// import java.util.Scanner;
// class Test{
//   void series(int a){
//     int sum=0;
//     for(int i=1; i<=a; i++){
//       sum = sum + (int)Math.pow(i,i);
//     }
//      System.out.print(sum);
//   }
// }
// class Demo{
//   public static void main(String[] args) {
//     Scanner obj = new Scanner(System.in);
//     System.out.print("Enter value a: ");
//     int a = obj.nextInt();
//     Test kuxv = new Test();
//     kuxv.series(a);
//   }
// }

// armstrong

// import java.util.Scanner;
// class Test{
//   void armstrong(int a){
//     for(i=a; i<=a; i++)

//   }
    
// }


// class Test{
//   int value = 100;
//   void Task(int a){
//     a = a + 10;
//   }
// }

//import java.lang.Math;
//class Demo{
  //public static void main(String[] args) {
    // Test obj = new Test();
    // System.out.println(obj.value);
    // obj.Task(150);
    // System.out.println(obj.value);
    //System.out.print((int)Math.pow(10,3));
  //}
//}


