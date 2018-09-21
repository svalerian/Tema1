package segmento;

import punto.Punto;

public class Segmento {
    private Punto izq;
    private Punto dcha;

    public Segmento (){
        izq = new Punto();
        dcha = new Punto(1);
    }

    public Segmento(int a, int b){
        izq = new Punto();
        dcha = new Punto(a,b);
    }

    // El problema de este es que como cambie el valor en la otra clase
    // esto se lo cepilla y apunta a basura
    // Constructor 3
    //public Segmento(Punto p1, Punto p2){
    //    izq = p1;
    //    dcha = p2;
    //}

    // Realmente es una copia
    // Constructor 3
    public Segmento(Punto p1, Punto p2){
        izq = new Punto(p1);
        dcha = new Punto(p2);
    }

    // Constructor 4
    // Pasa igual que en los anteriores constructores (contructor 3)
    //public Segmento(Segmento s){
    //    izq = s.getIzq();
    //    dcha = s.getDcha();
    //}

    // Constructor 4
    // Pasa igual que en los anteriores constructores (contructor 3)
    public Segmento(Segmento s){
        izq = new Punto (s.getIzq());
        dcha = new Punto (s.getDcha());
    }

    public Punto getIzq() {
        return izq;
    }

    public Punto getDcha() {
        return dcha;
    }

    public void setIzq(Punto izq){
        this.izq = izq;
    }

    public void setDcha(Punto dcha){
        this.dcha = dcha;
    }

    public double pendiente(){
        double divisor = getDcha().getX()-getIzq().getX();

        if (divisor != 0)
            return ((getDcha().getY()-getIzq().getY())/divisor);
        return 0;
    }

    public boolean sonConsecutivos(Segmento s){
        return getDcha().sonIguales(s.getIzq());
    }

    public boolean sonIguales(Segmento s){
        return ((getIzq().sonIguales(s.getIzq())) && (getDcha().sonIguales(s.getDcha())));
    }

}