// ...........

// class TestFinallyBlockPro1{
// 	public static void main(String[] args) {
// 		try{
// 			int data = 20/0;
// 			System.out.println(data);
// 		}
// 		catch(Exception kuxv){
// 			System.out.println("Go home and take rest..."+kuxv);
// 		}
// 		finally{
// 			System.out.println("finally block is always Executed");
// 		}
// 		System.out.println("rest of the code");
// 	}
// }


// .................. 

// class TestFinallyBlockPro2{ 
// 		public static void main(String[] args) {
// 		try{
// 	      int data=25/0;
// 	      System.out.println(data);
// 		}	
// 		catch(NullPointerException e){
// 			System.out.println(e);
// 		}
// 		finally{
// 			System.out.println("finally block is always Executed");
// 		}
// 		System.out.println("rest of the code...");
// 	}	
// }


//.....


// class TestFinallyBlockPro3{
//   public static void main(String[] args) {
//   	try{
//   		int data = 25/0;
//   		System.out.println(data);
//   	}
//   	catch(ArithmeticException e){
//   		System.out.println(e);
//   	}
//   	finally{
//   		System.out.println("finally block is always Executed");
//   	}
//   	System.out.println("rest of the code ...");
// 	}
// }


// //  .........

// class TestFinallyBlockPro3{
// 	public static void main(String[] args) {
// 		try{
// 			int data = 25/0;
// 			System.out.println(data);
// 		}
// 		catch(ArithmeticException e){
// 			System.out.println(e);
// 		}
// 		finally{
// 			System.out.println("finally block is always executed");
// 		}
// 		System.out.println("rest of the code");
// 	}
// }