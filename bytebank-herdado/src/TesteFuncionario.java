public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("22222222-22");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
        
    }
}
