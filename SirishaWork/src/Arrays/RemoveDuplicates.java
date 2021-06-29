package SirishaWork.src.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> unique = new ArrayList<>();
        l1.add("sirisha");
        l1.add("Aanya");
        l1.add("Anusha");
        l1.add("Anusha");

        for (String temp : l1) {
            if (!unique.contains(temp)) {
                unique.add(temp);
            }
        }
        System.out.println(unique);

    }
}
