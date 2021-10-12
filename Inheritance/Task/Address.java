public class Address{
	private byte house_no;
	private String area;
	private String city;
	private String state;
	private String country;
	private long pincode;
	
	public void setHouseNo(byte house_no){
		this.house_no=house_no;
	}
	public byte getHouseNo(){
		return house_no;
	}
	public void setArea(String area){
		this.area=area;
	}
	public String getArea(){
		return area;
	}
	
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return city;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return country;
	}
	public void setCountry(String country){
		this.country=country;
	}
	public String getCountry(){
		return country;
	}
	public void setPincode(long pincode){
		this.pincode=pincode;
	}
	public long getPincode(){
		return pincode;
	}
}