public class CharacterCounter {

    public static void main(String[] args) {
        String sentence = "recursion is replacing the repetition of loops";
        char target = 'r';
        System.out.println("Counting occurrences of '" + target + "' with a Recursion...");

        System.out.println("The character '" + target + "' appears " +countCharRecursive(sentence, target,  0)+ " times.");
    }

    public static int countCharRecursive(String text, char target, int index) {
        if(index==text.length()){
            return 0;
        }
        if(text.charAt(index)==target){
            return 1+countCharRecursive( text,  target,  index+1);

        }
        return countCharRecursive( text,  target,  index+1);
    }

}