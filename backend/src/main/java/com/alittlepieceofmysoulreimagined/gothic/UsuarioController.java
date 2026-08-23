package com.alittlepieceofmysoulreimagined.gothic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping
    public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario){
        if(usuario.getNome() == null || usuario.getNome().isBlank()){
            return ResponseEntity.status(400).body("Nome inválido.");
        }
        if(usuario.getEmail() == null || usuario.getEmail().isBlank()){
            return ResponseEntity.status(400).body("Email inválido.");
        }
        if(usuario.getSenha() == null || usuario.getSenha().isBlank()){
            return ResponseEntity.status(400).body("Senha inválida.");
        }
        if(usuario.getGeneroFavorito() == null || usuario.getGeneroFavorito().isBlank()){
            return ResponseEntity.status(400).body("Gênero gótico favorito inválido.");
        }
        if(usuario.getBandaFavorita() == null || usuario.getBandaFavorita().isBlank()){
            return ResponseEntity.status(400).body("Banda gótica favorita inválida.");
        }
        if(usuario.getDtNascimento() == null){
            return ResponseEntity.status(400).body("Data de nascimento inválida.");
        }
        if(usuario.getDtNascimento().isAfter(LocalDate.now())){
            return ResponseEntity.status(400).body("Data de nascimento não pode ser no futuro");
        }

        String sql = """
                INSERT INTO Cadastro (nomeCompleto, email, dtNascimento, generoFavorito, bandaFavorita, senha) VALUES 
                (?,?,?,?,?,?);""";

        jdbcTemplate.update(
            sql,
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getDtNascimento(),
                usuario.getGeneroFavorito(),
                usuario.getBandaFavorita(),
                usuario.getSenha()
        );
        return ResponseEntity.status(201).build();
    }
}