public class Operaciones {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int modulo;
    //Métodos


    //método de suma
    public void sumar(int numero1, int numero2){
        suma=numero1+numero2;
    }
    public void restar(int numero1, int numero2){
        resta=numero1-numero2;
    }
    public void multiplicar(int numero1, int numero2){
        multiplicacion=numero1*numero2;
    
    }
    public void dividir(int numero1, int numero2){
        division=numero1/numero2;
    }
        //Modulo
    public void modulo(int numero1, int numero2){
        modulo=numero1%numero2;
        
    }


public void mostrarResultados(){
    System.out.println("La suma es"+suma);
    System.out.println("La resta es"+resta);
    System.out.println("La multiplicación es"+multiplicacion);
    System.out.println("La división es"+division);
    System.out.println("El modulo es"+ modulo);
}
}
