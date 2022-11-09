// 🔬Exercice

// Créer une classe Administratorqui doit représenter un administrateur système d'une application Web.
// Un administrateur doit avoir ces propriétés :

//     namede type String
//     emailde type String
//     activede type boolean

// Pas

//     Mettre en place name, email, et activeen tant qu'attributs privés de la nouvelle classe Administrator.
//     Implémenter un constructeur pour nameet email, qui définit les attributs sur les valeurs de paramètre et activec'est faux.
//     Implémentez un autre constructeur qui prend les trois attributs comme paramètres et définit les attributs sur les valeurs des paramètres.
//     Implémentez Getters et Setters pour tous les attributs, notez le modèle différent pour booleanles types.

public class Administrator {

    private String name;
    private String email;
    private boolean active;

    public Administrator(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Administrator(String name, String email, boolean active) {
        this.name = name;
        this.email = email;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}

// 🔬Exercice

// Prolonge la classe Administratorpour une méthode checkIfActive()qui renvoie une chaîne Je suis NOM 
// et je suis actuellement ACTIF où NOM est l'attribut nameet ACTIVE est l'attribut active. 

public class Administrator {

    // omitted the attributes, getters, setters, and constructors here for brevity.

    // possible if-then-else solution
    public String checkIfActive() {
        if (this.active) {
            return "I am " + this.name + " and I am currently active";
        } else {
            return "I am " + this.name + " and I am currently inactive";
        }
    }


    // shorter solution with ternary operator
    public String checkIfActive() {
        return "I am " + this.name + " and I am currently " + ((this.active) ? "active" : "inactive");
    }

}
