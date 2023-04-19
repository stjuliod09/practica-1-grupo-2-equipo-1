package hotel.servicios;
import java.util.ArrayList;

public class Comida {

        private String menu;
        private ArrayList<String> platos;
      
        public Comida(String menu) {
          this.menu = menu;
          this.platos = new ArrayList<String>();
        }
      
        public void agregarPlato(String plato) {
          this.platos.add(plato);
        }
      
        public void eliminarPlato(String plato) {
          this.platos.remove(plato);
        }
      
        public ArrayList<String> getPlatos() {
          return this.platos;
        }

        public String getMenu(){
            return this.menu;
        }
        
        public void setMenu(String menu) {
            this.menu = menu;
        }

        public void setPlatos(ArrayList<String> platos) {
            this.platos = platos;
        }

        public void imprimirMenu() {
          System.out.println("=== " + this.menu + " ===");
          for (String plato : this.platos) {
            System.out.println("- " + plato);
          }
        }
  
    
}
