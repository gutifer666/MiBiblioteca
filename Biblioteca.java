
package mislibros;


public class Biblioteca {
    
    private Menu menu;

    public Biblioteca (){
        
        menu = new Menu();
    }
    public void ejecutar(){
        menu.mostrar();
        
        
    }
        public static void main(String[] args){
        new Biblioteca().ejecutar();
    }
    
}
