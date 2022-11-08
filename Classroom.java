public class Classroom extends Wilder {

	public Classroom(String firstName, Boolean aware) {
		super(firstName, aware);
		
	}

	public static void main(String[] args) {
	Wilder wilder1 = new Wilder("Otire",true);
	Wilder wilder2 = new Wilder("Tic",true);
	Wilder wilder3 = new Wilder("Jean-Lorem",false);
	Wilder wilder4 = new Wilder("Tac",false);
	
	Wilder[] table = {wilder1,wilder2,wilder3,wilder4};
	for(int i=0;i < table.length;i++) {
		System.out.println(table[i].whoAmI());
	}
	
	}

}