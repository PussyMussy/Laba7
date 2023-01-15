package Example3;

public class Podclass extends Superclass {
    public char charField;

    public Podclass(int intField, char charField) {
        super(intField);
        this.charField = charField;
    }

    public void setField(int intField, char charField) {
        super.setField(intField);
        this.charField = charField;
    }

    public String toString() {
        return getClass().getName() + "{ intField = " + this.intField + ", charField = " + this.charField + " }";
    }
}