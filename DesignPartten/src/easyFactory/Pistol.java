package easyFactory;


public class Pistol implements Weapon{
	int coutn = 500;
	String remark ="手枪";

	public int getCoutn() {
		return coutn;
	}

	public void setCoutn(int coutn) {
		this.coutn = coutn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public void create() {
		
		System.out.println("Pistol has been created!");
	}

	
}