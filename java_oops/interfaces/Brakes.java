package java_oops.interfaces;

public interface Brakes {
    void breaks();
    default void fail(){
        System.out.println("it doesn't implements the function in interface......");
    }
    static void company(){
        System.out.println("this brakes belongs to TATA /.....");
    }
}
