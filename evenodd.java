public class evenodd {
    public static void find(int n){
        int bitmask =  1;
        if((n & bitmask) == 0){
            System.out.println("even");

        } else{
            System.out.println("odd");

        }
    }
    public static void main(String args []){
        find(10);
        find(13);
       

    }
}