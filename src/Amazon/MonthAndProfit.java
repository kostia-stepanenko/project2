package Amazon;

import java.util.Comparator;

public class MonthAndProfit {

    static final Comparator<MonthAndProfit> PROFIT_DESC =
            Comparator.comparingDouble(MonthAndProfit::getTotalProfit).reversed();

    static final Comparator<MonthAndProfit> PROFIT_ASC =
            Comparator.comparingDouble(MonthAndProfit::getTotalProfit);

    private String month;

    private double totalProfit;
    public MonthAndProfit( String month, double totalProfit){
        this.month=month;
        this.totalProfit=totalProfit;
    }

    public String getMonth() {
        return month;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "MonthAndProfit{" +
                "month='" + month + '\'' +
                ", totalProfit=" + totalProfit +
                '}';
    }

}
