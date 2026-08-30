package com.alittlepieceofmysoulreimagined.gothic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        if(usuario.getFkGenero() == null || usuario.getFkGenero() == 0){
            return ResponseEntity.status(400).body("Gênero gótico inválid0.");
        }
        if(usuario.getFkBanda() == null || usuario.getFkBanda() == 0){
            return ResponseEntity.status(400).body("Banda gótica favorita inválida.");
        }
        if(usuario.getDtNascimento() == null){
            return ResponseEntity.status(400).body("Data de nascimento inválida.");
        }
        if(usuario.getDtNascimento().isAfter(LocalDate.now())){
            return ResponseEntity.status(400).body("Data de nascimento não pode ser no futuro");
        }

        String sql = """
                INSERT INTO Cadastro (nomeCompleto, fkGenero, fkBanda, email, dtNascimento, senha) VALUES 
                (?,?,?,?,?,?);""";

        jdbcTemplate.update(
            sql,
                usuario.getNome(),
                usuario.getFkGenero(),
                usuario.getFkBanda(),
                usuario.getEmail(),
                usuario.getDtNascimento(),
                usuario.getSenha()
        );
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/autenticar")
    public ResponseEntity<?> autenticarUsuario(@RequestBody Usuario usuario){
        String sql = """
                SELECT idCadastro AS id,
                fkGenero, 
                fkBanda, 
                nomeCompleto AS nome,
                email, 
                dtNascimento
                FROM Cadastro 
                WHERE email = ? AND senha = ?;
                """;

        try{
            Usuario usuarioAutenticado = jdbcTemplate.queryForObject(
                    sql,
                    new BeanPropertyRowMapper<>(Usuario.class),
                    usuario.getEmail(),
                    usuario.getSenha());
                return ResponseEntity.status(200).body(usuarioAutenticado);
        } catch(Exception e){
            return ResponseEntity.status(404).body("Email ou senha inválidos.");
        }


    }
}