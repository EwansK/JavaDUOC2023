
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ewans Ewoldt
 */
public class Canal {
    private String nombre;
    private String descripcion;
    private int cantSubs;
    private int cantVideos;
    private String canalURL;
    private Cuenta cuenta;

    public Canal() {
    }

    public Canal(String nombre, String descripcion, int cantSubs, int cantVideos, String canalURL, Cuenta cuenta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantSubs = cantSubs;
        this.cantVideos = cantVideos;
        this.canalURL = canalURL;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantSubs() {
        return cantSubs;
    }

    public void setCantSubs(int cantSubs) {
        this.cantSubs = cantSubs;
    }

    public int getCantVideos() {
        return cantVideos;
    }

    public void setCantVideos(int cantVideos) {
        this.cantVideos = cantVideos;
    }

    public String getCanalURL() {
        return canalURL;
    }

    public void setCanalURL(String canalURL) {
        this.canalURL = canalURL;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Canal{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", cantSubs=" + cantSubs + ", cantVideos=" + cantVideos + ", canalURL=" + canalURL + ", cuenta=" + cuenta + '}';
    }
    Scanner scan = new Scanner(System.in);
    public void mostrarInfo(){
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Descripción: "+ this.getDescripcion());
        System.out.println("Suscriptores: " + this.getCantSubs());
        System.out.println("Videos subidos: "+ this.getCantVideos());
        System.out.println("URL del canal: "+ this.getCanalURL());
    }
    
    public void aumentarSubs(){
        System.out.println("Ingrese la cantidad de suscriptores a aumentar");
        int subs = scan.nextInt();
        this.cantSubs = this.cantSubs + subs;
        System.out.println("La cantidad de suscriptores ahora es: " + this.cantSubs);
        int ganancias = 0;
        if (this.cantSubs >= 10000) {
            ganancias = ganancias + 500;
            System.out.println("Las ganancias acumuladas son: $" + ganancias + " pesos");       
    }
    
    
    
    
    }
}
        
            
    

