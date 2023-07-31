package TRUMP_CARDS;

import java.util.*;
class Game 
{
     private Category[] categories;

    public int play_Game(Card current, String categoryName, Card other ) {
        Category yourCard = null;
        Category oppCard = null;

        for (Category category : current.categories) {
            if (category.name.equals(categoryName)) {
                yourCard = category;
                break;
            }
        }

        for (Category category : other.categories) {
            if (category.name.equals(categoryName)) {
                oppCard = category;
                break;
            }
        }

        if (yourCard == null || oppCard == null) {
            throw new IllegalArgumentException("Invalid category name");
        }

        if (yourCard.higher_value) {
            if (yourCard.value > oppCard.value) {
                return +1;
            } else if (yourCard.value < oppCard.value) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (yourCard.value < oppCard.value) {
                return 1;
        }   else if (yourCard.value > oppCard.value) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
 
  


