/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.frankie.iu;

import java.util.ArrayList;
import java.util.List;
import mx.itson.frankie.entidades.Ingrediente;
import mx.itson.frankie.entidades.Paso;
import mx.itson.frankie.entidades.Receta;
import mx.itson.frankie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {
    
   public static void main (String[] args) {
       
       Receta receta = new Receta();
       receta.setNombre("Frankie brownie");
       receta.setDescripción("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
       receta.setNumeroPorciones(6);
       receta.setDuracion(62);
       
       List<Ingrediente> ingredientes = new ArrayList<>();
       
       Ingrediente ingrediente1 = new Ingrediente();
       ingrediente1.setNombre("Caja de harina");
       
       Ingrediente ingrediente2 = new Ingrediente();
       ingrediente2.setNombre("1/2 Taza de Aceite de maíz");
       
       Ingrediente ingrediente3 = new Ingrediente();
       ingrediente3.setNombre("2 Huevos");
       
       Ingrediente ingrediente4 = new Ingrediente();
       ingrediente4.setNombre("1 Paquete de Queso crema a temperatura ambiente (190 g)");
       
       Ingrediente ingrediente5 = new Ingrediente();
       ingrediente5.setNombre("1 Bolsa de Leche Condensada LA LECHERA® (209 g)");
       
       Ingrediente ingrediente6 = new Ingrediente();
       ingrediente6.setNombre("2 Cucharadas de Ralladura de limón");
       
        Ingrediente ingrediente7 = new Ingrediente();
       ingrediente7.setNombre("2 Cucharadas de Mantequilla a temperatura ambiente");
       
        Ingrediente ingrediente8 = new Ingrediente();
       ingrediente8.setNombre("Colorante vegetal para alimentos color verde");
       
        Ingrediente ingrediente9 = new Ingrediente();
       ingrediente9.setNombre("12 Ojos de Azúcar");
       
        Ingrediente ingrediente10 = new Ingrediente();
       ingrediente10.setNombre("1/2 Barra de Chocolate amargo fundido (75 g)");
       
        Ingrediente ingrediente11 = new Ingrediente();
       ingrediente11.setNombre("6 Lunetas de chocolate");
       
       ingredientes.add(ingrediente1);
       ingredientes.add(ingrediente2);
       ingredientes.add(ingrediente3);
       ingredientes.add(ingrediente4);
       ingredientes.add(ingrediente5);
       ingredientes.add(ingrediente6);
       ingredientes.add(ingrediente7);
       ingredientes.add(ingrediente8);
       ingredientes.add(ingrediente9);
       ingredientes.add(ingrediente10);
       ingredientes.add(ingrediente11);

       
       receta.setIngredientes(ingredientes);
       
       //agregas pasos
        List<Paso> pasos = new ArrayList<>();
       Paso pasos1 = new Paso();
       pasos1.setOrden(1);
       pasos1.setDescripcion("Horno precalentado a 180 °C");
       
       Paso pasos2 = new Paso();
       pasos2.setOrden(2);
       pasos2.setDescripcion("Mezcla la harina para brownies chocolate Fudge de Betty Crocker® con el agua, el aceite y los huevos. Vierte la mezcla en un molde cuadrado de 30 x 20 cm previamente en harinado y hornea a 180 °C durante 25 minutos. Retira del horno y enfría.");
       
       Paso pasos3 = new Paso();
       pasos3.setOrden(3);
       pasos3.setDescripcion("Bate el queso crema con la Leche Condensada LA LECHERA®, la ralladura de limón, la mantequilla y un poco de colorante hasta integrar por completo y refrigera por 20 minutos.");
       
       Paso pasos4 = new Paso();
       pasos4.setOrden(4);
       pasos4.setDescripcion("Desmolda y corta en cuadros. Unta los brownies con un poco de betún; dibuja el cabello y la boca con el chocolate fundido, coloca los ojos de azúcar y la nariz con las lunetas.");
       
       receta.setPasos(pasos);
       
       
       receta.setDificultad(Dificultad.FACIL);
       
   }
    
}
