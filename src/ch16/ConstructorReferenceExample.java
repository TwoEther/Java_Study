package ch16;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        PersonC person = new PersonC();

        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);

        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);
    }
}
