package main.company.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getResult("iiisdoso"));
    }

    public List<Integer> getResult(final String input) {
        int x = 0;
        List<Integer> result = new ArrayList<>();
        List<Character> characterList = input.chars().mapToObj(e -> (char)e).collect(Collectors.toList());

        for (Character ch: characterList) {
            switch (ch) {
                case 'i':
                    x += 1;
                    break;
                case 'd':
                    x -= 1;
                    break;
                case 's':
                    x *= x;
                    break;
                case 'o':
                {
                    result.add(x);
                    break;
                }
            }
        }
        return result;
    }
}
