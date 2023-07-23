//print length of array.

// class Len{
// 	public static void main(String[] args){
// 		int []arr={1,2,3,4,5,6,7,8,9,10};
// 		System.out.print(arr.length);
// 	}
// }


//print length of array, and which no. is occur at index 4.

// class Len{
//  	public static void main(String[] args){
//  		int []arr={1,2,3,4,5,6,7,8,9,10};
//  		System.out.println(arr.length);
//  		System.out.println(arr[4]);
//  	}
//  }


// print even no. 

// class Even{
//  	public static void main(String[] args){
//  		int []arr={1,2,3,4,5,6,7,8,9,10};
//  		for(int i=0; i<arr.length; i++){
// 			if(arr[i]%2==0){
//  		       System.out.println(arr[i]);
//  			}
//  	    }
//  	}
//  }


// print 10-1.

// class Array{
// public static void main(String[]args){
// 	int []arr={1,2,3,4,5,6,7,8,9,10};
// 	for(int i=arr.length-1;i>=0;--i){

// 			System.out.println(arr[i]);
// 	}

// }
// }


// print 10-1(only odd no.).

// class Array{
//  public static void main(String[]args){
//  	int []arr={1,2,3,4,5,6,7,8,9,10};
//  	for(int i=arr.length-1;i>=0;--i){
//  			if(arr[i]%2!=0){
//  			System.out.println(arr[i]);
//  	}
// }
//  }
// }
//
// print sum of odd no. from 10 - 1.


// class Array{
// 	public static void main(String[]args){
// 	 	int []arr={1,2,3,4,5,6,7,8,9,10};
// 	 	int sum=0;
// 	 	for(int i=arr.length-1;i>=0;--i){
//  			if(arr[i]%2!=0){
// 				sum=sum+arr[i];
// 			}
//  		}
// 		System.out.println(sum);

// 	}
// }


//......

//print  length and indexing value is given.  
//  class Acme{
//  	public static void main(String[] args){
//  		int arr[]=new int[9];
//  			arr[0]=1;
//  			arr[1]=2;
//  			arr[2]=3;
// 			    arr[3]=4;
// 			    arr[4]=5;
// 			System.out.println(arr[0]);
// 			System.out.println(arr[1]);
// 			System.out.println(arr[2]);
// 			System.out.println(arr[3]);
// 			System.out.println(arr[4]);
//  	}
// }


// above que. using loop.

// class Acme{
// 	 public static void main(String[] args) {
// 	 	int arr[]=new int[5];
//         arr[0]=1;		
//         arr[1]=2;
//         arr[2]=3;
//         arr[3]=4;
//         arr[4]=5;
//         for(int i=0;i<arr.length;++i){
//         	System.out.println(arr[i]);
//         }
// }
// }


// qestion.

// class Pgl{
// 	public static void main(String[] args) {
// 	int arr[]={1,11,111,1111,11111};
// 	for(int i=0;i<arr.length;++i)
// 	System.out.println(arr[i]);	
// 	}
// }


// print sum of first five natural no. using array.

// class Acme{
// 	public static void main(String[] args){
// 		int arr[]={1,2,3,4,5},sum=0;
// 		for(int i=0;i<arr.length;++i){
// 			sum=sum+arr[i];
// 		}
// 			System.out.print(sum);
// 		}
//	}


// print all elements of a matrix.

// class Acme{
//  	public static void main(String[] args){
//  		int arr[][]={
//  			{1,2,3},
//  			{4,5,6},
//  		};
//  		//System.out.print(arr.length); // 2
// 		for(int r=0; r<arr.length; r++){
// 		for(int c=0; c<=arr.length; c++){
// 	        System.out.println(arr[r][c]);
//      }
// 		}
//     }
// }
 

//matrix . print all element of matrix.

// class Acme{
//  	public static void main(String[] args){
//  		int arr[][]={
//  			{1,2},
//  			{4,5},
//  			{8,7},
//  			{0,3},
//  		};

//  		for(int r=0; r<arr.length;r++){  // row>length 
//                                               //that's why we take len. is 4.				

//                     for(int c=0; c<2; c++){
//  				System.out.println(arr[r][c]);
//  			}
//  		}
//  		// System.out.print(arr.length);
// 	}
// }


// Multi dimenstional array.

// class Acme{
// 	 public static void main(String[] args) {
//  	 	int [][]arr = new int[5][5];
//  	 	 arr[0][0]=5;
//          arr[1][1]=1;		
//          arr[2][2]=3;
//          arr[3][3]=4;
//          arr[4][4]=5;
//          for(int i=0;i<arr.length;++i){
//          	System.out.println(arr[i][i]);
//          }
//  }
//  }


// arr[1,2,3,4,6,8] = sum of any pair of element 12. 

// class A{
// 	public static void main(String[] args) {
// 		int arr [] = {1,2,3,4,6,8};
// 		int target = 12;
// 		for(int i=0; i<arr.length; i++){
// 			for(int j=i+1; j<arr.length; j++){
// 				if(arr[i]+arr[j]==target){
// 					System.out.println(arr[i]+" , "+arr[j]);

// 				}
// 			}
// 		}
// 	}
// }
