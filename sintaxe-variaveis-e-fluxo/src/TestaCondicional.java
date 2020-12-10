public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int age = 16;
        int totalOfPeople = 3;

        if (age >= 18){
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            if(totalOfPeople >= 2){
                System.out.println("você não tem 18, mas pode entrar, "
                + "pois está acompanhado");
            } else{
                System.out.println("infelizmente, você não pode entrar");
            }


        }


    }
}
