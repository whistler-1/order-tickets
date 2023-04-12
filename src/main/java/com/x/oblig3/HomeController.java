package com.x.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    TicketRepository rep;

    //mottar JSON object fra JS og legger til DB 
    @PostMapping( "/setTicket")
    public void setTicket(@RequestBody Ticket ticket){
        rep.saveTicket(ticket);
    }

    //sender hele arrayen med Tickets
    @GetMapping("/getAllTickets")
    public List<Ticket> getTickets(){
        return rep.getAllTickets();
    }

    //Sletter alle Tickets i array
    @GetMapping("/slettTickets")
    public void slettTickets(){
        rep.deleteAllTickets();
        System.out.println("Tickets slettet");
    }

    /*Sjekker om arrayen er tom og returnerer boolean
    @GetMapping("/sjekkTicketsIsEmpty")
    public boolean sjekkTicketsIsEmpty(){
        System.out.println("array empty: " + Tickets.isEmpty());
        return Tickets.isEmpty();
    }

     */
}
