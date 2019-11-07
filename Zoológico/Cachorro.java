public class Cachorro extends Animal {
  private String _raca;

  public Cachorro (String nome, double peso, String raca){
    super(nome, peso);
    _raca = raca;
  }

  public String getRaca(){
    return  _raca;
  }

  public void setRaca(String raca){
      _raca = raca;
  }
  
}