package Controlador;

import Modelo.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TDTControlador {

    @GetMapping("/Traduccion")
    public String Traduccion(Model model) {
        String resultado = "";
        List<ComunicadorTexto> Contexto
                = new ArrayList<>();
        Contexto.add(new Traductor(new Texto("Hola, ¿cómo estás?", "Español", "México")));
        Contexto.add(new Traductor(new Texto("Hello, how are you?", "Inglés", "Estados Unidos")));
        Contexto.add(new Traductor(new Texto("Bonjour, comment ça va?", "Francés", "Francia")));

        Contexto.add(new App(new Texto("Konnichiwa", "Japonés", "Asia")));
        Contexto.add(new App(new Texto("Bom dia", "Portugués", "Sudamérica")));
        Contexto.add(new App(new Texto("Buongiorno", "Italiano", "Europa")));

        Contexto.add(new Interprete(new Texto("Nǐ hǎo", "Mandarín", "Asia")));
        Contexto.add(new Interprete(new Texto("Privet", "Ruso", "Europa del Este")));
        Contexto.add(new Interprete(new Texto("Marhaba", "Árabe", "Medio Oriente")));

        //Se aplica el polimorfismo
        List<String[]> resultados = new ArrayList<>();
        for (ComunicadorTexto comunicador : Contexto) {
            resultados.add(new String[]{
                    comunicador.traductorI(null),
                    comunicador.Adaptador(null),
                    comunicador.interprete(null)
            });
        }
        model.addAttribute("resultados", resultados);
        return "resultado";
    }
}
