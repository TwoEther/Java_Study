package ch16;

public class Button {
    @FunctionalInterface
    public static interface ClickListener{
        void onclick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){this.clickListener.onclick();}
}

