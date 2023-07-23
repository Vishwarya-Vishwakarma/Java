// JAVA String LENGTH():

// class example{
// 	public static void main(String args[]) {
// 		String s1="Hello";
//      String s2="whatsup";
// 		System.out.println("string length is:"+s1.length()); // 5
// 		System.out.println("string length is:"+s2.length()); // 7
// 	}
// }

// JAVA string CompareTo():

//  class CompareToExample{
// 	public static void main(String[] args) {
// 		String s1 = "hello";
// 		String s2 = "hello";
// 		String s3 = "hemlo";
// 		String s4 = "flag";
// 		System.out.println(s1.compareTo(s2));  //0
// 		System.out.println(s1.compareTo(s3));  //-1
// 		System.out.println(s1.compareTo(s4));  //2
// 	}
// }

// JAVA String concat():

// class Concat{
// 	public static void main(String []args){
// 		String s1 = "hello";
// 		s1=s1.concat(" how are you");
// 		System.out.print(s1);
// 	}
// }

// JAVA String IsEmpty():

// class IsEmpty{
// 	public static void main(String []args){
// 		String s1 = "";
// 		String s2 = "hello";
// 		System.out.println(s1.isEmpty());  // true
// 		System.out.println(s2.isEmpty());  //false
// 	}
// }

// JAVA String Trim():

// class StringTrimExample{
// 	public static void main(String[] args) {
// 	    String s1 = " hello ";
// 		System.out.println(s1+"How are you"); //without trim, o/p hello How are you
// 		System.out.println(s1.trim()+"How are you"); // with trim,o/p helloHow are you
// 	}
// }

// JAVA String toLowerCase();

// class StringLowerExample{
// 	public static void main(String[] args) {
// 		String s1 = "HELLO HOW Are You ?";
// 		String s1lower = s1.toLowerCase();  // o/p hello how are you
// 		System.out.print(s1lower);
// 	}
// }

//JAVA Srting toUpperCase();

// class StringUpperExample{
// 	public static void main(String[] args) {
// 		String s1 = "how are you ?";
// 		String s1upper = s1.toUpperCase();
// 		System.out.print(s1upper); //o/p HOW ARE YOU ?
// 	}
// }


// JAVA String valueOf();

// class StringValueOfExample{
// 	public static void main(String[] args) {
// 		int value = 20;
// 		String s1 = String.valueOf(value);
// 		System.out.print(s1+17);   //o/p 2017
// 	}
// }

//JAVA String replace(Char Sequence target,CharSequence replacement)

// class ReplaceExample{
// 	public static void main(String[] args) {
// 		String s1 = "Hey,welcome to ACME";
// 		String replaceString=s1.replace("ACME","IIJT");
// 		System.out.print(replaceString);
// 	}
// }

//JAVA String contains():

// class ContainsExample{
// 	public static void main(String[] args) {
// 		String name = "hello how are you doing";
// 		System.out.println(name.contains("how are you"));
// 		System.out.println(name.contains("fine"));
// 	}
// }

//JAVA String replace();
 
// class Replace{
// 	public static void main(String[] args) {
// 		String s1 = "hellow how are you";
// 		String replaceString=s1.replace('h','t');
// 		System.out.print(replaceString);  // tellow tow are you// 	
//  }
// }

// ....OR..

// class replace{
// 	public static void main(String[] args) {
// 		String s1 = "Hey, welcome to acme ";
// 		System.out.print(s1.replace("acme","pgl")); // Hey, welcome to pgl
// 	}
// }

// JAVA String contains():

// class Contains{
// 	public static void main(String[] args) {
// 	String s1 = "hellow how are you";
// 	System.out.println(s1.contains("how you"));	//false
// 	System.out.println(s1.contains("fine"));//false
// 	System.out.println(s1.contains(" ")); //true
// 	System.out.println(s1.contains("")); // true
// 	System.out.println(s1.contains("    ")); //false
// 	System.out.println(s1.contains("hellow")); // true
// 	}
// }

// JAVA String equals():

// class Equals{
// 	public static void main(String[] args) {
// 		String s1 = "hellow";
// 		String s2 = "hellow";
// 		String s3 = "hi";
// 		String s4 = "HELLOW";
// 		System.out.println(s1.equals(s2)); // true
// 		System.out.println(s1.equals(s3)); //false
// 		System.out.println(s1.equals(s4)); // false
// 	}
// }

// class Equals{
// 	public static void main(String[] args) {
// 		String s1 = "hellow";
// 		String s2 = "hellow";
// 		String s3 = "hi";
// 		String s4 = "HELLOW";
// 		System.out.println(s1.equalsIgnoreCase(s2)); // true
// 		System.out.println(s1.equalsIgnoreCase(s3)); //false
// 		System.out.println(s1.equalsIgnoreCase(s4)); // true
// 	}
// }


// JAVA String toCharArray():

// class CharArray{
// 	public static void main(String[] args) {
// 		String s1 = "bmnvhgdytiujn";
// 		char[]ch = s1.toCharArray();
// 		 for(int i=0; i<ch.length; i++){
// 		System.out.print(ch[i]);
// 	    }
//     }
// }

// JAVA String GetsBytesExample():

// class GetsBytes{
// 	public static void main(String[] args) {
// 		String s1 = "ABC";
// 		//String s2 = "BHM";
// 		byte[] b = s1.getBytes();
// 		for(int i=0; i<b.length; i++){
// 			System.out.print(b[i]);
// 		}
// 	}
// }

//JAVA String isEmpty():

// class IsEmpty{
// 	public static void main(String[] args) {
// 		String s1 = "";
// 		String s2 = "gtbytg";
// 		System.out.println(s1.isEmpty()); //true
// 		System.out.println(s2.isEmpty()); //false
// 	}
// }

// JAVA String endsWith():

// class EndsWith{
// 	public static void main(String[] args) {
// 		String s1 = "hellow how are you";
// 		System.out.println(s1.endsWith("u")); //true
// 		System.out.println(s1.endsWith("you")); //true
// 		System.out.println(s1.endsWith(" ")); // false
// 		System.out.println(s1.endsWith(" you")); //true
// 		System.out.println(s1.endsWith("are")); // false
// 		System.out.println(s1.endsWith("   you")); // false
// 	}
// }