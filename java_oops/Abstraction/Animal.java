package java_oops.Abstraction;

public abstract class Animal {
    int num;

    abstract void sound();

    public Animal(int num) {
        this.num=num;
        System.out.println(num);
    }

    void body(){
    System.out.println("animal have 4 legs");
}

    public static void main(String[] args) {

    }
}
