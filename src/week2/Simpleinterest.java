package week2;

public class Simpleinterest {
    public static void main(String[] args){
        //simple interest calculation
        //principle amount in rupees
        int principalAmount = 100;

        //Rate of interest in %
        double rateofInterest = 2;

        //Time in years
        double time = 2;

        //calculation
        double simpleInterest = (principalAmount * rateofInterest * time) / 100;
        System.out.println("simple Interest is"+simpleInterest);


    }
}
