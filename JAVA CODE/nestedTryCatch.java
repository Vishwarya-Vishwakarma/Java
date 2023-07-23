// class NestedTryBlockPro1{
// 	public static void main(String[] args) {
// 	   try{
// 		 try{
// 			System.out.println("going to divide");
// 			int data = 45/0;
// 		 }
// 		 catch(ArithmeticException e){
// 			System.out.println(e);
// 		 }
// 		 try{
// 			int a[] = new int[5];
// 			a[5] = 4; 
// 		 }
// 		 catch(ArrayIndexOutOfBoundsException e){
// 			System.out.println(e);
// 		 }
// 		 System.out.println("other statement");
// 	  }
// 	  catch(Exception e){
// 	  	System.out.println("handeled");
// 	  }
// 	  System.out.println("normal flow");
// 	}
// }


//.. ArrayIndexOutOfBoundsException............

// class NestedTryBlockPro2{
// 	public static void main(String[] args) {
// 		try{
// 			int a[] = {1,2,3,4,5};
// 			System.out.println(a[5]);
// 			try{
// 				int x = a[2] / 0;
// 			}
// 			catch(ArithmeticException e2){
// 				System.out.println(" division by zero is not possible");
// 			}
// 		}
// 		catch(ArrayIndexOutOfBoundsException e1){
// 		  System.out.println("ArrayIndexOutOfBoundsException");
// 		  System.out.println("Element at such index does not exist");
// 		}
// 	}
// }


// ...........

// class NestedTryBlockPro3{
// 	public static void main(String[] args) {
// 		try{
// 			try{
// 				try{
// 					int arr[] = { 1,2,3,4,};
// 					System.out.println(arr[10]);
// 				}
// 				catch(ArithmeticException e){
// 					System.out.println("ArithmeticException");
// 					System.out.println(" try - block 1");
// 				}
// 			}
// 			catch(ArithmeticException e){
// 				System.out.println("ArithmeticException");
// 				System.out.println(" try - block 2");
// 			}
// 		}
// 		catch(ArrayIndexOutOfBoundsException e){
// 			System.out.println("ArrayIndexOutOfBoundsException");
// 			System.out.println(" main try-block");
// 		}
// 		catch(Exception e){
// 			System.out.println("Exception");
// 			System.out.println("handeled in many try-block");
// 		}
// 	}
// }


//..........

// class NestedTryBlockPro3{
// 	public static void main(String[] args) {
// 		try{
// 			try{
// 				try{
// 					int a = 10/0;
					
// 				}
// 				catch(ArithmeticException e){
// 					System.out.println("ArithmeticException");
// 					System.out.println(" try - block 1");
// 				}
// 			}
// 			catch(ArithmeticException e){
// 				System.out.println("ArithmeticException");
// 				System.out.println(" try - block 2");
// 			}
// 		}
// 		catch(ArrayIndexOutOfBoundsException e){
// 			System.out.println("ArrayIndexOutOfBoundsException");
// 			System.out.println(" main try-block");
// 		}
// 		catch(Exception e){
// 			System.out.println("Exception");
// 			System.out.println("handeled in many try-block");
// 		}
// 	}
// }

