package Example5;

public class Podclass extends Superclass {
    protected int intField;

    public Podclass(String stringField, int intField) {
        super(stringField);
        this.intField = intField;
    }
    @Override
    public void logSelf() {
        System.out.println(getClass().getName() + "{ stringField = " + this.stringField + ", intField = " + this.intField + " }");
    }
}
