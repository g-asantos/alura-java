public class Gerente extends Funcionario{
    private int senha;


    public void setSenha(int senha) {
        this.senha = senha;
    }


    public boolean autenticacao(int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    public double getBonificacao(){
        System.out.println("Chamando o metodo de bonificacao"
        + " do gerente");
        return super.getSalario();
    }

    
}
