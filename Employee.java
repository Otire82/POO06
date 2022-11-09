// 🔬Exercice

// Créer la classe Employeequi s'étend User:

//     pour un attribut entrydatelequel est LocalDateet donne des informations sur le début de l'emploi de ce Employee.
//     pour une méthode displayEmploymentInformation()qui renvoie une chaîne Je suis NAME et je travaille ici depuis ENTRYDATE où NAME est l'attribut nameet ENTRYDATE est l'attribut entrydate.


public class Employee extends User {

    private LocalDate entrydate;

    public Employee(String name, LocalDate birthdate) {
        super(name, birthdate);
        // if no entrydate is passed, it is assumed to be today
        this.entrydate = LocalDate.now();
    }

    public Employee(String name, LocalDate birthdate, LocalDate entrydate) {
        super(name, birthdate);
        this.entrydate = entrydate;
    }

    public String displayEmploymentInformation() {
        return "I am " + getName() + " and I am working here since " + entrydate;
    }

}

// ☝️Résumé

// Nous avons couvert beaucoup de concepts, vous savez maintenant comment :

//     Créer des classes abstraites
//     Créer des classes qui héritent de classes abstraites
//     Créer des instances de classes qui héritent d'une classe abstraite
//     Créer des références à ces instances
//     Appeler des méthodes étendues à partir de classes héritées

