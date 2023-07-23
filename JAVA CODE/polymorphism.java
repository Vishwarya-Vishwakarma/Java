// class Polymorphism{
// 	void add(int a ,int b ){
// 		System.out.println(a+b);
// 	}

// 	void add(int a , int b, int c){
// 		System.out.println(a+b+c);
// 	}
    
//     void add(int a, float b){
//     	System.out.println(a+b);
//     }

//     void add(int a, double b, int c){
//     	System.out.println(a+b+c);
//     }
// }
// class Main{
// 	public static void main(String[] args) {
// 		Polymorphism o = new Polymorphism();
// 		o.add(2,3);
// 		o.add(1,2,3);
// 		o.add(2,34.45f);
// 		o.add(2,23.5678,5);
// 	}
// }    

// class Maths{
// 	void Topic(){
// 		System.out.println("HCF LCM");
// 	}
// 	void Topic(){
// 		System.out.println("module ");
// 	}
// 	void Topic(double b){
// 		System.out.println(" svm "+b);
// 	}
// 	void Topic(float f){
// 		System.out.println("gvyu "+f);
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		Maths o = new Maths();
// 		o.Topic();
// 		o.Topic();
// 		o.Topic(34.567);
// 		o.Topic(4.1f);

// 	}
// }

// class Poly{
// 	void add(String a , String b){
// 		System.out.println(a+b);
// 	}
// 	void add(int a , int b){
// 		System.out.println(a+b);

// 	}
// 	void add(char ab , char bh){
// 		System.out.println(ab+bh);
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		Poly O = new Poly();
// 		O.add("apple " , "mango");
// 		O.add(2,8);
// 		O.add("k" ,"j");
// 	}
// }

// class Poly{
// 	void area(int r , float pi){
// 		System.out.println("Circle "+pi*r*r);
// 	}
// 	void area(float l, int b){
// 		System.out.println("rectangle "+l*b);
// 	}
// 	void area(int b , double h){
// 		System.out.println("Triangle "+(b*h)/2);
// 	}
// 	void area(int side , int o ){
// 		System.out.print("Pentagon "+(side*o)/5);
// 	}
// }
// class Main{
// 	public static void main(String[] args) {
// 		Poly o = new Poly();
// 		o.area(2,3.14f);
// 		o.area(2.0f,4);
// 		o.area(4,8.34);
// 		o.area(5,10);
// 	}
// }