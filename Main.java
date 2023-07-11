class Main {
  public static void main(String[] args) {
    MinhaData data = new MinhaData(11,7,20023);
    MinhaData data2 = new MinhaData("25/12/2023");

    System.out.println(data.compara(data2));
    
    DataComemorativa d = new DataComemorativa("natal",true,true,data);
    DataComemorativa e = new DataComemorativa("hoje",false,false,data2);

    DatasCome r = new DatasCome();
    r.adiciona(d);
    r.mostrar();
    System.out.println(r.horasNaoTrab());
    r.remove("natal");   
    r.mostrar();
  }
}