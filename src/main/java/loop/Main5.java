package loop;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        //단어의 시작이 A 또는 a 로 시작하는 단어를 newWords 리스트에 담아 출력하시오
        List<String> words = List.of("Apple", "banana", "avocado", "carrot");
        List<String> newWords = new ArrayList<>();
        List<String> newWords2 = new ArrayList<>();
        List<String> newWords3 = new ArrayList<>();

        for (String word : words) {
            if (word.startsWith("a") || word.startsWith("A")) {
                newWords.add(word);
            }

        }for (String word : words) {
            char c = word.charAt(0);
            if (c == 'a'|| c=='A') {
                newWords2.add(word);
            }
        }
        for (String word : words) {
            String firstStr = word.substring(0, 1);  // substring 을 사용하면 new String이라는 새로운 참조값이 생성됨
            if (firstStr.equalsIgnoreCase("a") ) {          // IgnoreCase 는 대소문자를 무시하라는 뜻
                newWords3.add(word);
            }
        }
        System.out.println(newWords);
        System.out.println(newWords2);
        System.out.println(newWords3);
    }
}
