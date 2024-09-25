import java.util.*;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Map;

class CustomerComparator implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        if (c1.grade < c2.grade)
            return 1;
        else if (c1.grade > c2.grade)
            return -1;
        else
            return 0;
    }
}

class Customer {
    public int grade;
    public double waitingTime;

    public Customer(int grade, double waitingTime) {
        this.grade = grade;
        this.waitingTime = waitingTime;
    }

    public int getGrade() {
        return grade;
    }

    public double getWaitingTime() {
        return waitingTime;
    }
}

public class RestaurantPriority {
    public static Queue<Map.Entry<Integer, Integer>> Restaurant = new PriorityQueue<Map.Entry<Integer, Integer>>();
    public static int waitingTime = 2 + (int) (Math.random() * ((7 - 2) + 1));

    public static void main(String[] args) {
        RestaurantPriority();
    }

    public static void RestaurantPriority() {
        double rand = 0.0;
        boolean newCustomer = false;
        for (int i = 360; i < 1440; i++) {
            if (Restaurant.isEmpty())
                waitingTime = 2 + (int) (Math.random() * ((7 - 2) + 1));
            if (i == 1439) {
                while (!Restaurant.isEmpty()) {
                    waitingTime--;
                    if (waitingTime == 0) {
                        Restaurant.remove();
                        waitingTime = 2 + (int) (Math.random() * ((7 - 2) + 1));
                    }
                    System.out.println(i + ": " + Restaurant);
                    i++;
                }
            }
            rand = Math.random();
            if (rand >= 0.0 && rand < 0.2)
                newCustomer = true;
            else
                newCustomer = false;
            if (newCustomer) {
                int grade = 0;
                double rand2 = Math.random();
                if (rand >= 0.0 && rand < 0.25)
                    grade = 1;
                else if (rand >= 0.25 && rand < 0.5)
                    grade = 2;
                else if (rand >= 0.5 && rand < 0.75)
                    grade = 3;
                else
                    grade = 4;
                Restaurant.add(new AbstractMap.SimpleEntry(grade, i));
            }

            if (!Restaurant.isEmpty()) {
                waitingTime--;
                if (waitingTime == 0)
                    Restaurant.poll();
            }
            if (!Restaurant.isEmpty() && waitingTime == 0) {
                waitingTime = 2 + (int) (Math.random() * ((7 - 2) + 1));
            }
            if (i < 1439)
                System.out.println(i + ": " + Restaurant);
        }
    }
}