package com.x.oblig3;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository {
    @Autowired
    private JdbcTemplate db;
    public void saveTicket(Ticket Ticket) {
        String sql = "INSERT INTO Ticket (film, antall, fornavn, etternavn, telefonNr, epost) VALUES(?,?,?,?,?,?,?)";
        db.update(sql, Ticket.getFilm(), Ticket.getAntall(), Ticket.getFornavn(), Ticket.getEtternavn(), Ticket.getTelefonNr(),Ticket.getEpost());
    }
    public List<Ticket> getAllTickets() {
        String sql = "SELECT * FROM Ticket";
        List<Ticket> allTickets = db.query(sql, new
                BeanPropertyRowMapper(Ticket.class));
        return allTickets;
    }

    public void deleteAllTickets(){
        String sql = "DELETE from Billett";
        db.update(sql);
    }
}
