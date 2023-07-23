// class Demo{
// 	int id;

// }
// class Test{
// 	public static void main(String[] args) {
// 		Demo obj1 = new Demo();
// 		Demo obj2 = new Demo();
// 		Demo obj3 = new Demo();

// 		obj1.id = 101;
// 		obj2.id = 102;
// 		obj3.id = 103;

// 		System.out.print(obj1.id);
// 		System.out.println(obj2.id);
// 		System.out.print(obj3.id);
// 	}
// }

// que. [1,2,3,4,5,6,7,8] .find 1st position + last pos. then 2nd + last 2nd similarly repeat this.

// class SumOfFirstLast{
// 	public static void main(String[] args) {
// 		int arr[] = {1,2,3,4,5,6,7,8};
// 		int len = arr.length-1;

// 		for(int i=0; i<=(arr.length-1)/2; ++i){
// 			System.out.println(arr[i]+arr[len]);
// 			--len;
// 		}
// 	}
// }

// ........without creating another class, function call in same class

// class Test{
// 	void show(){
// 		System.out.print("showing....");
// 	}
// 	public static void main(String[] args){
// 		new Test().show();
// 	}
// }

