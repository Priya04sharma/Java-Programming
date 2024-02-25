class Car {

	public static void main(String arg[])
	{
		car1 c1;
		ELctric_car e1=new ELctric_car();
		petrol_car p1=new petrol_car();
		c1=e1;
		c1.drive();
		e1.charge();	
		c1=p1;
		c1.drive();
		p1.fillup();	
	}
}
        interface car1{
	public void drive();
}
class ELctric_car implements car1{
	int battery=80;
	public void drive(){
		System.out.println("\nDriving the electric car.");	
	}
	public void charge(){
		if(battery==0){
			System.out.println("\nPlease charge car!");
		}
		else{
		System.out.println("Car is charge u can use it.");
		}
	}
}
class petrol_car implements car1{
	int petrol=5;
	public void drive(){
		System.out.println("Driving the petrol car.");
	}
	public void fillup() {
		if(petrol<2){
			System.out.println("fill up the petrol ");
		}
		else{
			System.out.println("You can drive the car.");
		}	
	}
}
