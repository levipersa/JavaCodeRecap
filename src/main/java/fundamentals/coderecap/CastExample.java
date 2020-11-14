package fundamentals.coderecap;

public class CastExample {
    public static void main(String[] args) {
        Parent parent=new Child();
        parent.name= "parent";
        parent.message();

        //cannot downcast by instantiating a supertype
        //Child child=new Parent();
        Child child= (Child) parent;
        child.age=2;
        child.message();
    }
}
