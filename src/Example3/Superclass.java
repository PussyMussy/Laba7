package Example3;

public class Superclass {
    public int intField;

    public Superclass(int intField) {
        this.intField = intField;
    }

    public void setField(int intField) {
        this.intField = intField;
    }

    public String toString() {
        return getClass().getName() + "{ intField = " + this.intField + " }";
    }
}