package edu.mx.uttt.iterativos;

public class SerieFactorial {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

   
    public double calcular(){
        double r = 0.0;
        int i = 1;
        do{
          r+= i/this.calcular(i);
          i++;
        }while(i<=this.n);

        return r;
    }   
    
    //Metodo utilitario
    private long calcular(int n){
        long    fact =1;
        for (int i=1; i <=n; i++){
               fact*=i;
        }
        return fact;
    }

    
}

