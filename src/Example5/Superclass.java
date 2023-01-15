package Example5;

public class Superclass {
    protected String stringField;

    public Superclass(String stringField) {
        this.stringField = stringField;
    }

    public void logSelf() {
        System.out.println(getClass().getName() + "{ stringField = " + this.stringField + " }");
    }
}