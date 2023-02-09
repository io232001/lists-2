package it.develhope.arraysandlists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        randomNumbers.addAll(divisorsOf52);
        System.out.println("randomNumbers " + randomNumbers);
        System.out.println("randomNumbers n°: " + randomNumbers.size());
        HashSet<Integer> set = new HashSet<>(randomNumbers);
        randomNumbers.clear();
        randomNumbers.addAll(set);
        System.out.println("removing duplicates " + randomNumbers);
        System.out.println("randomNumbers after removing duplicates n°: " + randomNumbers.size());
        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println("randomNumbers after sorting in descending order: " + randomNumbers);
    }
}

        