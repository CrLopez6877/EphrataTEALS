package studentWork.FinalProject;

public class Stats {
    private int wins;
    private int losses;

    public Stats(){
        wins = 0;
        losses = 0;
    }

    public void incrementWin(){
        wins = wins + 1;
    }

    public void incrementLoss(){
        losses = losses + 1;
    }

    public void printResults(){
        System.out.println("You have won " + wins + " ands and lost " + losses + ".");
        System.out.println();
    }
}
