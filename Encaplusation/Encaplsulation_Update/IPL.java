public class IPL{
	private String name;
	private String captain;
	private String coach;
	private byte totalWon;
	private byte points;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setCaptain(String captain){
		this.captain = captain;
	}
	public String getCaptain(){
		return captain;
	}
	public void setCoach(String coach){
		this.coach = coach;
	}
	public String getCoach(){
		return coach;
	}
	public void setTotalWon(byte totalWon){
		this.totalWon = totalWon;	
	}
	public byte getTotalWon(){
		return totalWon;
	}
	public void setPoints(byte points){
		this.points = points;	
	}
	public byte getPoints(){
		return points;
	}
}