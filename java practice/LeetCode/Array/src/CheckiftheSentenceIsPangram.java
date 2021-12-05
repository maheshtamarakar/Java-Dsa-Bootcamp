public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        String sent = "mahesh";

        System.out.println(pangram(sent));

    }

    static boolean pangram(String sent) {
        for (char i = 'a'; i <= 'z'; i++) {
            if(!(sent.contains(String.valueOf(i)))){
                return false;

            }
        }
        return true;
    }
}
