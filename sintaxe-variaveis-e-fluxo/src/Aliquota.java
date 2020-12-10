public class Aliquota {
    public static void main(String[] args) {
        
        double wage = 3300.0;

        if(wage <= 1899.99){
            System.out.println("Isento de IR");
        } else if(wage >= 1900.0 && wage <= 2800.0){
            System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
        } else if(wage >= 2800.01 && wage <= 3751.0){
            System.out.println("o IR é de 15% e pode deduzir R$ 350");
        } else if(wage >= 3751.01 && wage <= 4664.00){
            System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
        } else{
            System.out.println("o IR é de 27.5% e pode deduzir R$ 869,36");
        }


    }
}
