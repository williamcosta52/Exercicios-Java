public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
        app.ImparOuPar(10);
        app.fibonacci();
        app.taboada(8);
    }
    public void ImparOuPar(int num) {
        String message = num + " é ";
        if (num % 2 == 0) {
            message += "par e ";
        } else {
            message += "ímpar e ";
        }
        if (num > 0) {
            message += "positivo.";
        } else {
            message += "negativo.";
        }
        System.out.println(message);
    }
    public void fibonacci() {
        int x = 20;
        int n1 = 0;
        int n2 = 1;
        for (int qtd = x; qtd > 0; qtd--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
    public void taboada(int num) {
        for (int i = 1; i <= num; i++) {
            String imprimir = "";
            for (int j = 1; j <= i; j++) {
                imprimir += i;
            }
            System.out.println(imprimir);
        }
    }
}