import java.util.List;
import java.util.ArrayList;

public class DatasCome{
  List< DataComemorativa> dates = new ArrayList<>();

  void adiciona(DataComemorativa p){
     dates.add(p);
  }

  void remove(String nome){
    for (DataComemorativa aux : dates) {
      if (aux.getNome().equals(nome)) {
        dates.remove(aux);
        break;
      }
    }
  }
  public int horasNaoTrab(){
    int cont=0;
    for(DataComemorativa objeto : dates){
      if(objeto.getFeriado()){
        cont++;
      }
    }
    return cont*8;
  }
  public void mostrar(){
    for(DataComemorativa objeto : dates){
      System.out.println(objeto.getNome());
    }
  }
}
    
  