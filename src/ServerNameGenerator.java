import java.util.Random;
public class ServerNameGenerator {

    public static String Random(String[] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length) + 1;
        return array[index];
    }

    public static void main(String[] args) {
        String[] adjectives = {"lovely", "brave", "short", "cool", "lucky", "perfect", "beautiful", "proud", "happy", "bored"};
        String[] nouns = {"book", "dog", "heart", "phone", "truck", "car", "shoes", "cat", "laptop", "banana"};

        System.out.printf("Here is your server name:%s-%s", Random(adjectives), Random(nouns));
    }
}
