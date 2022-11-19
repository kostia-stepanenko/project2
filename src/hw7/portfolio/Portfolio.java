package hw7.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Portfolio {

    private final List<Share> shares = new ArrayList<>();
    private int noShares;

    public void addShare(Share s) {
        Objects.requireNonNull(s, "Can't add null share");
        shares.add(s);
    }

    public double computeSum() {
        double res = 0.0;
        for (Share cur : shares) {
            res += cur.getValue();
        }

        return res;
    }


    public static void main(String[] args) {
        Portfolio p = new Portfolio();
        Company c1 = new Company("Ubisoft");
        Share s1 = new Share(1200, c1);
        Share s2 = new Share(500, c1);
        Share s3 = new Share(700, c1);
        Company c2 = new Company("Apple");
        Share s4 = new Share(800, c2);
        Share s5 = new Share(900, c2);
        Share s6 = new Share(100, c2);
        p.addShare(s1);
        p.addShare(s2);
        p.addShare(s3);
        p.addShare(s4);
        p.addShare(s5);
        p.addShare(s6);
        System.out.println(p.computeSum());
    }
}
