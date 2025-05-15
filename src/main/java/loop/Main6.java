package loop;

import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        // 학생들 전체의 평균점수를 출력
        int avg = 0;
        List<Student> students = List.of(
                new Student("김재원",80),
                new Student("김재투",94),
                new Student("김재쓰리",75),
                new Student("김재포",99),
                new Student("김재파이브",85)
        );
        int total = 0;
        for (Student student1 : students) {
            total += student1.getScore();
        }
        avg = total / students.size();
        System.out.println(avg);
    }
}
