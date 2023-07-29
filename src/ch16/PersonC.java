package ch16;

public class PersonC {
    public Member getMember1(Table1 table1){
        String id = "winter";
        Member member = table1.create(id);
        return member;
    }
    public Member getMember2(Table2 table2){
        String id = "winter";
        String name = "한겨울";
        Member member = table2.create(id, name);
        return member;
    }

}
