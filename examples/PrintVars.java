package examples;

public class PrintVars {
    public static void main(String[] args) {
        int i_five, i_seventeen;
        char c_five, c_one, c_seven;
        float f_five, f_seventeen;
        double d_five, d_seventeen;

        i_five = 5;
        c_five = '5';
        f_five = 5.001F;
        d_five = 5.00001;

        System.out.println("An int: " + i_five);
        System.out.println("A char: " + c_five);
        System.out.println("A float: " + f_five);
        System.out.println("A double: " + d_five + "\n");

        i_seventeen = 17;
        c_one = '1';
        c_seven = '7';
        f_seventeen = 17.001F;
        d_seventeen = 17.00001;

        System.out.println("An int: " + i_seventeen);
        System.out.println("Two chars: " + c_one + " and " + 
            c_seven);
        System.out.println("A float: " + f_seventeen);
        System.out.println("A double: " + d_seventeen);
    }
}
