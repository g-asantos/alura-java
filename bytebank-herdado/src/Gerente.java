//Gerente é um funcionario, Gerente herda da classe Funcionario, assina o contrato
// Autenticavel, é um autenticavel
public class Gerente extends Funcionario implements Autenticavel{
    
    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        
    }
 
    @Override
    public boolean autenticacao(int senha) {
        return this.autenticador.autenticacao(senha);

    }
    public double getBonificacao(){
        System.out.println("Chamando o metodo de bonificacao"
        + " do gerente");
        return super.getSalario();
    }

    
}
