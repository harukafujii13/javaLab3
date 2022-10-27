public class App {
    public static void main(String[] args) throws Exception {
        
        Crocodile croc = new Crocodile();
        System.out.println(croc.showInfo());

        Ele eel = new Ele();
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
    }
}
