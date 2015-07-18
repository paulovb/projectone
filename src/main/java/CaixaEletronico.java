/**
 * Created by root on 18/07/15.
 */
public class CaixaEletronico {

    public static int saque(int valor){
        int retorno = 0;
        if(valor >= 100){
            retorno = valor/100;
        } else{
            retorno = valor/50;
        }

        return retorno;
    }
}
