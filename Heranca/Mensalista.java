public class Mensalista extends Empregado {
    private String _cargo;

    public Mensalista(String cargo, String nome, String endereco, Double salario) {
        super(nome, endereco, salario);
        _cargo = cargo;
    }

    public String getCargo(){
        return _cargo;
    }

    public void setCargo(String cargo){
        _cargo = cargo;
    }

    public void cal_Salario(){
        if(_cargo.equals("Junior"))
            _salario = 2500.0;
        else if (_cargo.equals("Pleno"))
            _salario = 3500.0;
        else _salario = 5500.00;
    }

}