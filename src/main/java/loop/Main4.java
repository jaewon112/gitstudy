package loop;

import lambda.Main;

import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        // 학생들 중 가장 점수가 높은 학생의 이름을 출력하시오.
            List<Student> students = List.of(
                    new Student("김재원",80),
                    new Student("김재투",94),
                    new Student("김재쓰리",75),
                    new Student("김재포",99),
                    new Student("김재파이브",85)
            );
        Student a = null;
        for (Student student : students) {
            if (a == null) {
                a = student;
            } else if (a.getScore() < student.getScore()) {
                    a = student;
                }
        }
        if (a != null) {
            System.out.println(a.getName());
        }
    }
}
