package TRUMP_CARDS;
import java.util.*;

class Test{
public static void main(String[] args) {
    
    List<Category> sachin_category = new ArrayList<>();

    sachin_category.add(new Category("Matches", 463, true));
    sachin_category.add(new Category("Not_outs", 41, true));
    sachin_category.add(new Category("Runs", 18426, true));
    sachin_category.add(new Category("High_Score", 200, true));
    sachin_category.add(new Category("Average", 44, true));
    sachin_category.add(new Category("Hundreds", 49, true));
    sachin_category.add(new Category("Fifties", 96, true));
    sachin_category.add(new Category("ACC_Ranking", 4, false));

    Card Sachin = new Card(sachin_category);


    List<Category> Amelia_Kerr_categories = new ArrayList<>();

    Amelia_Kerr_categories.add(new Category("Matches", 62, true));
    Amelia_Kerr_categories.add(new Category("Not_outs", 13, true));
    Amelia_Kerr_categories.add(new Category("Runs", 1529, true));
    Amelia_Kerr_categories.add(new Category("High_Score", 232, true));
    Amelia_Kerr_categories.add(new Category("Average", 40, true));
    Amelia_Kerr_categories.add(new Category("Hundreds", 3, true));
    Amelia_Kerr_categories.add(new Category("Fifties", 6, true));
    Amelia_Kerr_categories.add(new Category("ACC_Ranking", 18, false));

    Card Amelia_Kerr = new Card(Amelia_Kerr_categories);

    Game g = new Game();
    
    int result = (g.play_Game(Sachin, "Runs", Amelia_Kerr)); //comparing sachin card with amelia card

    if (result == 1) {
        System.out.println("you wins  " + result);
    } else if (result == -1) {
        System.out.println("opponent wins  " + result);
    } else {
        System.out.println("Draw " + result);
    }
}


}