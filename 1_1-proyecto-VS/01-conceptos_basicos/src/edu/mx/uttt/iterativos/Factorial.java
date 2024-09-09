package edu.mx.uttt.iterativos;
//::: PROGRMA PARA CALCULAR EL FACTORIAL DE UN NUMERO ENTERO :::

// 1. Realizar la validacion para que la variable de instancia nunca sea cero 
// 2. Realizar un metodo que calcule el factorial, ulilizando un ciclo for 
// 3.Rea;izar un metodo que calcule el factorial, de forma inversa utilizando un while

// ejemplo: Factorial
// f(1)=1
// f(2)=1*2
// f(3)=1*2*3
// f(n)=1*2*3 ....n

// f(1)=1
// f(2)=2*1
// f(3)=3*2*1
// f(n)=n* ....1


public class Factorial {
    //variable de instancia
    private int n;

    public Factorial(){
        this.n =1;
    }
    
    public Factorial(int n){
        this.n =(n<=0)?1:n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n =(n<=0)?1:n;
    }

    public long calcular(){
    long    fact =1;
    for (int i=1; i <=n; i++){
           fact*=i;
    }
    return fact;
}

public long calcularReverse(){
    long fact = 1;
    int i=n;
    while (i>=1){
        fact*=i;
        i--;
    }
    return fact;
}
 
public String toString (){
    return "El factorial ("+this.n+")=" + this.calcular();
}

    

}
