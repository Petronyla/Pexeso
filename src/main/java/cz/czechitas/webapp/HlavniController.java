package cz.czechitas.webapp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    @RequestMapping("/")
    public ModelAndView zobrazIndex() {
        ModelAndView drzakNaDataAJmenoStranky = new ModelAndView("index");
        



        return drzakNaDataAJmenoStranky;
    }

    @RequestMapping("/stul.html")
    public ModelAndView zobrazStul() {
        ModelAndView drzakNaDataAJemnoStrankyProStul = new ModelAndView("stul");

        List<String> seznamObrazku = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 9; j++) {
                seznamObrazku.add("images/0" + j + ".jpg");
            }
        }

        Collections.shuffle(seznamObrazku);



        drzakNaDataAJemnoStrankyProStul.addObject("seznamObrazku", seznamObrazku);

        return drzakNaDataAJemnoStrankyProStul;
    }

    @RequestMapping("/hraci")
    public ModelAndView zobrazHrace() {
        ModelAndView drzakNaDataAJmenoStrankyProHrace = new ModelAndView("hraci");
         List<Hrac> seznamHracu = new ArrayList<>();
         seznamHracu.add(new Hrac("Zdeněk", "Svěrák", "zdenek@sverak.cz", 15, 70));
         seznamHracu.add(new Hrac("Ladislav", "Smoljak", "ladislav@smoljak.cz", 30, 157));
         seznamHracu.add(new Hrac("Miloň", "Čepelka", "milon@cepelka.cz", 16, 34));
         seznamHracu.add(new Hrac("Petr", "Brukner", "petr@brukner.cz", 15, 70));
         seznamHracu.add(new Hrac("Jan", "Kašpar", "jan@kaspar.cz", 1, 55));
         seznamHracu.add(new Hrac("Jan", "Hraběta", "jan@hrabeta.cz", 37, 495));

         
         drzakNaDataAJmenoStrankyProHrace.addObject("prebornik", seznamHracu);
         
        return drzakNaDataAJmenoStrankyProHrace;
    }

}
