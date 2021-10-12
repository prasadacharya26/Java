public class Country{
	private String name;
	private String capital;
	private byte noofstates;
	private short population;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setCapital(String capital){
		this.capital = capital;
	}
	public String getCapital(){
		return capital;
	}
	public void setNoofState(byte noofstates){
		this.noofstates = noofstates;	
	}
	public byte getNoofState(){
		return noofstates;
	}
	public void setPopulation(short population){
		this.population = population;	
	}
	public short getPopulation(){
		return population;
	}
}