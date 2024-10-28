import boggle.BoggleGame;

/**
 * The Main class for the Boggle game.
 */
public class main {
    /**
    * Main method. 
    * @param args command line arguments.
    **/
    public static void main(String[] args) {
        BoggleGame b = new BoggleGame();
        b.giveInstructions();
        b.playGame();
    }

}
