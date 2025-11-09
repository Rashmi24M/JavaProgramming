public class Swapping2 {
    public static void main(String[] args) {
        //Without temporary variable swapping
        int a=10;
        int b=20;
        System.out.println("Before Swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        
        //using multiplication 
        int r=10;
        int s=20;

        System.out.println("Before Swapping");
        System.out.println("r:"+r);
        System.out.println("s:"+s);
    
        r=r*s;//200
        s=r/s; //200/20
        r=r/s; //200/10
        System.out.println("After Swapping");
        System.out.println("r:"+r);
        System.out.println("s:"+s);
        

    }
    
}
