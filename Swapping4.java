public class Swapping4 {
    public static void main(String[] args) {
        //Swapping  in singlestatement
        int a=10;
        int b=20;
        System.out.println("Before Swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        b=(a+b)-(a=b);//30-20=10-b a=20
        System.out.println("After Swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }

    
}
