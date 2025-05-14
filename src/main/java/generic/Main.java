package generic;

public class Main {
    /*
        와일드카드(<?>) 제약 조건
        1. ? extends 클래스자료형 -> 해당 클래스 자료형의 `자식` 클래스자료형만 허용
        2. ? super 클래스자료형   -> 해당 클래스 자료형의 `부모` 클래스자료형만 허용
     */
    public static void showAll(Repoitory<? extends Student>repoitory){
        repoitory.findAll().forEach(System.out::println);
    }
    public static void main(String[] args) {
        Repoitory<HighStudent> hsRepo = new Repoitory<>();
        Repoitory<AcademyStudent> asRepo = new Repoitory<>();

        hsRepo.save(new HighStudent());
        asRepo.save(new AcademyStudent());

        hsRepo.findAll().forEach(s -> s.getClass());
        hsRepo.findAll().forEach(s -> s.getClass());

        showAll(hsRepo);
    }
}
