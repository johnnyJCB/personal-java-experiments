public class challenge {
    public static void main(String[] args) {
        double myDV = 20.00;
        double mySDV = 80.00;
        double total = (myDV + mySDV) * 100.00;
        System.out.println(total);
        double newV = total % 40.00;
        System.out.println(newV);
        //boolean isZero = true;
        boolean boolV = (newV == 0) ? true : false;
        System.out.println(boolV);
        if (!boolV)
            System.out.println("got some remainder");
    }
}
