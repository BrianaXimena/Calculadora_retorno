 import javax.swing.JOptionPane;

public class calculadora {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Dijita el num 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Dijita el num 2"));

        Operaciones op=new Operaciones();
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1,n2);
        op.dividir(n1, n2);
        op.modulo(n1, n2);
        op.mostrarResultados();
    }
}