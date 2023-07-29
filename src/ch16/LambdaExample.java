package ch16;

public class LambdaExample {
    public static void main(String[] args){
        Person person = new Person();

        person.action(Double::sum);
    }

}
