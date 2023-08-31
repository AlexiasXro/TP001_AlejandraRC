/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp001;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
/**
 *
 * @author Alexias
 */
public class Calculadora {
    public boolean isDiaSemana(String dia) {
        // Convertir la cadena a mayúsculas para facilitar la comparación
        String diaMayusculas = dia.toUpperCase();
        
        // Recorrer todos los días de la semana y comparar con el día proporcionado
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            // Obtener el nombre del día de la semana en español
            String nombreDiaSemana = dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
            
            // Comparar el nombre del día con el valor proporcionado
            if (nombreDiaSemana.toUpperCase().equals(diaMayusculas)) {
                return true;
            }
        }
        
        return false;
    }
}
