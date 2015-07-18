import org.junit.Assert;
import org.junit.Test;

public class CaixaEletronicoTest {

    @Test
    public void saqueDe300Test() throws Exception{
        int[][] esperado = {{100,3},{50,0},{20,0},{10,0}};
        int[][] resultado = CaixaEletronico.saque(300);
        Assert.assertArrayEquals(esperado, resultado);
    }

    @Test
    public void saqueDe50Test() throws Exception{
        int[][] resultado = {{100,0},{50,1},{20,0},{10,0}};
        Assert.assertArrayEquals(CaixaEletronico.saque(50),resultado);
    }

    @Test
    public void saqueDe20Test() throws Exception{
        int[][] resultado = {{100,0},{50,0},{20,1},{10,0}};
        Assert.assertArrayEquals(CaixaEletronico.saque(20),resultado);
    }

    @Test
    public void saqueDe10Test() throws Exception{
        int[][] resultado = {{100,0},{50,0},{20,0},{10,1}};
        Assert.assertArrayEquals(CaixaEletronico.saque(10),resultado);
    }

    @Test
    public void saqueDe30Test() throws Exception{

        int[][] resultado = {{100,0},{50,0},{20,1},{10,1}};
        Assert.assertArrayEquals(CaixaEletronico.saque(30), resultado);
    }

    @Test
    public void saqueDe350Test() throws Exception{

        int[][] resultado = {{100,3},{50,1},{20,0},{10,0}};
        Assert.assertArrayEquals(CaixaEletronico.saque(350), resultado);
    }

    @Test
    public void saqueDe305Test() throws Exception{

        try {
            CaixaEletronico.saque(305);
        } catch (Exception e){
            Assert.assertTrue(true);
            return;
        }
        Assert.fail();
    }


}
