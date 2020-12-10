public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int age = 18;
        int totalOfPeople = 3;
        boolean accompanied = totalOfPeople >= 2;

        if (age >= 18 && accompanied){
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente, você não pode entrar");

        }
    }
}
