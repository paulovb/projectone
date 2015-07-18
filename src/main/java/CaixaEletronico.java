public class CaixaEletronico {

    public enum Notas {
        CEM(100),
        CINQUENTA(50),
        VINTE(20),
        DEZ(10);

        public int nota;

        Notas(int nota) {
            this.nota = nota;
        }
    }

    private static int[][] notas = {};

    private static void adicionaNota(Notas nota){
        notas[nota.ordinal()][1] = notas[nota.ordinal()][1] + 1;
    }

    public static int[][] saque(int valor) throws Exception{

        notas = new int[][]{{100, 0}, {50, 0}, {20, 0}, {10, 0}};

        while (valor > 0) {

            if (valor >= Notas.CEM.nota) {
                adicionaNota(Notas.CEM);
                valor = valor - Notas.CEM.nota;

            } else if (valor >= Notas.CINQUENTA.nota) {
                adicionaNota(Notas.CINQUENTA);
                valor = valor - Notas.CINQUENTA.nota;

            } else if (valor >= Notas.VINTE.nota) {
                adicionaNota(Notas.VINTE);
                valor = valor - Notas.VINTE.nota;

            } else if (valor >= Notas.DEZ.nota){
                adicionaNota(Notas.DEZ);
                valor = valor - Notas.DEZ.nota;
            } else {
                throw new Exception("Valor inválido para saque!");
            }

        }

        return notas;
    }
}
