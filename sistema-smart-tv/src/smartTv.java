public class smartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal ( int novoCanal){
            canal = novoCanal;        
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal " + volume);

    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume " + volume);
    }
    
    
    public void ligar (){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}