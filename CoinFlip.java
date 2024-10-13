public class CoinFlip {
    public CoinFlip() {}

    public String flip() { 
        int num = (int) (Math.random() * 2); 
        if (num == 0) {
            return "tails"; 
        } else {
            return "heads"; 
        }
    }
    
    public String simulate(int numFlips) {
        int numOfHeads = 0; 
        int numOfTails = 0; 
        for (int i = 0; i < numFlips; i++) {
            String flip = flip(); 
            if (flip.equals("tails")) {
                numOfTails++; 
            } else {
                numOfHeads++;
            }
        }

        double percentHeads = ((double) numOfHeads/numFlips) * 100; 
        double percentTails = ((double) numOfTails/numFlips) * 100; 
        return "Percent Heads: " + percentHeads + "%\n" + "Percent Tails: " + percentTails + "%"; 
    }
}