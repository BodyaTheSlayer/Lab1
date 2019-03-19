package calc;

/**
 * Created by asus on 04.03.2019.
 */
public class Main {
    public static void main(String []args){
        double[] array = new double[args.length];
        for (int i = 0; i < array.length; i++) {
            System.out.println(args[i]);
            array[i] = Double.parseDouble(args[i]);
            System.out.println(array[i]);
        }
        System.out.println(Calculator.plus(array[0],array[1]));
        System.out.println(Calculator.minus(array[2],array[3]));
        System.out.println(Calculator.mult(array[4],array[5]));
        System.out.println(Calculator.div(array[6],array[7]));
        System.out.println(Calculator.div(array[8],array[9]));
    }
}
