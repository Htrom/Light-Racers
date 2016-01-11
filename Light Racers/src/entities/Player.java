package entities;

public class Player {

	private double xPos;
	private double yPos;
	
	private double mass;
	private double speed;
	private double cEnergy;
	private double maxEnergy;

	
	private boolean ftl = false;
	private boolean gainingEnergy = false;
	
	public Player(double xPos, double yPos, double mass, double speed, double maxEnergy){
		this.xPos = xPos;
		this.yPos = yPos;
		this.mass = mass;
		this.speed = speed;
		this.cEnergy = maxEnergy;
		this.setMaxEnergy(maxEnergy);
	}
	
	public double getxPos() {
		return xPos;
	}
	public void setxPos(double xPos) {
		this.xPos = xPos;
	}
	public double getyPos() {
		return yPos;
	}
	public void setyPos(double yPos) {
		this.yPos = yPos;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getcEnergy() {
		return cEnergy;
	}
	public void setcEnergy(double cEnergy) {
		this.cEnergy = cEnergy;
	}
	public boolean isFtl() {
		return ftl;
	}
	public void setFtl(boolean ftl) {
		this.ftl = ftl;
	}
	public boolean isGainingEnergy() {
		return gainingEnergy;
	}
	public void setGainingEnergy(boolean gainingEnergy) {
		this.gainingEnergy = gainingEnergy;
	}
	public double getMaxEnergy() {
		return maxEnergy;
	}
	public void setMaxEnergy(double maxEnergy) {
		this.maxEnergy = maxEnergy;
	}
	
}
