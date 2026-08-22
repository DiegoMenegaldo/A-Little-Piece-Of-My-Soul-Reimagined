package com.alittlepieceofmysoulreimagined.gothic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping
    public ResponseEntity<Void> cadastrarUsuario(@RequestBody Usuario usuario){
        String sql = """
                INSERT INTO Cadastro (nomeCompleto, email, generoFavorito, bandaFavorita, senha) VALUES 
                (?,?,?,?,?);""";

        jdbcTemplate.update(
            sql,
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getGeneroFavorito(),
                usuario.getBandaFavorita(),
                usuario.getSenha()
        );
        return ResponseEntity.status(201).build();
    }
}