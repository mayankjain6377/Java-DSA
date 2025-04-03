package java_oops.Exception;
public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
    public void message(){
        System.out.println("there is no message....");
    }
    public static void main(String[] args) {
        int a=9;
        int b=9;
MyException obj=new MyException("no message");
MyException obj2=new MyException(obj.getMessage());
    }
}
