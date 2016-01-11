package entities;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;

public class Player {

	private Circle playerCirc;
	
	private double xPos;
	private double yPos;
	
	private double mass;
	private double speed;
	private double cEnergy;
	private double maxEnergy;
	private double force = 0;
	private String dir = "stopped";

	
	private boolean ftl = false;
	private boolean gainingEnergy = false;
	
	public Player(double xPos, double yPos, double mass, double speed, double maxEnergy){
		this.xPos = xPos;
		this.yPos = yPos;
		this.mass = mass;
		this.speed = speed;
		this.cEnergy = maxEnergy;
		this.setMaxEnergy(maxEnergy);
		playerCirc = new Circle((float)xPos, (float)yPos, (float)(Math.sqrt(mass)));
	}
	
	public void move(){
		if(dir.equals("up")){
			force = -1;
		}else if(dir.equals("down")){
			force = 1;
		}else if(dir.equals("stopped")){
			force = 0;
		}
		
		xPos += speed;
		yPos += force;

		System.out.println("ran");
	}
	
	public Circle getPlayerCirc() {
		return playerCirc;
	}

	public void setPlayerCirc(Circle playerCirc) {
		this.playerCirc = playerCirc;
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public void convert(String s){
		
		if(cEnergy>0){
			if(s.equals("slower")){
				mass += 10;
				speed -= 0.1;
			}
			
			if(s.equals("faster")){
				mass -= 10;
				speed += 0.1;
			}
			
			cEnergy--;
			playerCirc.setRadius((float) Math.sqrt(mass));
		}
	}
	
	public void draw(Graphics g){
		playerCirc.setX((float)xPos);
		playerCirc.setY((float)yPos);
		
		g.draw(playerCirc);
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
