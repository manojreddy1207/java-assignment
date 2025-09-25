package week2;

public class TypeCasting {
    public static void main(String[] args){
        //Implicit Type Convertion
        System.out.println("Implicit Type Casting");
        //creating int type variable
        int num = 10;
        System.out.println("The integer value is "+ num);

        //convert into type
        double newNumber = num;

        System.out.println("The double value is "+newNumber);

        //Explicit Type Casting
        System.out.println("Explicit Type Casting");
        //creating double variable
        double newDoubleNumber = 10.99;
        System.out.println("The Double value is " +newDoubleNumber);

        //creating integer variable
        int newIntegerNumber = (int)newDoubleNumber;
        System.out.println("The Integer value is " +newIntegerNumber);
    }
}
