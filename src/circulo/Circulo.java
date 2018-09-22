package circulo;
import punto.Punto;

public class Circulo {

    private Punto centro;
    private int radio;

    public Circulo(){
        centro = new Punto();
        radio = 1;
    }

    public Circulo(int r){
        centro = new Punto();
        if (r > 0){
            radio = r;
        }
    }

    public Circulo(Punto c, int r) {
        centro = new Punto(c);
        if (r > 0) {
            radio = r;
        }
    }

    public Circulo(Circulo c){
        centro = new Punto(c.getCentro());
        radio = c.getRadio();
    }

    public Punto getCentro(){
        return centro;
    }

    public int getRadio(){
        return radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setRadio(int radio){
        if (radio > 0) {
            this.radio = radio;
        }
    }

    public void mover(Punto p){
        setCentro(p);
    }

    public void cambiarTamanio(int r){
        setRadio(r);
    }

    public void desplazar(int a, int b){
        getCentro().setX(getCentro().getX() + a);
        getCentro().setY(getCentro().getY() + b);
    }

    public boolean sonIguales(Circulo c){
        return ((getRadio() == c.getRadio()) && (getCentro().sonIguales(c.getCentro())));
    }

}
