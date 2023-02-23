package Task1;

public class Task2Class {
    public static void main(String[] args) {
        int firstprice = 500;
        int dicountpercentage = 25;
        int discount = firstprice * dicountpercentage / 100;
        int finishprice = firstprice - discount;
        System.out.println("Price after discount = " + finishprice);
    }
}
