package ch6;

/*
    다음과 같은 데이터를 가지는 Member class를 선언해라.
    Member(name, id, password, age)
 */

public class Member {

    private String password = "";
    private int age = 19;
    private String name = "";
    private String id = "";

    Member(String name, String id){
        this.name = name;
        this.id = id;
    }
    Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    void getData(){
        System.out.println("name = "+this.name);
        System.out.println("id = "+this.id);
        System.out.println("password = "+this.password);
        System.out.println("age = "+this.age);
    }
}


