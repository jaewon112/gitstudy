package loop;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        // newWords에 1. bread 2. milk 3. egg 처럼 앞에 숫자를 붙여서 옮기시오
        List<String> words = List.of("bread","milk","egg");
        List<String> newWords = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            newWords.add((i+1+". ") + words.get(i));
        }
        System.out.println(newWords);

    }
}
