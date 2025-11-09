public class Largest {
    public static void main(String[] args) {
    //largest of 2 number
    int a=10;
    int b=20;
    int c=30;
    int d=40;
    if(a>b){
        System.out.println("a is Largest:-"+a);
    }
    else{
        System.out.println("b is Largest:-"+b);

    }    

    //Using ternary operand
     int Result=(c>d)?c:d;
     System.out.println(Result);

    }
}
