package cliente;

import java.io.IOException;


import org.apache.http.client.fluent.Request;

public class ClienteWebService {
    public static void main(String[] args) throws IOException {
        String conteudo = Request.Post("http://localhost:8080/manager/empresas")
        .addHeader("accept", "application/json")
        .execute()
        .returnContent()
        .asString();

        System.out.println(conteudo);
    }
}
