public class Operadores {
    private double n1,n2;
    private boolean estado;

    //Aritmeticos

    public double adicao (double n1,double n2){
        return n1+n2;
    }
    public double subtracao (double n1,double n2){
        return n1-n2;
    }
    public double multiplicacao (double n1,double n2){
        return n1*n2;
    }
    public double divisao (double n1,double n2){
        return n1/n2;
    }
    public double resdiv(double n1,double n2){
        return n1%n2;
    }
    //Operadores Relacionais
    public boolean menor(double n1,double n2){
        estado = n1<n2;
        return estado;
    }
    public boolean maior(double n1,double n2){
        estado = n1>n2;
        return estado;
    }
    public boolean menorouigual(double n1,double n2){
        estado = n1<=n2;
        return estado;
    }
    public boolean maiorouigual(double n1,double n2){
        estado = n1>=n2;
        return estado;
    }
    public boolean igual(double n1,double n2){
        estado = n1==n2;
        return estado;
    }
    public boolean diferente(double n1,double n2){
        estado = n1!=n2;
        return estado;
    }
    //Operadores Lógicos
    public boolean logicaOR(double n1,double n2){
        estado = n1>5 || n2>5;
            return estado; 
    }
    public boolean logicaAND(double n1,double n2){
        estado = n1>5 && n2>5;
            return estado; 
    }
    public boolean logicaNOT(double n1){
        estado = !(n1>5);
            return estado; 
    }
    public boolean logicaXOR(double n1,double n2){
         estado = n1>5 ^ n2>5;
            return estado; 
    }
    
    
    
    

    
}
