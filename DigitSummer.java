public class DigitSummer {

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Calculating the sum of digits for " + number + " with a Recursion...");

        System.out.println("The sum of the digits is: " +sumDigitsRecursive(number));
    }

    public static int sumDigitsRecursive(int number){
        if(number==0){
            return 0;
        }
        return (number%10)+sumDigitsRecursive(number/10);
    }
}