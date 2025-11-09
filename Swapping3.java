public class Swapping3 {
    public static void main(String[] args) {
        
    
    //Swapping using  bitwise XOR
    int a=10; //01010
    int b=20; //10100
    System.out.println("Before Swapping");
    System.out.println("a:"+a);
    System.out.println("b:"+b);

    a=a^b; //11110-30
    b=a^b; //0101-10
    a=a^b;//1010-20

    System.out.println("After Swapping");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    }
}              
