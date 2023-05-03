public class demo { //inheritence advcalu and calu
    public static void main(String[] args) {
        Advcalu obj = new Advcalu();

        int r1 = obj.add(3, 4);
        int r2 = obj.sub(10,5);
        int r3 = obj.mul(5,5 );
        int r4 = obj.div(16,4);

        System.out.println(r1 + " " + r2 + " " + r3+ " "+ r4 );

    }
}
