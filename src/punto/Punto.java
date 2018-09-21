package punto;

public class Punto {
    private int x;
    private int y;
    
    public Punto(){}
    
    public Punto(int n){
        x = n;
    }
    
    public Punto(int n, int z){
        x = n;
        y = z;
    }
    
    public Punto(Punto p){
        x = p.getX();
        y = p.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    public void desplazarXY(int a, int b){
        desplazarX(a);
        desplazarY(b);
    }
    
    public void desplazarX(int a){
        x = x + a;
    }
    
    public void desplazarY(int b){
        y = y + b;
    }

    @Override
    public String toString() {
        return ("Punto X: " + getX() + " Y: " + getY()); 
    }
    
    public boolean sonIguales (Punto p){
        return ((getX() == p.getX()) && (getY() == p.getY()));
    }
    
    public Punto copia (){
        return new Punto (getX(), getY());
    }
    
    
}
