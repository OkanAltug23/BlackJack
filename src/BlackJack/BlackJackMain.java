package BlackJack;

// using java.util.Random;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackJackMain {
    public static void main(String[] args)
    {
        // create instance of Random class
        Random rand = new Random();
        // create scanner for user input
        Scanner input = new Scanner(System.in);
        String DeckCards[];    //declaring array
        DeckCards = new String[53]; //allowing memory to array
        int Suite[];
        //Suite = new ["H - ","C - ","S - ","D - "];
        //String Cards["A","2","3","4","5","6","7","8","9","10","J","Q","K"];
        String suits[] = {"H - ","C - ","S - ","D - "};
        String cards[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //for(int i=1; i <= 52;i++)
        //{
        //    int rand_int1 = rand.nextInt(52);
        //    DeckCards[i] = rand_int1; // Fill each array element
        //   // DeckCards[i] = i; // Fill each array element
        //    System.out.println("i is : "  + i + " Array element is "  + DeckCards[i]);
        //}

        ArrayList<String> playingCards = new ArrayList<>();
        int j = 0;
        for(int x = 0;x < 4;x++) {
            for(int i = 0;i <13;i++) {
                playingCards.add(cards[i]+suits[x]);
                //System.out.println(DeckCards[j]);
                //DeckCards[j] = playingCards.add(cards[i]+suits[x]);
                //j++;
                System.out.println(suits[x] + cards[i]);
            }
            //System.out.println(" \\u2665 \u0003 \u0004 \u0005");
        }
    }
}