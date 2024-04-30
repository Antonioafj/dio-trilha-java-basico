public class usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smart = new smartTv();

        smart.diminuirVolume();
        smart.diminuirVolume();
        smart.diminuirVolume();
        smart.aumentarVolume();

        System.out.println("Canal Atual? " + smart.canal);
        smart.mudarCanal(13);
        System.out.println("Canal Atual? " + smart.canal);

        System.out.println("Volume Atual? " + smart.volume);
    
        
        System.out.println("TV Ligada? " + smart.ligada);
        
        System.out.println("Volume Atual? " + smart.volume);
    
        smart.ligar();
        System.out.println("Novo status -> TV Ligada? " + smart.ligada);
        
        smart.desligar();
        System.out.println("Novo status -> TV Ligada? " + smart.ligada);
    }
}
