public class App {
    public static void main(String[] args) throws Exception {
        
        Operadores op1 = new Operadores();

        //Aritmeticos
        System.out.println("         Operadores Artiméticos        ");
        System.out.println(" ");
        System.out.println("Resultado: "+op1.adicao(10, 6));
        System.out.println("Resultado: "+op1.subtracao(10, 6));
        System.out.println("Resultado: "+op1.multiplicacao(10, 6));
        System.out.println("Resultado: "+op1.divisao(10, 6));
        System.out.println("Resultado: "+op1.resdiv(10, 6));
        System.out.println(" ");
        
        //Relacionais
        System.out.println("         Operadores Relacionais        ");
        System.out.println(" ");
        System.out.println("Resultado: "+op1.menor(10, 6));
        System.out.println("Resultado: "+op1.menorouigual(10, 6));
        System.out.println("Resultado: "+op1.maior(10, 6));
        System.out.println("Resultado: "+op1.maiorouigual(10, 6));
        System.out.println("Resultado: "+op1.igual(10, 6));
        System.out.println("Resultado: "+op1.diferente(10, 6));
        System.out.println(" ");

        //Lógicos
        System.out.println("         Operadores Lógicos        ");
        System.out.println(" ");
        System.out.println("Resultado: "+op1.logicaOR(10, 6));
        System.out.println("Resultado: "+op1.logicaAND(6, 6));
        System.out.println("Resultado: "+op1.logicaNOT(3));
        System.out.println("Resultado: "+op1.logicaXOR(15, 6));
        System.out.println(" ");

    }
}
