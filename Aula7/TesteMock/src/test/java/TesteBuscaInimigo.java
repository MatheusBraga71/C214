import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaInimigo {

    @Test
    public void testeBuscaInimigo(){

         InimigoService service = new MockInimigoService();
         BuscaInimigo buscaInimigo = new BuscaInimigo(service);

         Inimigo bulbasaur = buscaInimigo.buscaInimigo(10);

         assertEquals("Bulbasaur", bulbasaur.getNome());
         assertEquals(200.0, bulbasaur.getQtdVida(),0.1);
         assertEquals("Solar Beam", bulbasaur.getArma());

    }
}
