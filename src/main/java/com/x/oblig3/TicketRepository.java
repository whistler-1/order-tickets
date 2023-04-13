package com.x.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository {
    @Autowired
    private JdbcTemplate db;
    public void saveTicket(Ticket Ticket) {
        String sql = "INSERT INTO TICKET (film, antall, fornavn, etternavn, telefonNr, epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, Ticket.getFilm(), Ticket.getAntall(), Ticket.getFornavn(), Ticket.getEtternavn(), Ticket.getTelefonNr(),Ticket.getEpost());
    }

    public List<Ticket> getAllTickets() {
        String sql = "SELECT * FROM TICKET";

        return db.query(sql,new BeanPropertyRowMapper(Ticket.class));
    }

    public void deleteAllTickets(){
        String sql = "DELETE from TICKET";
        db.update(sql);
    }


}
