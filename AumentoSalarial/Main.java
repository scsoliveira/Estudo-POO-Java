class Main {
  public static void main(String[] args) {
    Funcionario func1 = new Funcionario("Jacinto", "502412744", 3500);
    double Nsalario = func1.aumentar_Salario(10);
    System.out.println("Novo salário: " +Nsalario);
  }
}