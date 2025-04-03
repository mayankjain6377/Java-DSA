package java_oops.Abstraction;

public class dog extends Animal {
    public dog(int num) {

        super(num);
    }

    public static void main(String[] args) {

dog obj=new dog(17);
obj.body();
obj.sound();
    }

    @Override
    void sound() {
        System.out.println("dog is barking...");
    }
}
