/*3-. Crear  la  clase  FormatoFechapara  probar  el  POLIMORFISMO.
La  clase  deberá  de  tener definidos  dos métodos  que reciban una fecha sin guiones ni plecas 
en formato String.  Ejemplo 10062012. a)El primer método deberá de imprimir la fecha con guiones.
Ejemplo: 10-06-2012.
b)El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012*/
package EjerciciosSemana3;

public class FormatoFecha {
    String dias;
    String mes;
    String año;

    public FormatoFecha() {
    }

    public FormatoFecha(String dias, String mes, String año) {
        this.dias = dias;
        this.mes = mes;
        this.año = año;
    }
    
    
}
