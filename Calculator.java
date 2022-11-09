public interface Calculator {

    /**
     * calculate based on the input parameter
     */
    BigDecimal calculate(BigDecimal input);

    /**
     * reset the calculator
     */
    void reset();

    /**
     * is the calculator ready for calculations?
     */
    boolean isReady();
}