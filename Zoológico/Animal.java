public class Animal {
  protected String _nome;
  protected double _peso;

  public Animal (String nome, double peso){
    _nome = nome;
    _peso = peso;
  }

  public String getNome(){
    return  _nome;
  }

  public double getPeso(){
    return  _peso;
  }

  public void setPeso(double peso){
      _peso = peso;
  }

  public void setNome(String nome){
      _nome = nome;
  }
  
}