class Book{
	void canBuy(){
		System.out.println("can buy from store");
    }
}
class Student extends Book{
	void canRead(){
		System.out.println("Student can red");
	}
}
class Topic extends Book{
	void isAny(){
		System.out.println("different Topics");
	}
}
class Line extends Book{
	void haveMany(){
		System.out.println("many lines");
	}
}
class Hierarchial{
	public static void main(String[] args) {
		Line obj1 = new Line();
		Topic obj2 = new Topic();
		obj1.haveMany(); obj1.canBuy();
		obj2.isAny(); obj2.canBuy();
	}
}

///  ......

class Demo{
	int id;
}

class Hierar{
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.id = 101;
		obj2.id = 102;

		System.out.println();
	}
}