import java.util.Scanner;

public class MadLibs {

    // function that asks for user input 
    public static String getWord(Scanner sc, String wordType) {
        System.out.print("Enter " + wordType + ": ");
        return sc.nextLine();
    }

    // function that generates the Mad Libs story
    public static String generateStory(String name, String adj1, String color, String animal, String place,
                                       String adj2, String creature1, String adj3, String creature2,
                                       String room, String noun1, String noun2, String noun3,
                                       String adj4, String pluralNoun, String number, String time,
                                       String verbIng, String adj5, String noun4) {

        //makes madlib based on arguements
        String story = "\nDear " + name + ",\n"
            + "I am writing to you from a " + adj1 + " castle in an enchanted forest. "
            + "I found myself here one day after going for a ride on a " + color + " " + animal 
            + " in " + place + ". There are " + adj2 + " " + creature1 + " and " + adj3 + " " + creature2 
            + " here! In the " + room + " there is a pool full of " + noun1 + ". "
            + "I fall asleep each night on a " + noun2 + " of " + pluralNoun 
            + " and dream of " + adj4 + " " + noun3 + ". "
            + "It feels as though I have lived here for " + number + " " + time + ". "
            + "I hope one day you can visit, although the only way to get here now is " + verbIng 
            + " on a " + adj5 + " " + noun4 + "!!";

        //returns the final madlib
        return story;
    }

    //function that stores user input into variables and uses it to generate the story
    public static void main(String[] args) {

        //intializes scanner
        Scanner sc = new Scanner(System.in);

        //collect inputs
        String name = getWord(sc, "a Proper Noun (Person's Name)");
        String adj1 = getWord(sc, "an Adjective");
        String color = getWord(sc, "a Color");
        String animal = getWord(sc, "an Animal");
        String place = getWord(sc, "a Place");
        String adj2 = getWord(sc, "another Adjective");
        String creature1 = getWord(sc, "a Magical Creature (Plural)");
        String adj3 = getWord(sc, "another Adjective");
        String creature2 = getWord(sc, "another Magical Creature (Plural)");
        String room = getWord(sc, "a Room in a House");
        String noun1 = getWord(sc, "a Noun");
        String noun2 = getWord(sc, "another Noun");
        String noun3 = getWord(sc, "another Noun");
        String adj4 = getWord(sc, "another Adjective");
        String pluralNoun = getWord(sc, "a Noun (Plural)");
        String number = getWord(sc, "a Number");
        String time = getWord(sc, "a Measure of Time");
        String verbIng = getWord(sc, "a Verb ending in -ing");
        String adj5 = getWord(sc, "another Adjective");
        String noun4 = getWord(sc, "another Noun");

        //generates and displays story
        String story = generateStory(name, adj1, color, animal, place, adj2, creature1, adj3, creature2,
                                     room, noun1, noun2, noun3, adj4, pluralNoun, number, time,
                                     verbIng, adj5, noun4);

        //prints the story
        System.out.println(story);

        //closes the scanner
        sc.close();
    }
}
