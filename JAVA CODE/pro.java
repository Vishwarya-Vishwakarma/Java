// class Pro{
// 	public static void main(String[] args) {
// 		int a=128;


// 		if (a%10 == 7)
// 			System.out.print("buzz");
// 		else
// 			System.out.print("nothing");
// 	}
// }

// prime no.

// class Main{
// 	public static void main(String[] args) {
// 	 int count = 0;	
// 	 int a = 6;
// 	  for(int i=1; i<=a; ++i){
// 	    if (a%i==0){
// 		count++; // 1,2,3,....n
// 	    }
// 	  }
// 	if(count ==2)
// 	System.out.println("PN");    
// 	else
// 	System.out.println("NOT PN");
// 	}
// }

// ..........

// class Continue{
// 	public static void main(String[] args) {
// 		int arr[] = {1,2,3,4,5,6,7,8};
// 		for(int i=0, j=arr.length-1; i<=(arr.length-1)/2; ++i, --j){
// 			System.out.println(arr[i]+arr[j]);
// 		}
// 	}
// }

//  ........ or ........

class Test{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int len = arr.length-1;
		for(int i = 0; i<=(len-1/2); ++i){
			System.out.print(arr[i]+arr[len]);
			--len;
	}
}
