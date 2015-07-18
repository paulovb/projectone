import org.junit.Assert;
import org.junit.Test;

public class CaixaEletronicoTest {

    @Test
    public void saqueDe300Test(){
        Assert.assertEquals(CaixaEletronico.saque(300),3);
    }

    @Test
    public void saqueDe50Test(){
        Assert.assertEquals(CaixaEletronico.saque(50),1);
    }

    @Test
    public void saqueDe20Test(){
        Assert.assertEquals(CaixaEletronico.saque(20),1);
    }
}
