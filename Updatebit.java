public class Updatebit {
    public static int clear(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update(int n, int i, int newbit){
        n = clear(n,i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(update(13,2,1));
        System.out.println(update(15,2,1));
        System.out.println(update(10,2,1));

    }
}