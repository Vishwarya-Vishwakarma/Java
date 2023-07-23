// Exception Handling     // pg 152, doubt in 162

// without using excep. hand

// class ExceptionlHandlingPro1{
// 	public static void main(String[] args) {
// 		int a = 19/0; // it will throw arithmetic exception
// 		System.out.print("The rest part of code");
// 	}
// }


// .......

// class ExceptionlHandlingPro2{
// 	public static void main(String[] args) {
// 		try{
// 			int val = 11/0;
// 		}
// 		catch(ArithmeticException e){    // doubt
// 			System.out.println("Error : "+e);
// 		}
// 		System.out.println("Rest of the code");
// 	}
// }                     


//.....

// class ExceptionHandlingPro2{
// 	public static void main(String[] args) {
// 		try{
// 			int val = 11/0;
// 		}
// 		catch(ArithmeticException e){
// 			System.out.println("Number is divisible by zero: not valid");
// 		}
// 		System.out.println("Rest of the code");
// 	}
// }


// 
// if in try block exception is occur then rest of the definition in try block is not execute.

// class ExceptionHandlingPro3{
// 	public static void main(String[] args) {
// 		try{
// 			int val = 11/0; // may throw exception
// 			System.out.println("rest of the code");
// 			// if exception occur, the remaining statement will not execute 
// 		}
// 		// handling the exception
// 		catch(ArithmeticException e){
// 			System.out.println("u r dividing a no. by zero");
// 		}
// 	}
// }  


// handling the exception by using Exception class

// class ExceptionHandlingPro4{
// 	public static void main(String[] args) {
// 		try{
// 			int val = 20/0; // may throw exception
// 		}
// 		// handling the exception by using Exception class
// 		catch(ArithmeticException e){
// 			System.out.println(e);
// 		}
// 		System.out.println("rest of the code");
// 	}
// }


//......... 

// class TryCatchExample5{
// 	public static void main(String[] args) {
// 		try{
// 			int val = 40\0; // may throw exception
// 		}
// 		// handling the exception
// 		catch(Exception e){
// 			// displaying the custom message  /////.......
// 			System.out.print("Can't divide by zero");
// 		}
// 	}
// }