public class PowerCalculator {

    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        System.out.println("Calculating " + base + "^" + exponent + " using a Recursion...");

        System.out.println("Result: " +  powerRecursive( base,  exponent));

    }
    public static long powerRecursive(int base, int exp){
        if (exp==0){
            return 1;
        }
        return base* powerRecursive( base, exp-1);
      }

}
