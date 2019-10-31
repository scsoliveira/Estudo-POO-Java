public class Empregado{
    protected String _nome;
    protected String _endereco;
    protected Double _salario;

    public Empregado(String nome, String endereco, Double salario) {
        _nome = nome;
        _endereco = endereco;
        _salario = salario;
    }

    public String getNome(){
        return _nome;
    }

    public String getEndereco(){
        return  _endereco;
    }

    public Double getSalario(){
        return _salario;
    }

    public void setNome(String nome){
        _nome = nome;
    }

    public void setEndereco(String endereco){
        _endereco = endereco;
    }

    public void setSalario(Double salario){
        _salario = salario;
    }

    public double imp_Renda(){
        double aux;
        if(_salario < 1800)
            aux = 0.1 * _salario;
        else aux = 0.27*_salario;
        return aux;
    }

    public double cal_Inss(){
        return 0.11*_salario;
    }

    public void Imprimir(){
        System.out.println("Nome:\n" +_nome);
        System.out.println("Endereço:\n" +_endereco);
        System.out.println("Salário:\n" +_salario);
        System.out.println("Imposto de Renda:\n" +imp_Renda());
        System.out.println("INSS:\n" +cal_Inss());
        System.out.println("--------------------------------------");
    }
}