public class Main {
    public static void main(String[] args) {
        int contador =0;

        // laço de repetição
        while (contador < 10) {
            System.out.println("Contador =" + contador);

            // incremento
            contador = contador + 1;
        }

        // laço para faça
        for(int x=0;  x < 10; x++){
            System.out.println("Contador = " + x);
        }

        // laço faça enquanto
        int cont = 1;
        do{

            // processo
            System.out.println(cont);

            // incremento
            cont++;
        }while (cont <= 10);

        // Aula intrudutória de Orientação a objeto

        // Declaração de objeto
        Pessoa adao;

        // Instanciação do onjeto
        adao = new Pessoa();

        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();

        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";

        // Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("Oi"));

        // Criar novos objetos

        // Declarar o objeto
        Pessoa rainha;

        // Instanciar objetos
        rainha = new Pessoa();

        // Definir forma do objeto
        rainha.nome = "tina";
        rainha.sobrenome = "tunner";

        // Definir comportamneto
        rainha.falar();
        rainha.comer();
    }
}