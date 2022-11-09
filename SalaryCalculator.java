// 🔬Exercice
//  Créez la classe SalaryCalculator qui implémente Calculator :
//      Le nom doit indiquer un nom d'affichage pour la calculatrice, similaire aux autres calculatrices, sous forme de chaîne.
//      Le taux d'inflation doit être un taux d'inflation annuel attendu sous la forme d'un BigDecimal, par exemple.  BigDecimal.valueOf("1.5") pour un taux d'inflation attendu de 1,5 %.
//      La valeur transmise sur calculer l'invocation doit être le salaire et la valeur renvoyée est le salaire ajusté par le taux d'inflation.

//      Remarque : la méthode de calcul doit renvoyer value.multiply(inflationRate.multiply(100))

public class SalaryCalculator implements Calculator {

    private final BigDecimal inflationRate;

    public SalaryCalculator(BigDecimal inflationRate) {
        this.inflationRate = inflationRate;
    }

    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(100).multiply(inflationRate));
    }

    @Override
    public void reset() {
        // if reset() is not supported for this specific implementation, 
        // an UnsupportedOperationException should the thrown
        throw new UnsupportedOperationException("SalaryCalculator cannot be reset.");
    }

    @Override
    public boolean isReady() {
        return true;
    }
}
