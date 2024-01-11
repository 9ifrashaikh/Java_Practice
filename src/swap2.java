public class swap2{
    public static void main(String[] args)throws Exception{
        int a=5,b=10;
        System.out.println("Before swapping:");
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:");
        System.out.println("a="+a+" b="+b);

    }
}
//without using the third variable 