// .......... o/p welcome to vote 
//                rest of the code...

// class ThrowPro1{
// 	static void validate(int age) {
// 		if(age<18)
// 			throw new ArithmeticException("not valid");
// 		else
// 			System.out.println("welcome to vote");
// 	}
// 	public static void main(String[] args) {
// 		validate(25);
// 		System.out.println("rest of the code ....");
// 	}
// }

//  O\P Arithmetic Exception 

// class ThrowPro1{
// 	static void validate(int age) {
// 		if(age<18)
// 			throw new ArithmeticException("not valid");
// 		else
// 			System.out.println("welcome to vote");
// 	}
// 	public static void main(String[] args) {
// 		validate(5);
// 		System.out.println("rest of the code ....");
// 	}
// }


//  ...  o/p 200
//        Rest of the code

// class ThrowPro2{
// 	public static void main(String[] args) {
// 		int i=10, j=20, k ;
// 		try{
// 			k=i*j;
// 			if(k>500){
// 				throw new ArithmeticException();
// 			}
// 			System.out.println(+k);
// 		}
// 		catch(ArithmeticException e){
// 			System.out.println("ArithmeticException");
// 		}
// 		System.out.println("Rest of the code");
// 	}
// }


//....or   .... o/p ArithmeticException
//                  Rest of the code

// class ThrowPro2{
// 	public static void main(String[] args) {
// 		int i=30, j=20, k ;
// 		try{
// 			k=i*j;
// 			if(k>500){
// 				throw new ArithmeticException();
// 			}
// 			System.out.println(+k);
// 		}
// 		catch(ArithmeticException e){
// 			System.out.println("ArithmeticException");
// 		}
// 		System.out.println("Rest of the code");
// 	}
// }

// 3.........

// class ThrowPro3{
// 	static void checkEligibilty(int stdAge, int stdWeight){
// 		if(stdAge<12 && stdWeight<40){
// 			throw new ArithmeticException("Student is not eligible for registration");
// 		}
// 		else{
// 			System.out.println("Student Entry is Valid!!");
// 		}
// 	}
// 	public static void main(String args[]){
// 		System.out.println("Welcome to the Registration Process!!");
// 		checkEligibilty(15,59);
// 		System.out.println("Have a nice day ..");
// 	}
// }


// ...    or         exception occur

// class ThrowPro3{
// 	static void checkEligibilty(int stdAge, int stdWeight){
// 		if(stdAge<12 && stdWeight<40){
// 			throw new ArithmeticException("Student is not eligible for registration");
// 		}
// 		else{
// 			System.out.println("Student Entry is Valid!!");
// 		}
// 	}
// 	public static void main(String args[]){
// 		System.out.println("Welcome to the Registration Process!!");
// 		checkEligibilty(15,59);
// 		System.out.println("Have a nice day ..");
// 	}
// }


// 4 ..............

