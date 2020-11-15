package fundamentals.coderecap.clonable;

public class SimpleObject implements Cloneable{

    private int firstField;
    private int secondField;

    public SimpleObject() {
        this.firstField = 10;
        this.secondField = 20;
    }

    public SimpleObject(int firstField, int secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    @Override
    protected SimpleObject clone() throws CloneNotSupportedException {
        return (SimpleObject)super.clone();
    }

    public int getFirstField() {
        return firstField;
    }

    public void setFirstField(int firstField) {
        this.firstField = firstField;
    }

    public int getSecondField() {
        return secondField;
    }

    public void setSecondField(int secondField) {
        this.secondField = secondField;
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "firstField=" + firstField +
                ", secondField=" + secondField +
                '}';
    }
}
