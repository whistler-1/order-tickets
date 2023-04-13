package com.x.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    TicketRepository rep;

    //mottar JSON object fra JS og legger til DB 
    @PostMapping( "/setTicket")
    public void setTicket(@RequestBody Ticket ticket){
        System.out.println(ticket);
        rep.saveTicket(ticket);
    }

    //sender hele listen med Tickets
    @GetMapping("/getAllTickets")
    public List<Ticket> getTickets(){
        List<Ticket> allTickets = rep.getAllTickets();

        try{
            allTickets = rep.getAllTickets();
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(allTickets);

        return allTickets;
    }


    //Sletter alle Tickets i array
    @GetMapping("/deleteTickets")
    public void slettTickets(){
        rep.deleteAllTickets();
        System.out.println("Tickets deleted");
    }

    //Sjekker om arrayen er tom og returnerer boolean
    @GetMapping("/checkTicketsIsEmpty")
    public boolean sjekkTicketsIsEmpty(){
        boolean bool = rep.getAllTickets().isEmpty();
        System.out.println(bool);
        return bool;
    }

}
