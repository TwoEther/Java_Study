package ch13;

public class ContainerExample {
    public static void main(String[] args){
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        System.out.println(name1+" "+job);
    }
}
