public class Horista extends Empregado {
    private double _horas;

    public Horista(double horas, String nome, String endereco, Double salario) {
        super(nome, endereco, salario);
        _horas = horas;
    }

    public Double getHoras(){
        return _horas;
    }

    public void setHoras(Double horas){
        _horas = horas;
    }

    public void cal_Salario(){
        _salario = _horas*50;
    }

}