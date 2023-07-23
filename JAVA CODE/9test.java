// // length/(1st digit + last digit)

// import java.lang.Math;
// class Main{
// 	public static void main(String[] args) {
// 		int num = 123482, r=0;
// 		int ln = (int)Math.log10(num)+1; // 6
// 		int ld = num % 10; // 7
// 		while(num>0){
// 			r = num%10;
// 			num=num/10;
// 		}
// 		System.out.print(ln/(r+ld));
// 	}
// }


// .... OR .....
// 
// import java.lang.Math;
// import java.util.Scanner;
// class Test{
//  void check(int a){
//  	int r=0;
//  	int ld = a % 10;
//  	int ln = (int)Math.log10(a)+1;
//  	while(a>0){
//  		 r = a % 10;
//  		a = a / 10;
//  	}
//  	System.out.print(ln/(ld+r));
//  }
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner (System.in);
// 		System.out.print("Enter value: ");
// 		int a = obj.nextInt();
// 		Test res = new Test();
// 		res.check(a);
// 	}
// }


// if 324 then find (3*1000+2*100+4*10000) = 43200

// import java.lang.Math;
// class Main{
// 	public static void main(String[] args) {
// 		int a = 324,r,sum =0, h;
// 		while(a>0){
// 			r=a%10;
// 		    h = (int)Math.pow(10,r);
// 		    int pro = r*h;
// 		   // int sum =1;
// 		     sum = sum + pro;
// 			a=a/10;
// 		}
// 			System.out.print(sum);
// 	}
// }



// class Main{
// 	public static void main(String[] args) {
// 		int even=0;
// 		String s = "123567";
// 		char ch[] = s.toCharArray();
// 		System.out.println(ch.length);
// 		//int []ch = new int[i];
// 		for(int i=0; i<=ch.length;++i){
// 			int ch[] = new int[i];
// 			if (ch[i]%2==0){
// 				//int []ch = new int[i];
// 				even = even+ch[i];
// 				System.out.print(even);
// 			}
// 		}
// 	}
// }


// .... OR .....

// import java.lang.Math;
// class Main{
	//  public static void main(String[] args) {
		// String n = "1234567";
	//	int sum1 =0, sum2 = 0;
		//int ln = (int)Math.log10(n)+1;
		//int ln = n.length();
		//for(char ch:arr){
		// for(int i=0; i<ch.length; i++){
//int ln = (int)Math.log10(arr)+1;
//for(int i= arr[0]; i<=arr[ln-1]; i++){
// int sum1 = 0,sum2 = 0;			
// if(ch[i]%2==0){
// 	sum1 =sum1 + ch[i];			
// 	System.out.println("even "+sum1);
// }else{	
// 	sum2 = sum2+ch[i];//1
// 	System.out.println("odd "+sum2);				
// }k
// }
// 	}
// }


//  2314=(2*10+3*100+1*100+4*10000) ....... doubt

// import java.lang.Math;
// class A{
// 	public static void main(String[] args) {
// 		int b = 123;
// 		int sum = 0,r;
// 		int len = (int)Math.log10(b)+1;
// 		int mult = 1;

// 		for (int i=1; i<=len; ++i) {
// 			mult = mult * 10;//10,100,1000,10000
// 		}

// 		while(b != 0){
// 			r = b % 10;//4,1,3,2
// 			sum = sum + mult*r;//41320
// 			b = b / 10;//231,23,2
// 			mult = mult / 10;//1000,100,10
// 		}
// 		System.out.print(sum);			
// 	}
// }


// ..... or ..........

// int num = 123, rem, rev=0;
// 		while(num > 0){
// 			rem = num % 10;//3,2,1
// 			rev = rev * 10 + rem;//3,32,321
// 			num = num / 10;//12,1,0
// 		}
// 		System.out.println(rev*10);


//  5. Find third place of any no. (from starting).

// class Main{
// 	public static void main(String[] args) {
// 		int a=123456,r,t;
// 		r = a/100;	
// 	    t = r%10;
// 	System.out.print(t);
// 	}
// }

//            .... OR ....

// class Main{
// 	public static void main(String[] args) {
// 		String a="129456";
// 		char arr[] = a.toCharArray();
// 		for(char ch :arr)
// 		{
// 		}
// 			System.out.print(arr[2]);		
// 	}
// }


// for each loop.(string to array)

// class Main{
// 	public static void main(String[] args) {
// 		String s1 = "some";
// 		char arr[] =s1.toCharArray();
// 		for(char ch :arr){
// 		System.out.print(arr);
// 	    }
// 	}
// }

// or 

// class Main{
// 	public static void main(String[] args) {
// 		String s1 = "some";
// 		char arr[] =s1.toCharArray();
// 		System.out.print(arr);
// 	}
// }

// check no. of digits if even (sum of even position) otherwise (sum of odd position).

// import java.lang.Math;
// class Main{
// 	public static void main(String[] args) {
// 		int a = 394521,r,sum = 0;
// 		int len = (int)Math.log10(a)+1;	//6
// 		int arr[] = new int[len];	//6
// 		int i = len - 1;	//5
// 		while(a != 0) {
// 			r = a % 10;	//1,2,5,4,9,3
// 			arr[i] = r;//5,4,3,2,1,0
// 			--i; // 4,3,2,1,0
// 			a = a / 10; // 39452,3945,394,39,3,0
// 		}
// 		if(len % 2 == 0){  // yes
// 			for (i=1; i<arr.length; i=i+2) {
// 				sum = sum + arr[i];   // 9,14,15
// 			}
// 		}else {
// 			for (i=0; i<arr.length; i=i+2) {
// 				sum = sum + arr[i];  //  3,7,9
// 			}
// 		}
// 		System.out.print(sum); // 15
// 	}
// }


// ... num = MidTerm*length of number then check result is even or odd.
 // ex-46173=1*5
//          =5 (odd)


// class A {
// 		public static void main(String[] args) {
// 		int num = 46371;
// 		int len = (int)Math.log10(num)+1;
// 		int r = 0;
// 		if (len % 2 == 0) {
// 			System.out.println("Number must be odd digits");
// 			System.exit(0);	// TO TERMINATE A PROGRAM
// 		}
// 		for(int i=1; i<=(len/2)+1; i++){
// 			r = num % 10; //3
// 			num = num / 10;
// 		}
// 		if ((len*r) % 2 == 0) {
// 			System.out.println("Even");
// 		} else {
// 			System.out.println("Odd");
// 		}
// 	}	
// }