public class DurataGara implements Comparable<DurataGara>{
    
    long tempo;
    String nome;

    public DurataGara(long tempo, String nome){
        this.tempo = tempo;
        this.nome = nome;
    }

    public long getTempo(){
        return tempo;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public int compareTo(DurataGara o) {

        if(this.getTempo() > o.getTempo()){
            return 1;
        }
        
        if(this.getTempo() < o.getTempo()){
            return -1;
        }

        return 0;
    }

}
