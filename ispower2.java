public class ispower2 {
    public static boolean find(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args []){
        System.out.println(find(4));
    }
}