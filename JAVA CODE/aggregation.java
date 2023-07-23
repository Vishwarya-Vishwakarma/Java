// class Serial{
//  		boolean havePlay = true;
// }
// class Movie{
// 		boolean haveActress = true;
// }
// class Cartoon{
// 		boolean haveChotabheem = true;
// }
// class Tv{
// 	// object creation
// 	Serial s = new Serial();
// 	Movie m = new Movie();
// 	Cartoon c = new Cartoon();

// 	void show(){
// 		System.out.println("Serial havePlay : "+ s.havePlay); //through s member ,we excess haveplay
// 		System.out.println("Movie haveActress : "+ m.haveActress); //through m member ,we excess haveActress
// 		System.out.println("Cartoon haveChotabheem : "+ c.haveChotabheem); //through c member ,we excess haveChotabheem
// 	}
// }
// class Aggregation{
// 	public static void main(String[] args) {
// 		Tv o = new Tv();
// 		o.show();  /// call
// 	}
// }




// class Kitchen{
// 	boolean haveGas = true;
// }
// class Bedroom{
// 	boolean haveBed = true;
// }
// class Bathroom{
// 	boolean haveTub = true;
// }
// class House{
// 	Kitchen k = new Kitchen();
// 	Bedroom b = new Bedroom();
// 	Bathroom br = new Bathroom();

// 	void status(){
// 		System.out.println("Kitchen haveGas : "+k.haveGas);
// 		System.out.println("Bedroom haveBed : "+b.haveBed);
// 		System.out.print("Bathroom haveTub : "+br.haveTub);
// 	}
// }
// class Aggre{
// 	public static void main(String[] args) {
// 		House house = new House();
// 		house.status();
// 	}
// }