public class App {
    interface MySayInterface {
        void say(String s);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MySayInterface mSumInterface = (s) -> System.out.println(s);
        mSumInterface.say("Hello");
    }
}
