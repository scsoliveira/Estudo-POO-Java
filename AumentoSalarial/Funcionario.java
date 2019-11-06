public class Funcionario extends Pessoa{
    private double _salario;

    public Funcionario(String nome, String rg, double salario) {
        super(nome, rg);
        _salario = salario;
    }

    public double getSalario(){
        return  _salario;
    }

    public void setSalario(double salario){
        _salario = salario;
    }

    public double aumentar_Salario(double percentual){
        double aux;
        aux = ((percentual/100) * _salario) + _salario;
        return aux;
    }
}