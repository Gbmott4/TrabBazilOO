public class MinhaData{
  private int dia;
  private int mes;
  private int ano;

  public String toString(){
    String p1 = String.valueOf(this.dia);
    String p2 = String.valueOf(this.mes);
    String p3 = String.valueOf(this.ano);
    String result = p1.concat("/").concat(p2).concat("/").concat(p3);
    return result;
  }
  public int compara(MinhaData t){
    if(this.getDia()==t.getDia() && this.getMes() == t.getMes() && this.getAno() == t.getAno()){
      return 0;      
    }
    if(t.getAno()>this.getAno()){
      return -1;     
    }
    if(t.getMes()>this.getMes()){
      return -1;
    }
    if(t.getDia()>this.getDia() && t.getMes()==this.getMes()){
      return -1;
    }    
    return 1;
    }
  
  public void addDia(int qtd){
    setDia(getDia()+qtd);
  }
  public void subDia(int qtd){
    setDia(getDia()-qtd);
  }
  public void addMes(int qtd){
    setMes(getMes()+qtd);
  }
  public void subMes(int qtd){
    setMes(getMes()-qtd);
  }
  public void addAno(int qtd){
    setAno(getAno()+qtd);
  }
  public void SubAno(int qtd){
    setAno(getAno()-qtd);    
  }

  public MinhaData(int m,int n,int o){
    if(m>31||n>12){
      System.out.println("data invalida");
      return;
    }
    this.setDia(m);
    this.setMes(n);
    this.setAno(o);
  }
  public MinhaData(String p){
    String[] partes = p.split("/"); 
    int m = Integer.parseInt(partes[0]);
    int n= Integer.parseInt(partes[1]);
    int o=Integer.parseInt(partes[2]);

    if(m>31||n>12){
      System.out.println("data invalida");
      return;
    }
    this.setDia(m);
    this.setMes(n);
    this.setAno(o);
  }  
  
  public int getDia(){
    return this.dia;
  }
  void setDia(int m){
    this.dia = m;
  }
  public int getMes(){
    return this.mes;
  }
  public void setMes(int n){
    this.mes=n;
  }
  public int getAno(){
    return this.ano;
  }
  public void setAno(int o){
    this.ano=o;
  }
  
}