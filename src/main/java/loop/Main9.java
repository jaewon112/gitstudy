package loop;

import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        // ints 리스트에 integer 자료형으로 옮기시오 -> 업캐스팅
        List<Double> doubles = List.of(1.12, 2.23, 3.34, 4.45);
        List<Integer> ints = new ArrayList<>();

        int a = 10;
        Integer b = (Integer) a;
        int c = (int) b;
        for (Double as : doubles) {
            ints.add(as.intValue());
        }
        System.out.println(ints);

        for (Double d : doubles) {
            double dd = d;
            int i = (int) dd;
            ints.add(i);
        }
    }

}
