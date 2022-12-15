import java.util.*;

public class BitWiseOperation{

    static int getAnd(int x, int y){

        return (x & y);
    }

    static int getOr(int x, int y){
        return (x | y);
    }

    static int getXOR(int x, int y){
        return (x ^ y);
    }

    static int getCompliment(int x){
        return (~x);
    }

    static int leftShift(int x){
        return (x >> 2);
    }

    static int rightShift(int x){
        return (x << 2);
    }

    public static void main(String[] args) {

        System.out.println("BitWise Calculator !");

        Scanner sc = new Scanner(System.in);

        System.out.println("Gimme X:");
        int x = sc.nextInt();

        System.out.println("Gimme Y:");
        int y = sc.nextInt();


        System.out.println("AND :"+x+" & "+ y +" = "+ getAnd(x, y) );
        System.out.println("OR :"+x+" | "+ y +" = "+ getOr(x, y));
        System.out.println("XOR :"+x+" ^ "+ y +" = "+ getXOR(x, y));
        System.out.println("Compliment (x) "+ getCompliment(x));
        System.out.println("Compliment (y) "+ getCompliment(y));
        System.out.println("Left Shift (x) "+ leftShift(x));
        System.out.println("Left Shift (y) "+ leftShift(y));
        System.out.println("Right Shift (x) " + rightShift(x));
        System.out.println("Right Shift (y) " + rightShift(y));

        sc.close();
    }
}