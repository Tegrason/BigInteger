import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply(new BigInteger("35")));
    }
    public static BigInteger multiply(BigInteger i){
        if(i.compareTo(new BigInteger("1"))!=1){
            return new BigInteger("1");
        }else{
            return multiply(i.subtract(new BigInteger("1"))).multiply(i);
        }
    }
    public static int multiply(int i){
        if(i==1){
            return 1;
        }else{
            return multiply(--i)*i;
        }
    }
}
