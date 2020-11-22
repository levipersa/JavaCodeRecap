package fundamentals.coderecap.clonable;

public class DependenciesObject implements Cloneable{

    private int firstField;
    private int secondField;
    private SimpleObject simpleObject = new SimpleObject(30, 40);

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

    public SimpleObject getSimpleObject() {
        return simpleObject;
    }

    public void setSimpleObject(SimpleObject simpleObject) {
        this.simpleObject = simpleObject;
    }

    @Override
    protected DependenciesObject clone() throws CloneNotSupportedException {
        DependenciesObject dependenciesObject = (DependenciesObject)super.clone();
        SimpleObject anotherObject = simpleObject.clone();

        dependenciesObject.setSimpleObject(anotherObject);

        return dependenciesObject;
    }

    @Override
    public String toString() {
        return "DependenciesObject{" +
                "firstField=" + firstField +
                ", secondField=" + secondField +
                ", simpleObject=" + simpleObject +
                '}';
    }


}
