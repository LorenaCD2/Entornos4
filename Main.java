/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos4;

/**
 *
 * @author lore
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     eCesta cesta;

        NuevoMetodo();
    }

    public static void NuevoMetodo() {
        eCesta cesta;
        cesta = new eCesta("Apellidos del alumno",100, "dni del alumno", 10);
        try
            
        {

            cesta.comprar(50);

        } catch (Exception e)

        {

            System.out.println("No se puede pagar  ");

        }
        try

        {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e)

        {

            System.out.println("Error al recargar");

        }
        double bonoactual = cesta.bonificacion();
        System.out.println("Su bono actual es  "+ bonoactual );
    }
    
}
