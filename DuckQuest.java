/**
 * DuckQuest
 */
public class DuckQuest {

    // attribut
    private String name;
    private int age;
    private boolean swimming;

    // constructeur explicite
    public DuckQuest(String name) {
        this.name = name;
        this.age = 0;
        this.swimming = false;
    }

    public DuckQuest(String name, int age) {
        this.name = name;
        this.age = age;
        this.swimming = false;
    }

    // instance
    new DuckQuest("Riri");

    new DuckQuest("Donald", 84);

    // référence
    DuckQuest donald = new DuckQuest("Donald", 84);
    /*  plusieurs références vers la même instance */
    DuckQuest mysterMask = new DuckQuest("Myster Mask");
    DuckQuest albertColvert = mysterMask;

    // Accesseurs
    public int getAge() {
        return this.age;
        DuckQuest fifi = new DuckQuest("Fifi", 8);
        int age = fifi.getAge(); //8
    }
    // cas particulier accesseur boolean
    public boolean isSwimming(){ // pas getAttribut mais isAttribut
        return this.swimming;
    }

    //Mutateurs
    public void setAge(int age) {
        this.age = age;
    }
    DuckQuest fifi = new DuckQuest("Fifi", 8);
    fifi.setAge(9); // 9

    // Méthode d'instance
    public String nameAndAge() {
        return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge());
    }
    DuckQuest loulou = new DuckQuest("Loulou", 10);
    loulou.nameAndAge(); // My name is Loulou and I'm 10

    // Méthode statique
    public static String quack() {
        return "Quanck!";
    }
    DuckQuest.quack(); // Quack!
}