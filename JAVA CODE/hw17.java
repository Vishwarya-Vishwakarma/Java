// // strong no. (fact 145 = fact 1 + fact 2 + fact 5).

 //class Strong{
	// public static void main(String[] args){
	// 	int a=145, sum=0,r,f=1;
	// 	int temp=a;
	// 	while(a!=0){
	// 		r=a%10; //5,4,1
	// 		for(int i=1 ; i<=r; ++i){
 //                f=f*i;//1
				
	// 		}
	// 			sum=sum+f;//120,144,145
	// 			f=1;
	// 			a=a/10;//14,1,0
	// 		}
	// 		if(sum==temp){
	// 			System.out.print("Strong number");
	// 	}
	// 	}
	// 	}	

		
//print first and last digit of number.

// class Firlas{
// 	public static void main(String[] args){
// 		int num=12345,a=0,b=0;
// 		b=num%10;
// 		System.out.println(b);
// 		 while(num!=0){
// 		 	a=num%10; // 5,4,3,2
// 		 	num=num/10; // 1234,123,12,1
// 		 }
// 		 	System.out.println(a);
// 	}
// }

// ......OR....

// import java.lang.Math;
// class Oops{
// 	public static void main(String[] args) {
// 		int a = 123456;
// 		int ld = a % 10;
// 		int ln = (int)Math.log10(a)+1;
// 		int v = (int)Math.pow(10,ln-1);
// 		int fd = a/v;

// 		System.out.print(fd+" "+ld);
// 	}
// }

//print sum of first and last digit of number.

 // class Firlas{
 // 	public static void main(String[] args){
 // 		int num=12345,a=0,b=0,sum=0;
 // 		b=num%10;
 // 	      while(num!=0){
 // 		 	a=num%10; // 5,4,3,2
 // 		 	num=num/10; // 1234,123,12,1
 // 		  }
 // 		 	System.out.println(sum=a+b);
		 
 // 	}

 // }


// // print factor of given no.

// class Factor{
// 	public static void main(String[] args){
// 		int num=12;
// 		for(int i=1; i<=num;++i){
// 			if(num%i==0){
// 				System.out.println(i);
// 			}
// 		}
// 	}
// }


// print perfect no.

 // class Factor{
 //  	public static void main(String[] args){
 //  		int num=7, sum=0;
 //  		for(int i=1; i<num; ++i){
 //  			if(num%i==0){
	// 			sum=sum+i;
 // 			}
 //        }
 // 		if(sum==num){
 // 		    System.out.print("Perfect Number");
 // 		}else{
 // 			System.out.print("not perfect number");
 // 	 	}
 //  	} 
//}

// ARMSTRONG NO.
 	
	// import  java.lang.Math;
	// import java.util.Scanner;
 //    	class Armstrong{
	// 	public static void main(String[] args){
	// 		Scanner obj = new Scanner(System.in);
	// 		System.out.print("Enter any value : ");
	// 		int a = obj.nextInt();
 //    		int f,sum=0,r;
	// 		int suppose=a;
	// 		int digits = (int)Math.log10(a)+1;
	// 		// System.out.print(digits);
	// 		while(a != 0) {
	// 			r = a % 10;//3,5,1
	// 			f = 1;
	// 			for (int i=1; i<=digits; i++) {
	// 				f = f * r;	//3,9,27--5,25,125--1,1,1
	// 			}	
	// 			sum = sum + f; //27, 152,153
	// 			a = a / 10;//15,1,0
	// 		}	
	// 		if (suppose == sum) 
	// 			System.out.print("Armstrong number");
	// 			else
	// 				System.out.print("NOT");
			
	// 	}
	// }

 //  ..... or......ARMSTRONG NO. 

	// class Armstrong{
	// 	public static void main(String[] args) {
	// 		int a=153,r,f=1,sum=0;
	// 		int suppose = a;
	// 	 while(a>0){
	// 		r=a%10;
	// 		f=1;
	// 		f=f*r*r*r;
	     
	//      sum = sum+f;
	//      a = a/10;
	//      }
	//      if (suppose == sum)
	//      	System.out.print("a");
	//      else
	//      	System.out.print("n");

	// 	}
	// }

////...... OOORRRR....
// class Armstrong{
// 		public static void main(String[] args) {
// 			int a=153,r,sum=0;
// 			int suppose = a;
// 		 while(a>0){
// 			r=a%10;
// 			sum = sum+r*r*r;
// 	        a = a/10;
// 	     }
// 	     if (suppose == sum)
// 	     	System.out.print("a");
// 	     else
// 	     	System.out.print("n");

// 		}
// 	}

			
// WAP TO FIND VALUE OF ONE NUMBER RAISED TO POWER OF ANOTHER.
// (DO NOT USE JAVA BUILT-IN METHOD) .

// import java.util.Scanner;
// class Test{
// 	void display(int a, int b){
// 		int r=1;
// 		for(int i=1;i<=b; i++ ){
// 			r=a*r;
// 		}
// 		System.out.print(r);
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Enter value of a: ");
// 		int a = obj.nextInt();
// 		System.out.print("Enter value of b: ");
// 		int b = obj.nextInt();
// 		Test find = new Test();
// 		find.display(a,b);
// 	}
// }