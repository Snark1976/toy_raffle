import services.ToyRaffle;
import services.ToyWriter;

public class App {

    public static void main(String[] args) {
        String[] toyStrings = {
            "1 2 lego",
            "2 2 robot",
            "3 6 doll"
        };

        ToyRaffle toyRaffle = new ToyRaffle(toyStrings);
        ToyWriter writer = new ToyWriter("result.txt");
        for (int i = 0; i < 10; i++)
        {
            writer.writeToFile(toyRaffle.getToy());
        }
    }
}
