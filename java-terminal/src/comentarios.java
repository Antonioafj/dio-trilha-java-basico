public class comentarios {

    public static void main(String[] args) {
        
        //Olá eu sou um comentário em uma unica linha

        /*ola
         * Eu sou um comentario
         * que posso ser mais detalhado 
         * quando necessario
         */
    }
    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nivel de documentação
     * que incrivel!!!!
     */

    public void metodo(){

    }

    /* Este método foi elaborado as pressaspor isso 
     * eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade somas ou multiplicar
     * dois numeros
     */

    public int somaMultiplica(int n, int x, String m){

        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r = n * x;
        }else{
            // se não soma mesmo
            r = n * x;
        }
        return r;
        }

    }
