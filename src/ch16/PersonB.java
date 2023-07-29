package ch16;

public class PersonB {
    public void ordering(Comparable comparable){
        String a = "홍길동";
        String b = "김길동";

        int result = comparable.compare(a, b);

        if(result < 0) {
            System.out.println("A > B");
        }else if(result == 0){
            System.out.println("A == B");
        }else{
            System.out.println("A < B");
        }
    }
}
