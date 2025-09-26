package week2;

public class swapping {
    public static void main(String[] args){
        //values before swapping

        int a = 20;
        int b = 30;

        System.out.println("Before swapping");
        System.out.println("a value is"+ a);
        System.out.println("b value is"+ b);

        //swapping logic
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping");
        System.out.println("a value is"+ a);
        System.out.println("b value is"+ b);

    }
}
