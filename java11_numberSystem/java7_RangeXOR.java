package java11_numberSystem;

public class java7_RangeXOR {
    public static void main(String[] args) {
int a=0;
int b=0;

int ans=XOR(b)^XOR(a-1);
        System.out.println(ans);

    }
    private static int XOR(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }

        return  0;
    }
}
