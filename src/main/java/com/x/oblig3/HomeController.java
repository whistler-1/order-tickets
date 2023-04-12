package com.x.oblig3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    public final List<Billett> billetter = new ArrayList<>();

    //mottar JSON object fra JS og legger til array som billett objekt
    @PostMapping( "/setBillett")
    public void setBillett(@RequestBody Billett billett){
        System.out.println(billett);
        billetter.add(billett);
    }

    //sender hele arrayen med billetter
    @GetMapping("/getAllBilletter")
    public List<Billett> getBilletter(){
        System.out.println("BillettListe: \n"+billetter);
        return billetter;
    }

    //Sletter alle billetter i array
    @GetMapping("/slettBilletter")
    public void slettBilletter(){
        billetter.clear();
        System.out.println("Billetter slettet");
    }

    //Sjekker om arrayen er tom og returnerer boolean
    @GetMapping("/sjekkBilletterIsEmpty")
    public boolean sjekkBilletterIsEmpty(){
        System.out.println("array empty: " + billetter.isEmpty());
        return billetter.isEmpty();
    }
}
