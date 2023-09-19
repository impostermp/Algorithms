import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("FOR 10007 BALLS:");
        System.out.println("Balls bin: "+ballsBin(10007, 10007)[0]);
        System.out.println("balls bin powered: "+ballsBinPower(10007,10007)[0]);
        System.out.println("-------------------------");
        System.out.println("first algo no parenthesis: "+powerOfTwoChoicesAlgo(10007));
        System.out.println("second algo with division: "+powerOfTwoChoicesAlgo2(10007));
        System.out.println("*********************************************************");
        System.out.println("FOR 32 749 BALLS:");
        System.out.println("Balls bin: "+ballsBin(32749, 32749)[0]);
        System.out.println("balls bin powered: "+ballsBinPower(32749,32749)[0]);
        System.out.println("-------------------------");
        System.out.println("first algo no parenthesis: "+powerOfTwoChoicesAlgo(32749));
        System.out.println("second algo with division: "+powerOfTwoChoicesAlgo2(32749));

        System.out.println("*********************************");
        System.out.println("CHECKING IF PROBABILITY OF EACH BIN CONTAINING LESS THAN 1 BALL IS LESS THAN 0,5");
        System.out.println("running 1000 attempts:");
        int succesfullAttempts =0;
        int totalAttempts =500;
        for(int i=0;i<totalAttempts;i++){
            if(simulationTest(10007)){
                succesfullAttempts++;
            }
        }
        System.out.println("successfull attempts: "+succesfullAttempts+ " and probability: "+ ((double) succesfullAttempts / totalAttempts));
    }
    // find bin with most balls, and the average
    public static int[] ballsBin(int numOfBalls, int numOfBins){
        int totalBalls = 0;
        int avgBalls = 0;
        int maxBallCount = 0;
        int[] bins = new int[numOfBins];

        for(int i=0;i<numOfBalls;i++){
            int randomBin = new Random().nextInt(numOfBins);
            int currentBin = bins[randomBin]++;
            if(currentBin>maxBallCount){
                maxBallCount = currentBin;
            }
            totalBalls++;
        }
        avgBalls = totalBalls/numOfBins;
        return new int[]{maxBallCount,avgBalls};
    }
    // find bin with most balls and the average using power of choice
    public static int[] ballsBinPower(int numOfBalls, int numOfBins){
        int totalBalls = 0;
        int avgBalls = 0;
        int maxBallCount = 0;
        int[] bins = new int[numOfBins];

        for(int i=0;i<numOfBalls;i++){
            int randomBin1 = new Random().nextInt(numOfBins);
            int randomBin2 = new Random().nextInt(numOfBins);
            int chosenBin = randomBin1<randomBin2? randomBin1:randomBin2;
            bins[chosenBin]++;
            //check if maxcount exceeded
            if (bins[chosenBin]>maxBallCount){
                maxBallCount = bins[chosenBin];
            }
            totalBalls++;
        }
        avgBalls = totalBalls/numOfBins;
        return new int[]{maxBallCount,avgBalls};
    }
    public static double powerOfTwoChoicesAlgo(int numOfBalls){
        return Math.log(Math.log(numOfBalls));
    }
    public static double powerOfTwoChoicesAlgo2(int numOfBalls){
        return Math.log(numOfBalls) / Math.log(Math.log(numOfBalls));

    }
    // check if bin has more than 1 ball in it
    public static boolean simulationTest(int numBalls){
        int[] numBins = new int[numBalls*numBalls];

        for(int i=0;i<numBalls;i++){
            int selectedBin = new Random().nextInt(numBins.length);
            numBins[selectedBin]++;
            if (numBins[selectedBin]>1){
                return false;
            }
        }
        return true;
    }
}
