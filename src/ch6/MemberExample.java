package ch6;


public class MemberExample {
    static void p14() {
        Member member = new Member("홍길동", "hong");
        member.getData();
    }

    static void p15() {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다");
        }else {
            System.out.println("id 또는 password가 올바르지 않습니다");
        }
    }

    public static void main(String[] args) {
        p15();
    }
}
