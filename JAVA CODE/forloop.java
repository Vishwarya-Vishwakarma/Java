// loop(while loop,for loop,do while loop)
// 1- for loop
// syntax:  for(initial condition;test condition;incre/decre){
// 					statement-1;
// 					statement-2;
// 			}

// Q-1 print 1 to 10.
// class Forloop{
// 	public static void main(String[]args){
// 		for(int i=1;i<=10;++i){
// 			System.out.print(i);
// 		}
// 	}
// }

// 				  OR
// PRINT 0-9.
// public static void main(String[]args){
// 		for(int i=0;i<10;++i){
// 			System.out.print(i);
// 		}
// 	}
// }

// print 1 -10 with space
// class For{
// 	public static void main(String[]args){
// 		for(int i=0;i<10;++i){
// 			System.out.print(i+" ");
// 		}
// 	}	
// }

// Q- print 1 -10 with space(\t)
// class For{
// 	public static void main(String[]args){
// 		for(int i=0;i<10;++i){
// 			System.out.print(i+"\t");
// 		}
// 	}	
// }

// Q- table of 5.(wrong method)
// class For{
// 	public static void main(String[]args){
// 		for(int i=5;i<=50;i=i+5){
// 			System.out.println(i);
//  	}
// 	}
// }

// 			OR (right method)
//  class For{
// public static void main(String[]args){
// 	int table=5;
// 	for(int i=1;i<=10;++i){
// 		System.out.println(i*table);
// 	}
// 	}
// }

// -Q- FACTORIAL OF 5. 

// class For{
// 	public static void main(String[]args){
// 		int a=1;
// 		for(int i=1;i<=5;++i){
// 	      a=a*i;
// 		}
// 		System.out.print(a);
// 	}
// }
				// OR
// class For{
// public static void main(String[]args){
// 		int bac=5,a=1;
//  		for(int i=1;i<=bac;++i){
//  			a=a*i;
//  		}
//  		System.out.print(a);
//  	}
// }
				//OR

// class For{
//  public static void main(String[]args){
//  		int fact=5,a=1;
//   		for(int i=2;i<=fact;++i){
//   			a=a*i;  // 1,2,6,24,120
//   		}
//   		System.out.print(a);
//   	}
//  }
			//OR

 // class For{
 //  public static void main(String[]args){
 //  		int fact=5,a=1;
 //   		for(int i=2;i<=fact;++i){
 //   			//a=a*i;
 //   			a*=i;
 //   		}
 //   		System.out.print(a);
 //   	}
 //  }

//even no. 1-10.

// class Even{
// 	public static void main(String[]args){
// 		for(int i=1;i<=11;++i){
// 			if(i%2==0){
// 				System.out.println(i);
// 			}
// 		}
// 	}
// }

//sum of odd no. 1-10

// class Num{
// 	public static void main(String[]args){
// 		int sum=0;
// 		for(int i=1;i<=10;++i){
// 			if(i%2!=0){
// 			sum+=i; //1,4,9,16,25
// 		}
// 	}
// 	System.out.print(sum);
//		}
//}


//.... doubt

// class Armstrong{
// 	public static void main(String[] args){
// 		int a=153, sum=0,r;
// 		temp = a;
// 		while(a!=0){
// 			r=a%10; //5,4,1
// 			sum = sum + r*r*r;
// 			a=a/10;
// 			}
// 				if (sum == tem){
// 					System.out.print();
			    
// 			System.out.print("Armstrong number");
// 		}
// 	}
// }			


class A{
	public static void main(String[] args) {
		int num = 2;
		while(num%2==0){
		
			System.out.print(next);
		}
		else{
			System.out.print(stop);
		}
	}
}