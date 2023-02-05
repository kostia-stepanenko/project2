package TestingSomeStuff;

import TestingSomeStuff.tesmp2.User;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class Main {

    public static void main( final String[] args) {

        User user1 = new User("zorro", 100);
        user1.printMe();
    }

    public static abstract class AbstractUser {

        protected String gender;

        public void printMe(){
            System.out.println(getName() + ", " + getAge());
        }

        public abstract String getName();

        public abstract int getAge();

    }

}
