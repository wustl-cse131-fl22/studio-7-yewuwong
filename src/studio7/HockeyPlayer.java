package studio7;

public class HockeyPlayer {
	private String name;
	private int jersey;
	private boolean rHand;
	private boolean shootRight;
	private int games;
	private int goals;
	private int assists;
	private int points;
	
	public HockeyPlayer(String n, int j, boolean hand, boolean shoot) {
		name = n;
		jersey = j;
		rHand = hand;
		shootRight = shoot;
		games = 0;
		goals = 0;
		assists = 0;
		points = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJersey() {
		return jersey;
	}
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	public boolean isrHand() {
		return rHand;
	}
	public void setrHand(boolean rHand) {
		this.rHand = rHand;
	}
	public boolean isShootRight() {
		return shootRight;
	}
	public void setShootRight(boolean shootRight) {
		this.shootRight = shootRight;
	}
	
	public void playGame (int g, int a) {
		games++;
		goals += g;
		assists += a;
		points += g + a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
