package ingeritance.test1;

public class KIA extends Car {
	String modelNum;
	String color;
	
	public KIA() {
		
	}
	public void drive() {
		System.out.println("KIA 자동차가 주행중이다.");
	}
	
	public void stop() {
		System.out.println("KIA 자동차가 멈추다");
		
	}
	
	public void turn(String direction) {
		System.out.println("KIA 자동차가 "+direction+"회전한다. ");
	}

}
