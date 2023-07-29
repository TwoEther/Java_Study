package ch16;

public class MethodReferenceExample {
    public static void main(String[] args) {
        PersonB personB = new PersonB();
        personB.ordering(String::compareToIgnoreCase);
    }
}
