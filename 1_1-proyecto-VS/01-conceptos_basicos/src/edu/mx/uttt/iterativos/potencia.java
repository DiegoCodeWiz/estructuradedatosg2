package edu.mx.uttt.iterativos;

public class potencia {
private double base;
private double exponente;

//constructores
public potencia(double base, double exponente) {
    this.base = base;
    this.exponente = exponente;
}

public double getBase() {
    return base;
}

public void setBase(double base) {
    this.base = base;
}

public double getExponente() {
    return exponente;
}

public void setExponente(double exponente) {
    this.exponente = exponente;
}

    // Método para calcular la potencia utilizando un ciclo
    public double calcularPotencia() {
        double resultado = 1.0;
        for (int i = 0; i < (int) exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }



}



