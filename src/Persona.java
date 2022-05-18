public class Persona extends Thread{
    
    String nome;
    Semaforo sem;
    Spogliatoio spo;
    Pista pista;

    public Persona(String nome, Semaforo sem, Spogliatoio spo, Pista pista){
        this.nome = nome;
        this.sem = sem;
        this.spo = spo;
        this.pista = pista;
    }

    public void azione(){

        sem.P();

        spo.cambio(nome);

        sem.V();


        
        sem.P();

        spo.cambio(nome);

        sem.V();
        
    }

}
