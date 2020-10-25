package easyFactory;


public class SubMachineGun implements Weapon {
	int count = 500;
	String use="射速快";
	@Override
	public void create() {
		
		System.out.println("SubMachineGun has been created!");

	}

	

}
