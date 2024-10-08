package day07_string_manipulations;

public class C04StringManipulations05 {

    public static void main(String[] args) {

        //Example 5:  String shirtPrice = "$12.99";
        //            String bookPrice = "$35.99";
        //            Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        String sum = shirtPrice + bookPrice;
        System.out.println("sum = " + sum); //sum = $12.99$35.99

        // The First step is to remove "$" in front.
        shirtPrice = shirtPrice.replace("$", "");
        System.out.println("shirtPrice = " + shirtPrice); //shirtPrice = 12.99
        bookPrice = bookPrice.replace("$","");
        System.out.println("bookPrice = " + bookPrice); //bookPrice = 35.99

        // The Second step is to convert String to double by Wrapper Class Methods
        double doubleShirtPrice = Double.valueOf(shirtPrice);
        double doubleBookPrice = Double.valueOf(bookPrice);

        double sumPrices = doubleBookPrice + doubleShirtPrice;
        System.out.println("sumPrices = " + sumPrices); //sumPrices = 48.980000000000004


    }
}
