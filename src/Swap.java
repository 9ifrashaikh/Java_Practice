public class Swap{
    public static void main(String[] args) throws Exception{
        int x = 10;
        int y = 5;
        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //Swapping using third variable method
        int z = x;
        x = y;
        y = z;
        System.out.println("\nAfter swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
    }
}