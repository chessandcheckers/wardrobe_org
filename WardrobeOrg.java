import java.util.Scanner;

public class WardrobeOrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rec;
        String score = 0;

        System.out.println("Have you worn it in the last 1 year? (y/n): ");
        String worn = sc.nextLine();

        System.out.println("Does it fit well? (y/n): ") ;
        String fit = sc.nextLine();

        System.out.println("Is it damaged? (y/n): ");
        String damage = sc.nextLine();

        System.out.println("Do you like wearing it? (y/n): ");
        String like = sc.nextLine();

        if(damage.equalsIgnoreCase("y")){
            rec = "THROW AWAY";
        }

        else if(fit.equalsIgnoreCase("n")){
            rec = "DONATE";
        }

        else if(worn.equalsIgnoreCase("n") && like.equalsIgnoreCase("n")){
            rec = "DONATE";
        }

        else{
            rec = "KEEP";
        }

        System.out.println("Recommendation: " + rec);
        
        if(worn.equalsIgnoreCase("yes"))
            score += 3;

        if(fit.equalsIgnoreCase("yes"))
            score += 3;

        if(like.equalsIgnoreCase("yes"))
            score += 3;
        
        sc.close();

    }
}
