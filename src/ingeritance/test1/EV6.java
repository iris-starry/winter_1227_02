package ingeritance.test1;

public class EV6 extends KIA {
	int chargeBattery;
	String softwareModel;
	
	public EV6() {
		System.out.println("EV6() 생성자가 호출됨");
	}
	
	public void driveAutonomously() {
		System.out.println("EV6가 자율주행을 하다.");
	}
	@Override
	public void start() {
		System.out.println("EV6가 멈추다.");
	}
	@Override
	public void turn(String direction) {
		System.out.println("EV6가 멈추다.");
	}
}
