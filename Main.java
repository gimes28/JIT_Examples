public class JIT {
    public static int num(int x, int y){
        return x + y;
    }  

    public static void Main (String[] args) {
        int ans = num(2, 3);
        System.out.println(num(2, 3));
        
        int sum = 0;
        for(int i = 0; i < 10000; i++){
            sum += num(2, 3);
        }
        System.out.println(sum);
    }
}
