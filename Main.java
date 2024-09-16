import java.util.Scanner;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        subscriber s1= new subscriber();
        Scanner scanner=new Scanner(System.in);
        s1.subscriber_name="Ken";
        s1.sub_email="ken1@howard.edu";
        s1.sub_credit_card_no="12345678910";
        s1.sub_credit_exp_dte="05/27";
        s1.on_theatre_movie(2);
        System.out.println(" What plan would you like?");
        String user_plan= scanner.nextLine();
        System.out.println(" How would you like to pay?");
        String payment_frequency = scanner.nextLine();
        double plan_cost=s1.change_plan("optimized", "monthly");
        System.out.println("this plan will cost you"+plan_cost);

        subscriber s2= new subscriber();
        s2.subscriber_name="Anayah";
        s2.sub_email="Anayah@howard.edu";
        s2.sub_credit_card_no="card no:38945634870";
        s2.sub_credit_exp_dte="09/29";
        s2.on_theatre_movie(4);
        System.out.println("What plan would you like?" );
        String user_plans2 = scanner.nextLine();
        System.out.println("How would you like to pay?" );
        String payment_frequency2 = scanner.nextLine();
        double plan_cost2=s2.change_plan("platinum","semi-annually");
        System.out.println("this plan will cost you"+plan_cost2);}}


