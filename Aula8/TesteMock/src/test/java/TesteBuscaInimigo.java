import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaInimigo {

    InimigoService service;
    BuscaInimigo buscaInimigo;
    @Before
    public void setup(){
        service = new MockInimigoService();
        buscaInimigo = new BuscaInimigo(service);
    }

    @Test
    public void testeBuscaInimigo(){

        Inimigo bulbasaur = buscaInimigo.buscaInimigo(10);

        assertEquals("Bulbasaur", bulbasaur.getNome());
        assertEquals(200.0, bulbasaur.getQtdVida(),0.1);
        assertEquals("Solar Beam", bulbasaur.getArma());

    }

    @Test
    public void testeBuscaInimigoInvalido(){

        Inimigo inimigo_invalido = buscaInimigo.buscaInimigo(-10);

        assertEquals("Invalido", inimigo_invalido.getNome());
        assertEquals(200.0, inimigo_invalido.getQtdVida(),0.1);
        assertEquals("Invalido Beam", inimigo_invalido.getArma());
    }

}
