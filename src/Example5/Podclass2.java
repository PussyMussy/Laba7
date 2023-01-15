package Example5;

public class Podclass2 extends Superclass {
    protected char charField;

    public Podclass2(String stringField, char charField) {
        super(stringField);
        this.charField = charField;
    }

    @Override
    public void logSelf() {
        System.out.println(getClass().getName() + "{ stringField = " + this.stringField + ", charField = " + this.charField + " }");
    }
}