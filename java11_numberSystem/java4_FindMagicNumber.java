package java11_numberSystem;

public class java4_FindMagicNumber {
    public static void main(String[] args) {
int ans=0;
int num=6;int base=5;


     while (num>0){
         int last=num&1;
         num=num>>1;
         ans+=last*base;
         base*=5;


        }
        System.out.println(ans);

    }
}
