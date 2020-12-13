public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Administrador adm = new Administrador();
        Cliente client = new Cliente();

        g.setSenha(2222);
        adm.setSenha(3333);
        client.setSenha(1111);

        SistemaInterno si = new SistemaInterno();
        si.autenticacao(g);
        si.autenticacao(adm);
        si.autenticacao(client);
    }
}
