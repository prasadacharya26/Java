class Wolken{
	byte id;
	String name;
	String email_id;
	long contact;
	
	Wolken(){
		System.out.println("Default Constructor");
	}
	void detailDefault(){
		System.out.println("");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Email id: "+email_id);
		System.out.println("Contact Number: "+contact);
	}
	Wolken(String name){
		this.name = name;
	}
	Wolken(byte id){
		this.id = id;
	}
	void detailSingle(){
		System.out.println("");
		System.out.println("Single parameter:");
		System.out.println("Id: "+id);
	}
	Wolken(byte id,String name,String email_id,long contact){
		this(id);
		this.name = name;
		this.email_id = email_id;
		this.contact = contact;
	}
	void detailParameter(){
		System.out.println("");
		System.out.println("All parameter:");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Email id: "+email_id);
		System.out.println("Contact Number: "+contact);
	}
}