
class Principal{
    public static void main(String[] args){
        Mensalista men1;
        Horista hora1;

        //MENSALISTA 
        men1 = new Mensalista ("Junior", "José", "Rua 7 de Setembro", 0.0);
        men1.cal_Salario();
        men1.cal_Inss();
        men1.Imprimir();

        //HORISTA
        hora1 = new Horista (100.00, "Cristiane", "Rua do Centro", 0.0);
        hora1.cal_Salario();
        hora1.cal_Inss();
        hora1.Imprimir();
    }
}