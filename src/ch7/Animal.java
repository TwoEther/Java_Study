package ch7;


public abstract class Animal {
    String kind;

    Animal(String kind){
        this.kind = kind;
    }

    void sound(){
        System.out.println("해당 동물은 : "+this.kind+" 입니다.");
    }
}
