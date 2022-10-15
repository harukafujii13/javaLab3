public class App {
    public static void main(String[] args) throws Exception {
        
        Crocodile croc = new Crocodile();
        System.out.println(croc.showInfo());

        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
    }
}
