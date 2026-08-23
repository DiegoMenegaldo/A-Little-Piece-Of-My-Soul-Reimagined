package com.alittlepieceofmysoulreimagined.gothic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/bandas")
public class BandaController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public ResponseEntity<List<Banda>> listarBandas(){
        String sql = "SELECT idBanda, nome FROM Banda ORDER BY nome ASC;";
        List<Banda> bandas = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Banda.class));
        return ResponseEntity.status(200).body(bandas);
    }
}
