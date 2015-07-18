public class CaixaEletronico {

    public static int saque(int valor){
        int retorno = 0;
        if(valor >= 100){
            retorno = valor/100;
        } else{
            if (valor >= 50){
                retorno = valor/50;
            } else{
                retorno = valor/20;
            }
        }

        return retorno;
    }
}
