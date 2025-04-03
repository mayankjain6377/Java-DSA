package java11_numberSystem;

public class java8_AddBinary {
    public static void main(String[] args) {
String a="1011";
String b="1001";
int power=0;
int ans=0;
int ad=Integer.parseInt(a,2);
int bd=Integer.parseInt(b,2);
        int sum=ad+bd;
        System.out.println("binary sum is :"+Integer.toBinaryString(sum));

while(ad>0){
    ad=ad&1;
    ans=ans+ad*2^(power++);
   ad=ad>>1;
    System.out.println("answer is :"+ans);


}

        System.out.println(ans);

    }
}
