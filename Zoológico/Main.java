class Main {
  public static void main(String[] args) {
    Cachorro dog1 = new Cachorro("Toto", 10, "Labrador");
    Cachorro dog2 = new Cachorro("Bidu", 5, "Maltês");
    Peixe fish1 = new Peixe("Nemo", 0.300, "Aquário");
    Peixe fish2 = new Peixe("Tilápia", 1.5, "Mar");

    
    System.out.println("O cachorro se chama " + dog1.getNome() + ", pesa " + dog1.getPeso() + " e sua raça é " + dog1.getRaca()+"\n");

    System.out.println("O cachorro se chama " + dog2.getNome() + ", pesa " + dog2.getPeso() + " e sua raça é " + dog2.getRaca()+"\n");

    System.out.println("O peixe se chama " + fish1.getNome() + ", pesa " + fish1.getPeso() + " e habita o/a " + fish1.getTipoHabitat()+"\n");

    System.out.println("O peixe se chama " + fish2.getNome() + ", pesa " + fish2.getPeso() + " e habita o/a " + fish2.getTipoHabitat()+"\n");
    
  }
}