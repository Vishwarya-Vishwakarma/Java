// ....... reverse .....

//  class Demo{
// 	int rev = 0, rem;

// 	int reverseNum(int a){
// 	if(a>0){
// 	rem = a % 10; // 2,5,4
// 	rev = rev * 10 + rem; // 2,25,254
// 	reverseNum(a/10); // 45,4
// 	}
// 	return rev;
// 	}
//  }
//  class Main{
// 	public static void main(String[] args){
// 	System.out.println(new Demo().reverseNum(452));
// 	}
// }

// ...... OR ......

//  class Demo{
// 	int rev = 0, rem;

// 	int reverseNum(int a){
// 		if(a>0){
// 			rem = a % 10;
// 			rev = rev * 10 + rem;
// 			reverseNum(a/10); /// doubt
// 		}
//  	return rev;
// 	}
// }
// class Main{
// public static void main(String[] args) {
// 	Demo o = new Demo();
//    System.out.print(o.reverseNum(254));		
// 	}
// }

