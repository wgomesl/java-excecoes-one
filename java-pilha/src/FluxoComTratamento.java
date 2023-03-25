public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        metodo1();
        } catch(ArithmeticException | NullPointerException ex) { 
        	// ex é uma referência para a classe 'ArithmeticException' e 'NullPointerException'
        	String msg = ex.getMessage();
        	// o método 'getMesssage()' exibe a mensagem da exceção.
        	
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        	// irá mostrar o número da linha onde se encontra o erro e o nome da classe.
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i); 
            int a = i / 0;
            //Conta c = null;
            //c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}