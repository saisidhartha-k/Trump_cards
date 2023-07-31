import java.util.*;

class Category {
    String name;
    double value;
    boolean higherWins;

    public Category(String name, double value, boolean higherWins) {
        this.name = name;
        this.value = value;
        this.higherWins = higherWins;
    }
}

class Card {
    List<Category> categories;

    public Card(List<Category> categories) {
        this.categories = categories;
    }

    public int trumps(Card other, String categoryName) {
        Category thisCategory = null;
        Category otherCategory = null;

        for (Category category : categories) {
            if (category.name.equals(categoryName)) {
                thisCategory = category;
                break;
            }
        }

        for (Category category : other.categories) {
            if (category.name.equals(categoryName)) {
                otherCategory = category;
                break;
            }
        }

        if (thisCategory == null || otherCategory == null) {
            throw new IllegalArgumentException("Invalid category name");
        }

        if (thisCategory.higherWins) {
            if (thisCategory.value > otherCategory.value) {
                return 1;
            } else if (thisCategory.value < otherCategory.value) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (thisCategory.value < otherCategory.value) {
                return 1;
            } else if (thisCategory.value > otherCategory.value) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

public class tamp {

    public static void main(String[] args) {

        List<Category> sachinCategories = new ArrayList<>();
        sachinCategories.add(new Category("Matches", 463, true));
        sachinCategories.add(new Category("Not Outs", 41, true));
        sachinCategories.add(new Category("Runs", 18426, true));
        sachinCategories.add(new Category("High Score", 200, true));
        sachinCategories.add(new Category("Average", 44, true));
        sachinCategories.add(new Category("Hundreds", 49, true));
        sachinCategories.add(new Category("Fifties", 96, true));
        sachinCategories.add(new Category("ACC Ranking", 4, false));

        Card sachin = new Card(sachinCategories);
        List<Category> ameliaCategories = new ArrayList<>();
        ameliaCategories.add(new Category("Matches", 62, true));
        ameliaCategories.add(new Category("Not Outs", 13, true));
        ameliaCategories.add(new Category("Runs", 1529, true));
        ameliaCategories.add(new Category("High Score", 232, true));
        ameliaCategories.add(new Category("Average", 40, true));
        ameliaCategories.add(new Category("Hundreds", 3, true));
        ameliaCategories.add(new Category("Fifties", 6, true));
        ameliaCategories.add(new Category("ACC Ranking", 18, false));

        Card amelia = new Card(ameliaCategories);
        System.out.println(amelia.trumps(sachin, "Average"));

    }}

