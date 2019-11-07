public class Peixe extends Animal {
  private String _tipoHabitat;

  public Peixe (String nome, double peso, String tipoHabitat){
    super(nome, peso);
    _tipoHabitat = tipoHabitat;
  }

  public String getTipoHabitat(){
    return  _tipoHabitat;
  }

  public void setTipoHabitat(String tipoHabitat){
      _tipoHabitat = tipoHabitat;
  }
  
}