import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ProdutoDAO;

import modelo.Produto;

public class TestaInsercaoEListagemComProduto {
    public static void main(String[] args) throws SQLException {
        Produto comoda = new Produto("Cômoda", "Cômoda vertical");

        try(Connection connection = new ConnectionFactory().recuperarConexao()){

           ProdutoDAO produtoDao = 
           new ProdutoDAO(connection);

           produtoDao.salvarProduto(comoda);

           List<Produto> listaDeProdutos = produtoDao.listar();

           listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
          
        }
        System.out.println(comoda);
    }
    
}
