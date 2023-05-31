public class MonthlyCCBalance
{
    public static void main(String[] args)
    {
        double creditCardBalance = 5000;
        double TAX_RATE = .17;
        double oneMonth = creditCardBalance * TAX_RATE;
        double twoMonth = oneMonth * TAX_RATE;
        System.out.println("With a starting credit card balance of $5000, if no payments were made to this account after one month, the balance would be " +oneMonth + ".");
        System.out.println("The balance if no payment is made after two months would be " + twoMonth + ".");
    }
}