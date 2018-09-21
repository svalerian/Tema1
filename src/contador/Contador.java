
package contador;  

public class Contador {
    private int numPersonas;
    
    public Contador (){}
    
    public Contador (int n){
        if (n >= 0)
            numPersonas =n;
    }
    
    public void Incrementar (){
        numPersonas++;
    }
    
    public void Decrementar (){
        if (numPersonas > 0)
            numPersonas--;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int aNumPersonas) {
        if (aNumPersonas > 0)
            numPersonas = aNumPersonas;
    }
    
    public static void main(String[] args) {
        Contador c1 = new Contador ();
        Contador c2 = new Contador (60);
        Contador c3 = new Contador (-30);
        
        System.out.println("Numero de personas en C1: " + c1.getNumPersonas());
        System.out.println("Numero de personas en C2: " + c2.getNumPersonas());
        System.out.println("Numero de personas en C3: " + c3.getNumPersonas());
        
        c1.Incrementar();
        
        System.out.println("Numero de personas en C1: " + c1.getNumPersonas());
        System.out.println("Numero de personas en C2: " + c2.getNumPersonas());
        System.out.println("Numero de personas en C3: " + c3.getNumPersonas());
        
        c1.setNumPersonas();
        
        
    }

    private void setNumPersonas() {
    }
}
