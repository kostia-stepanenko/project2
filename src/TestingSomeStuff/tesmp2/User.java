package TestingSomeStuff.tesmp2;

import TestingSomeStuff.Main;

import java.util.Comparator;
import java.util.Objects;

public class User extends Main.AbstractUser {


    private static Comparator<User> AGE_ASC = Comparator.comparing(User::getAge);

    private static Comparator<User> AGE_DESC = Comparator.comparing(User::getAge).reversed();


    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name + gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
