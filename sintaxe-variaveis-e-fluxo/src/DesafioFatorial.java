
public class DesafioFatorial {
    public static void main(String[] args) {
       
        int fatorial = 1;
        for (int counter = 1; counter < 11; counter++) {
            fatorial *= counter;
            System.out.println("Fatorial de " + counter + ": " + fatorial);
        }


        /* Explicação
            Importante notar, que o fatorial se mantem entre "giradas" pelo loop;
            Dessa forma, quando o counter é 1, o fatorial ainda é 1, logo o resultado
            é 1x1
            Quando o counter é 2, o fatorial segue 1, logo 2x1
            Quando o counter for 3, AGORA o fatorial é 2, logo 3x2x1
        */
        
    }
    
}