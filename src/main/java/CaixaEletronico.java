public class CaixaEletronico {

    public static int saque(int valor){
        int retorno = 0;
        if(valor >= 100){
            retorno = valor/100;
        } else {
            if (valor >= 50){
                retorno = valor/50;
            } else {
                if(valor >= 20){
                    retorno = valor/20;
                } else {
                    retorno = valor/10;
                }
            }
        }

        return retorno;
    }
}
