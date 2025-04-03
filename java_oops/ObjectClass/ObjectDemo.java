package java_oops.ObjectClass;

public class ObjectDemo {
    int num;
    //we will deepdive into hashcode during lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo(int num) {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(34);
        System.out.println(obj.hashCode());
    }
}
