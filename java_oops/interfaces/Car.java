package java_oops.interfaces;

public class Car implements Engine,Brakes{


    public static void main(String[] args) {
Car obj=new Car();
obj.acc();
obj.breaks();
obj.start();
obj.stop();
obj.fail();

    }

    @Override
    public void breaks() {
        System.out.println("it has dissbrakes");
    }

    @Override
    public void stop() {
        System.out.println("stop in 2 second");

    }

    @Override
    public void start() {
        System.out.println("start voice is amazing");

    }

    @Override
    public void acc() {
        System.out.println("acc time is 9 second and 100km/hr");

    }

}
