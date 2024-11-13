package Task1;
import java.util.Random;
class AlphabetThread implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        
        for (int i = 0; i < 26; i++) {
            char randomChar = (char) ('A' + random.nextInt(26));  
            System.out.print(randomChar + " ");            
            try {
                int randomDelay = 100 + random.nextInt(400);
                Thread.sleep(randomDelay); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }           
            if (i == 20) { 
                System.out.println("\nStopping the thread now...");
                Thread.currentThread().stop();  
                break;
            }
        }
        System.out.println();
    }
}
