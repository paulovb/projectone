import org.junit.Assert;
import org.junit.Test;

public class CaixaEletronicoTest {

    @Test
    public void saqueDe300Test(){
        Assert.assertEquals(CaixaEletronico.saque(300),3);
    }
}
