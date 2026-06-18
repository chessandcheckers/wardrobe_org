import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WardrobeOrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemName;
        int score = 0;
        String rec;
        String reasons = "";

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
        

        if(worn.equalsIgnoreCase("y")){
            score += 3;
            reasons += "- Worn recently\n";
        }
        if(fit.equalsIgnoreCase("y")){
            score += 3;
            reasons += "- Fits well\n";
        }
        if(like.equalsIgnoreCase("y")){
            score += 3;
            reasons += "- Enjoys wearing it\n";
        }
        if(style.equalsIgnoreCase("y")){
            score += 4;
            reasons += "- Versatile styling options\n";
        }
        
        System.out.println("\n");
        System.out.println("Item: " + itemName);
        System.out.println("Final Score: " + score);
        System.out.println("Reasons: \n" + reasons);

        if(score >= 8)
            rec =  "KEEP";
        else if(score >= 5)
            rec = "MAYBE";
        else 
            rec = "DONATE";
        System.out.println("Recommendation: " + rec + "\n");


        try (FileWriter writer = new FileWriter("wardrobe_data.txt", true)) {
    
            writer.write(
                "Item: " + itemName + "\n" +
                "Score: " + score + "\n" +
                "Reasons:\n" + reasons + "\n" +
                "Recommendation: " + rec + "\n" + 
                "----------------------------------------\n"
            );

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
        finally{
            System.out.println("Data saved successfully!");
        }
        
        sc.close();
    }
}
