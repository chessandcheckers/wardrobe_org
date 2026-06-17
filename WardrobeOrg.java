import java.util.Scanner;

public class WardrobeOrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemName;
        int score = 0;

        System.out.println("Enter item: ");
        itemName = sc.nextLine();

        System.out.println("Have you worn it in the last 1 year? (y/n): ");
        String worn = sc.nextLine();

        System.out.println("Does it fit well? (y/n): ") ;
        String fit = sc.nextLine();

        System.out.println("Do you like wearing it? (y/n): ");
        String like = sc.nextLine();

        System.out.println("Can this piece be styled with multiple outfits? (y/n): ");
        String style = sc.nextLine();
        

        if(worn.equalsIgnoreCase("y"))
            score += 3;
        if(fit.equalsIgnoreCase("y"))
            score += 3;
        if(like.equalsIgnoreCase("y"))
            score += 3;
        if(style.equalsIgnoreCase("y"))
            score += 4;
        
        System.out.println("Item: " + itemName);
        System.out.println("Final Score: " + score);

        if(score >= 8)
            System.out.println("Recommendation: KEEP");
        else if(score >= 5)
            System.out.println("Recommendation: MAYBE");
        else 
            System.out.println("Recommendation: DONATE");
        
        sc.close();
    }
}
