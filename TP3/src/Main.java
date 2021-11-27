public class Main {
    public static void main(String[] args) {
        Window_Method_1 myFrame1 = new Window_Method_1();
        //Window_Method_2 myFrame2 = new Window_Method_2();

        Animation a1 = new Animation(myFrame1.getOKLabel(), "MESSMERRRRRRRRRR", 50);
        a1.start();

        Animation a2 = new Animation(myFrame1.getCancelLabel(), "123456", 500);
        a2.start();
    }
}
