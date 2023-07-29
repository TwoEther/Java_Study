package ch16;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOK = new Button();

        btnOK.setClickListener(() ->{
            System.out.println("OK 버튼 클릭");
        });

        btnOK.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼 클릭");
        });

        btnCancel.click();
    }
}
