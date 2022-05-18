public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Spogliatoio spogliatoio = new Spogliatoio();

        Semaforo s = new Semaforo(1);

        

        Pista pista = new Pista();

        Persona p = new Persona("Alessandro", s, spogliatoio, pista);
        Persona p1 = new Persona("Francesco", s, spogliatoio, pista);
        Persona p2 = new Persona("Mario", s, spogliatoio, pista);

        p.start();
        p1.start();
        p2.start();

        p.join();
        p1.join();
        p2.join();
    }
}
