import java.util.Scanner;

public class MadLibs {

    // method to prompt for a word
    // fits "implements algorithm(s) that process user input" requirement
    public static String getWord(Scanner sc, String wordType) {
        System.out.print("Enter " + wordType + ": ");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompts the user for all 20 words manually
        // fits "prompts to keep the user on track" requirement
        String name = getWord(sc, "a name");
        String adj1 = getWord(sc, "an adjective");
        String color = getWord(sc, "a color");
        String animal = getWord(sc, "an animal");
        String place = getWord(sc, "a place");
        String adj2 = getWord(sc, "another adjective");
        String creature1 = getWord(sc, "a magical creature (plural)");
        String adj3 = getWord(sc, "another adjective");
        String creature2 = getWord(sc, "another magical creature (plural)");
        String room = getWord(sc, "a room in a house");
        String noun1 = getWord(sc, "a noun");
        String noun2 = getWord(sc, "another noun");
        String pluralNoun = getWord(sc, "a plural noun");
        String adj4 = getWord(sc, "another adjective");
        String noun3 = getWord(sc, "another noun");
        String number = getWord(sc, "a number");
        String time = getWord(sc, "a measure of time (e.g., days, years)");
        String verbIng = getWord(sc, "a verb ending in -ing");
        String adj5 = getWord(sc, "another adjective");
        String noun4 = getWord(sc, "another noun");

        // story template with placeholders
        // fits "implements algorithm(s) with String methods to parse for sections to include" requirement
        String story = """
            Dear {name},
            I am writing to you from a {adj1} castle in an enchanted forest.
            I found myself here one day after riding a {color} {animal} in {place}.
            There are {adj2} {creature1} and {adj3} {creature2} here!
            In the {room}, there's a pool full of {noun1}.
            I fall asleep each night on a {noun2} of {pluralNoun} and dream of {adj4} {noun3}.
            I’ve lived here for {number} {time}.
            You can only get here by {verbIng} on a {adj5} {noun4}!!
        """;

        // this part parses for the parts of speech to replace, and repleaces it with the input 
        // fits "implements algorithm(s) with String methods to parse for the parts of speech to replace" requirement
        story = story.replace("{name}", name);
        story = story.replace("{adj1}", adj1);
        story = story.replace("{color}", color);
        story = story.replace("{animal}", animal);
        story = story.replace("{place}", place);
        story = story.replace("{adj2}", adj2);
        story = story.replace("{creature1}", creature1);
        story = story.replace("{adj3}", adj3);
        story = story.replace("{creature2}", creature2);
        story = story.replace("{room}", room);
        story = story.replace("{noun1}", noun1);
        story = story.replace("{noun2}", noun2);
        story = story.replace("{pluralNoun}", pluralNoun);
        story = story.replace("{adj4}", adj4);
        story = story.replace("{noun3}", noun3);
        story = story.replace("{number}", number);
        story = story.replace("{time}", time);
        story = story.replace("{verbIng}", verbIng);
        story = story.replace("{adj5}", adj5);
        story = story.replace("{noun4}", noun4);

        // displays the final story
        // fits "Displays the final modified Mad Lib" requirement
        System.out.println("\n--- Your Mad Lib Story ---\n");
        System.out.println(story);

        sc.close();
    }
}
