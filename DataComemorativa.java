public class DataComemorativa{
  private String nome;
  private boolean feriado;
  private boolean mundial;
  private MinhaData diaAssociado;

  public DataComemorativa(String m,boolean n,boolean o,MinhaData p){
    this.nome=m;
    this.feriado=n;
    this.mundial=o;
    this.diaAssociado=p;
  }
  public String getNome(){
    return this.nome;
  }
  public boolean getFeriado(){
    return this.feriado;
  }
}