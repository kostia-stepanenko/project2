package lab11;

public class Monitor {
    public long currency;
    public int obtainedScore;
   private  static int maxScore=150;


    public Monitor(long currency,int obtainedScore){
        this.currency=currency;
        this.obtainedScore=obtainedScore;
    }

    public double calculatePerformance(){

        return Double.valueOf(obtainedScore)/maxScore*100;
    }
    @Override
    public String toString() {
        return "Monitor{" +
                "currency=" + currency +
                ", obtained score=" + calculatePerformance() +
                "%}";
    }
}
