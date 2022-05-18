import java.util.ArrayList;
import java.util.Collections;

public class Pista extends Thread{
    
    
    long start;
    long stop;
    long tempo;
    ArrayList<DurataGara> risultati;

    public Pista(){
        
        risultati = new ArrayList();
    }

    

    public void inizioGara(String nome){

        
        
        
        
        DurataGara d;

        System.out.println(nome + " ha iniziato la gara");
        
        start = System.nanoTime();
        

        for(int i = 0; i < 15; i++){

            
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (Exception e) {}
            
            
        }

        
        stop = System.nanoTime();
        tempo = (stop-start) / 1000000;
        d = new DurataGara(tempo, nome);
        risultati.add(d);
        Collections.sort(risultati);
        
    }


}
