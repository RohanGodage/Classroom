package Random;

public class ProductSum {
    public static void main(String []args) {
        int num = 2783;
        int sum=0;
        int product = 1;

        while(num>0)

        {

            sum=sum+num%10;
            product=product*(num%10);
            num/=10;


        }
        System.out.println("sum : "+sum);
        System.out.println("product: "+product);
    }
}
