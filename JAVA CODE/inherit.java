// 1____SINGLE INHERITANCE

// ..... papa ... me ...

// class Parent{
// 	void display1(){
// 		System.out.println("papa");
// 	}
// }
// class Child extends Parent{
// 	void display2(){
// 		System.out.println("me");
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Child obj = new Child();
// 		obj.display1();
// 		obj.display2();
// 	}
// }


// PRINT WALK AND RUN.

// class A{
// 	void display1(){   // method
// 		System.out.println("WALK");
// 	}
// }
// class B extends A{
// 	void display2(){
// 		System.out.println("RUN");
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		B o = new B();   //object create of class B , WHICH name is o
// 		o.display1();     // calling method with child class object
// 		o.display2();     // calling method with child class object
// 	}
// }

//...PRINT SUM OF TWO NO.

// class Saumya{
// 	int a=3;
// 	void print(){
// 	System.out.println("khana");
//  }
// }
// class Omi extends Saumya{
// 	int b=5;
// 	void sum(){
// 		System.out.println(a+b);
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Omi obj = new Omi();
// 		obj.sum();
// 		obj.print();
// 	}
// }


// pgl..sum

// class Vishu{
// 	void display1(){
// 		System.out.println("pgl");
// 	}
// }
// class Muskan extends Vishu{
// 	void display2(int a,int b){
// 		System.out.println(a+b);
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Muskan obj = new Muskan();
// 		obj.display1();
// 		obj.display2(7,3);
// 	}
// }


//FIND AVERAGE OF FIRST 10 NATURAL NO.

// class Parent{
// 	int sum=0;
// 	void add(int a){
// 		for(int i=0;i<=a;++i){
// 			sum= sum+i;
// 	    }
//     }
// }
// class Child extends Parent {
// 	double avg=0 ;
// 	void  avg(int a){
// 		System.out.print("avg="+sum/a);
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Child obj = new Child();
// 		obj.add(10);
// 		obj.avg(10);
// 	}
// }

//2____ MULTILEVEL INHERITANCE

// .... PRINT INTEGER , FLOAT , CHARACTER ....

// class Grandparent{
//  	int a = 10;
// }
// class Parent extends Grandparent{
// 	float PI = 3.14f;
// }
// class Child extends Parent{
// 	char ch = 'a';
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Child obj = new Child();
// 		System.out.println(obj.a);
// 		System.out.println(obj.PI);
// 		System.out.println(obj.ch);
// 	}
// }

// class Baba{
// 	void display1(int a){
// 		System.out.println(a);
// 	}
// }
// class Papa extends Baba{
// 	void display2(float pi){
// 		System.out.println(pi);
// 	}
// }
// class Me extends Papa{
// 	void display3(char g){
// 		System.out.println(g);
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Me obj = new Me();
// 		obj.display1(1);
// 		obj.display2(2.34f);
// 		obj.display3('v');
// 	}
// }

// ..... HIERARCHIAL INHERITANCE .......

// class Employee{
// 	int id;
// 	String name;
// 	double salary;
// 	void getData(){
// 		System.out.println("Id : "+id+ " Name : "+name+ " Salary : "+salary);
// 	}
// }
// class Developer extends Employee{
// 	void setDev(){
// 		System.out.println("m Developer");
// 	}
// }
// class Designer extends Employee{
// 	void setDes(){
// 		System.out.println("m Designer");
// 	}
// }
// class Hierarchial{
// 	public static void main(String[] args) {
// 		Developer obj = new Developer();
// 		obj.id=123;
// 		obj.name="pgl";
// 		obj.salary=7837.473;
// 		obj.setDev();
// 		obj.getData();
// 	}
// }

// ..... OR ..........

// class Employee{
// 	int id;
// 	String name;
// 	double salary;
// 	void getData(){
// 		System.out.println("Id : "+id+" Name : "+name+" Salary : "+salary);
// 	}
// }
// class Developer extends Employee{
// 	void setDev(){
// 		System.out.println("M Developer");
// 	}
// }
// class Designer extends Employee{
// 	void setDes(){
// 		System.out.println("m Designer");
// 	}
// }
// class Oops{
// 	public static void main(String[] args) {
// 		Developer obj = new Developer();
// 		obj.getData();    // before giving value we call.. elsy null
// 		obj.id = 123;
// 		obj.name = "pgl";
// 		obj.salary = 3432.78278;
// 		obj.setDev();
// 	}
// }

// Multiple inheritance is not supported in java

// class A{
// 	void display(){
// 		System.out.print("M");
// 	}
// }
// class B {
// 	void display{
// 		System.out.print("v");
// 	}
// }
// class C extends A,B{ // errors occurs here

// }
// class Oops{
// 	public static void main(String[] args) {
// 		C obj = new C();
// 		obj.display();
// 	}
// }

//  .... Overloading in Inheritance ......

// class parent
// {
// 	void showParent(int x)
// 	{
// 		System.out.println(x);
// 	}
// }
// class child extends parent
// {
// 	void showParent(int x,int y)
// 	{
// 		int z=x+y;
// 		System.out.println(z);
// 	}

// }
// class soomu
// {
// 	public static void main(String[] args) 
// 	{
//       child obj=new child();
//       obj.showParent(5);
//       obj.showParent(2,5);		
// 	}
// }

// class Car{
// 	void show(){
// 		System.out.println("This is CAR");
// 	}
// }
// class Bmw extends Car{
// 	Bmw(){
// 		System.out.println("This is BMW");
// 	}
// }
// class Audi extends Car{
// 	Auddy(){
// 		System.out.println("This is Audi");
// }
// class Main{
// 	public static void main(String[] args) {
// 		Bmw obj = new Bmw();
// 		Audi obj = new Audi();
// 		obj.show();
// 		obj.show();
// 	}
// }