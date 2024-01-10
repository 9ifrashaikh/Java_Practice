public class Even{
    public static void main(String[] args) throws Exception{
        int n = 10; 
        if(n%2==0){
            System.out.println("The number "+n+" is even");
        }
        else{
            throw new Exception("The number "+n+" is not even");
        }
    }
}