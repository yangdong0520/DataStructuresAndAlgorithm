package easyFactory;


public class LightWeaponFactory {
	public static  Weapon getWeapon(String type) {
		Weapon weapon=null;
		if(type.equalsIgnoreCase("pistol")) {
			weapon=new Pistol();
		}
		else if(type.equalsIgnoreCase("rifle")) {
			weapon=new Rifle();
		}
		else if(type.equalsIgnoreCase("submachinegun")) {
			weapon=new SubMachineGun();
		}
		else {
			System.out.println("please input ");
		}
			
		return weapon;
		
	}
	
}