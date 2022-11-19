package hw7.portfolio;

import java.util.Objects;

public class Company {
    private final String  name;

    public Company(String name) {
        this.name = Objects.requireNonNull(name, "Can't create company wth null name");
    }
}
