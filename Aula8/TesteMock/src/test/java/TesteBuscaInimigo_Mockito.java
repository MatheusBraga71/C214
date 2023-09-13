import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class) //Essa classe será executada com uma versão do JUnit propria para o mockito
public class TesteBuscaInimigo_Mockito {

    @Mock //A linha de baixo vai ser automaticamente mockada pelo mockito
    private InimigoService service;
    private BuscaInimigo buscaInimigo;
    @Before
    public void setup(){
        buscaInimigo = new BuscaInimigo(service);
    }

    @Test
    public void testeBuscaInimigo(){
        Mockito.when(service.busca(10)).thenReturn(InimigoConst.bulbasaur);

        Inimigo bulbasaur = buscaInimigo.buscaInimigo(10);

        Assert.assertEquals("Bulbasaur", bulbasaur.getNome());
        Assert.assertEquals(200.0, bulbasaur.getQtdVida(),0.1);
        Assert.assertEquals("Solar Beam", bulbasaur.getArma());
    }

    @Test (expected = NullPointerException.class)
    public void testeBuscaInimigoInvalido(){
        Mockito.when(service.busca(-10)).thenThrow(NullPointerException.class);

        Inimigo bulbasaur = buscaInimigo.buscaInimigo(-10);
    }

}
