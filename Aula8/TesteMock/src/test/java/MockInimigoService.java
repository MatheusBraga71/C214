public class MockInimigoService implements InimigoService{
    @Override
    public String busca(int id) {

        if (id == 10){
            return InimigoConst.bulbasaur;
        }
        else if(id == -10){
            return InimigoConst.Invalido;
        }
        else {
            return "nada";
        }
    }
}
