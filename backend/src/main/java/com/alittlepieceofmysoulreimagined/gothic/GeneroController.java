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
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping
    public ResponseEntity<List<Genero>> listarGeneros(){
        String sql = "SELECT idGenero, nome FROM Genero ORDER BY nome ASC;";
        List<Genero> generos = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Genero.class));
        return ResponseEntity.status(200).body(generos);
    }
}
