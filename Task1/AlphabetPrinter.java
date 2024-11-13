package Task1;
public class AlphabetPrinter {

    public static void main(String[] args) {
        AlphabetThread alphabetThread = new AlphabetThread();
        Thread thread = new Thread(alphabetThread);
        thread.start();
    }
}
