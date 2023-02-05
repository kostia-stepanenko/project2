package lab11;

public class VideoCard {
    public long currency;
    public int obtainedScore;

    private static int maxScore =100;

    public VideoCard(long currency,int obtainedScore){
        this.currency=currency;
        this.obtainedScore=obtainedScore;
    }

    public double calculatePerformance(){

       return Double.valueOf(obtainedScore)/maxScore*100;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "currency=" + currency +
                ", obtained score=" + calculatePerformance() +
                "%}";
    }
}
