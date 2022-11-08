public class Wilder {
	private String firstName;
	private Boolean aware;
	

	public Wilder(String firstName, Boolean aware) {
		super();
		this.firstName = firstName;
		this.aware = aware;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}


	public Boolean getAware() {
		return aware;
	}


	public void setAware(Boolean aware) {
		this.aware = aware;
	}

public  String whoAmI() {
	if(aware.equals(true)) {
		//this.setAware(true);
		return "Je m'appelle:  " + this.getFirstName() + " et je suis  aware";
	}else {
	return "Je m'appelle:  " + this.getFirstName() + " et je suis pas aware";
	}
};
	public static void main(String[] args) {
		
Wilder student = new Wilder("toto",false);

System.out.println(student.whoAmI());
	}
}
