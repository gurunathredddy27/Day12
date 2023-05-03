public class Test3 {
    public static void main(String[] args) {

        String a = "welcome to BridgeLab";
        System.out.println(a);


        int b = 0;
        for(int i = 0; i < a.length(); i ++){
            if (Character.isLetter(a.charAt(i))) {
                b++;

            }
            System.out.println(b);

        }
        char ch = ' ';
        System.out.println(ch);
    }
}
