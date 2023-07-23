// area of triangle....

// import java.util.Scanner;
// class Test{
// 	void Area(int base , int heigth){
// 		float  area;
// 		area = (base*heigth)/2;
// 		System.out.print(area);
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Enter value of base: ");
// 		int base = obj.nextInt();
// 	System.out.print("Enter value of height: ");
// 		int height = obj.nextInt();
// 		Test triangle = new Test();
// 		triangle.Area(base,height);
// 	}
// }

// area of pentagon....

// import java.util.Scanner;
// class Test{
// 	void Area(int side , int a){
// 		float  area;
// 		area = (5*(side*a)/2);
// 		System.out.print(area);
// 	}
// }
// class Demo{
// 	public static void main(String[] args) {
// 		Scanner obj = new Scanner(System.in);
// 		System.out.print("Enter value of side: ");
// 		int side = obj.nextInt();
// 		System.out.print("Enter value of a: ");
// 		int a = obj.nextInt();
// 		Test pentagon = new Test();
// 		pentagon.Area(side,a);
// 	}
// }

// count the words  in a sentence.

// class Count{
// 	public static void main(String[] args) {
// 		String words = "I wanna go home";
// 		String arr[] = words.split(" "); // split is a function.
// 		System.out.print(arr.length);
//     }
// }

// .....or.....

// class Count{
// 	public static void main(String[] args) {
// 		String words = "I wanna go home";
// 		//String arr[] = words.split(" ");
// 		System.out.println(words.split(" ").length);
//     }
// }


//  COUNT THE VOWELS....

// class Acme{
// 	public static void main(String[] args) {
// 		String words = "I wanna go home";
// 		int count = 0;
// 		for(int i=0; i<words.length();++i){
// 			char ch = words.charAt(i);
// 			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
// 				++count;
// 			}
// 		}
// 		System.out.print(count);
// 	}
// }
  
  
// print war from vishwarya.

// class Name{
//   	public static void main(String[] args) {
//   		String name  = "vishwarya";
//   		System.out.print(name.substring(4, 7));   // o/p war
//   	}
//   }





// import java.lang.Math;
// class Venom
// {
// 	public static void main(String[] args) 
//       {
//       	int n=1234;	int p=0;int S=0;int e=0;
//         int a[] = new int[20];
//         int grid = (int)Math.log10(n)+1;
//         for (int i=0;i<=grid;i++)
//         {
//          int d=n%10;
//         a[i] = d*d;
//         n=n/10;	
//         }
//         for(int j=a.length; j>=0; j-- )
//         	{
//         		p=a[j];
//         		int digits = (int)Math.log10(p)+1;
//         		if(digits==1)
//         		{
//         			 e = a[j]*(int)Math.pow(10,j);
//         			S = S+e;
//         		}
//         			else if (digits==2)
//         			{
//         				S = S*10;
//         				e = a[j]*(int)Math.pow(10,j);
//         				S=S+e;
//         			}
//         			System.out.print(S);
//         	}
//     }
// }


// class Acme{
// 	public static void main(String[] args) {
// 	String s = "1256387";
// 	char []ch = s.toCharArray();
// 	int n = s.length();
// 	int m;
// 	  if (n%2!=0){
// 	  	m = n/2;
// 		System.out.print(ch[m]);
// 	 }
//     }	
// }


//FIND MIDDLE TERM.

// class Lee {
// 	public static void main(String[] args) {
// 		String num = "1234567";
// 		char numArr[] = num.toCharArray();
// 		System.out.print(numArr[numArr.length/2]);
// 	}
// }


// ....print vowel from word...


// class Xiayou {
// 	public static void main(String[] args) {
// 		String name = "iamhad";
// 		for (int i=0; i<name.length(); ++i) {
// 			char ch = name.charAt(i);
// 			// System.out.println(ch);
// 			if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
// 				System.out.println(ch);
// 			}
// 		}		
// 	}	
// }

///  print String in  and vowels are in capital.

// class You {
// 	public static void main(String[] args) {
// 		String name = "vishwarya";
// 		String S1 = "";
// 		for (int i=0; i<name.length(); ++i) {
// 			char ch = name.charAt(i);
// 			// System.out.println(ch);
// 			if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') 
// 				{
// 					 String s2=String.valueOf(ch);
// 					  s2= s2.toUpperCase();
// 					 System.out.print(s2);
// 				}
// 			else
// 					System.out.print(ch);  
// 			}
// 		}		///output vIshwAryA
// 	}	

//  .... PRINT reverse vowel of string .

// class You {
// 	public static void main(String[] args) {
// 		String name = "vishwarya";
// 		String S1 = "";
// 		int ln = name.length();
// 		for (int i=ln-1; i>=0; --i) {
// 			char ch = name.charAt(i);
// 			// System.out.println(ch);
// 			if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') 
// 				{
// 					String s2=name.valueOf(ch);
// 					s2= s2.toUpperCase();
// 					S1 = S1 + s2; 
// 				}
// 		}
// 		System.out.print(S1);
// 	}		
// }	/// output AAI


