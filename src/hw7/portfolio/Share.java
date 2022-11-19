package hw7.portfolio;

import java.util.Objects;

public class Share {
    private final double  value;
    private final Company company;


    public Share(double value, Company company) {
        this.value = value;
        this.company = Objects.requireNonNull(company, "Can't create share with null company");;
    }

    public double getValue() {
        return value;
    }
}
