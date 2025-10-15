public class LivrareRun {
    public static void main(String[] args) {
        Livrare chemare = new Livrare();

        chemare.trimitePachet();
        chemare.trimitePachet("Strada Stefan cel Mare 12, Chisinau");
        chemare.trimitePachet("Strada Independentei 8, Chisinau", 2.5);
        chemare.trimitePachet("Strada Independentei 8, Chisinau", 2.5,"Urgent (1 zi)");
    }
}
