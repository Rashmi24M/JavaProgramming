public class Smallest {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c=30;
        if(a<b && a<c){
            System.out.println("A is smallest:"+a);
        }
        else if(b<a && b<c)
        {
            System.out.println("B is smallest:"+b);
        }
        else{
            System.out.println("C is smallest:"+c);
        }
    }

}
