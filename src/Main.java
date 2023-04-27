public class Main {
    public static void main(String[] args) {
        int contador =0;
        // laço de repetoção
        while (contador < 10) {
            System.out.println("Contador =" + contador);
            // incremento
            contador = contador + 1;
        }

        // laço para faça
        for(int x=0;  x < 10; x++){
            System.out.println("Contador = " + x);
        }

        // lsço faça enquanto
        int cont = 1;
        do{
           // processo
            System.out.println(cont);
            // incremento
            cont++;
        }while (cont <= 10);
    }
}