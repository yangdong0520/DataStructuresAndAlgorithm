package easyFactory;

public class Client {

	public static void main(String args[]) {
		Weapon weapon;
		weapon=LightWeaponFactory.getWeapon("Submachinegun");
		weapon.create();
	}
}
