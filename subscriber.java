public class subscriber {
    String subscriber_name;
    String sub_email;
    String sub_credit_card_no;
    String sub_credit_exp_dte;
    String plan_type = "Free";
    String frequency = "Monthly";
    //create static variables
    static double on_theatre_movie = 1.99;
    //static = fixed number for everyone
    static double optimized_plan_fee = 4.99;
    static double platinum_plan_fee = 9.99;

    public void on_theatre_movie(int i) {

    }

    //create static function/methods
    static void display_Plans()
    {
        System.out.println(" the free plan is $0.00");
        //optimized plan
        System.out.println(" the optimized plan is $" + optimized_plan_fee + " if paid monthly");
        System.out.println(" the optimized plan is $" + (6 * optimized_plan_fee * 0.80) + "if paid semi-annually");
        System.out.println(" the optimized plan is $" + (12 * optimized_plan_fee * 0.75) + "if paid annually");
        //platinum plan
        System.out.println(" The platinum plan is $" + platinum_plan_fee + " if paid monthly");
        System.out.println(" The platinum plan is $" + (6 * platinum_plan_fee * .85) + "if paid semi-annually");
        System.out.println(" The platinum plan is $" + (12 * platinum_plan_fee * .8) + " if paid annually");
    }

    double change_plan(String user_plan, String payment_frequency) {
        frequency = payment_frequency;
        plan_type = user_plan;
        double charges = 0;
        if (plan_type.equals("free")) charges = 0;
        else if (plan_type.equals("platinum")) {
            if (payment_frequency.equals("monthly")) charges = platinum_plan_fee;
            else if (payment_frequency.equals("semi-annually")) charges = (platinum_plan_fee * 6 * 0.85);
            else if (payment_frequency.equals("annually")) charges = (platinum_plan_fee * 12 * 0.8);
                //optimized plan
            else if (plan_type.equals("optimized")) {
                if (payment_frequency.equals("monthly")) charges = optimized_plan_fee;
                else if (payment_frequency.equals("semi-annually")) charges = (optimized_plan_fee * 6 * 0.8);
                else if (payment_frequency.equals("annually")) charges = (platinum_plan_fee * 12 * 0.75);
            }
            return charges;
        }
        double monthly_billing(int no_movies)
        {
            double monthly_charge = 0;
            monthly_charge += no_movies * on_theatre_movie;
            if (frequency.equals("monthly")) {
                if (plan_type.equals("optimized")) monthly_charge += optimized_plan_fee;
                if (plan_type.equals("platinum")) monthly_charge += platinum_plan_fee;
            }
            return monthly_charge * 1.06;

        }

    }

}
