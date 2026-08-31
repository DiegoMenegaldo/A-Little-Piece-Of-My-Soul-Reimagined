package com.alittlepieceofmysoulreimagined.gothic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.*;

import java.sql.PreparedStatement;

@CrossOrigin
@RestController
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/inserirPerguntas")
    public ResponseEntity<Quiz> inserirPerguntas(@RequestBody Quiz quiz){
        if (quiz == null) {
            return ResponseEntity.status(400).build();
        }

        if (quiz == null ||
            quiz.getP1() == null || quiz.getP1().isBlank() ||
            quiz.getP2() == null || quiz.getP2().isBlank() ||
            quiz.getP3() == null || quiz.getP3().isBlank() ||
            quiz.getP4() == null || quiz.getP4().isBlank() ||
            quiz.getP5() == null || quiz.getP5().isBlank() ||
            quiz.getP6() == null || quiz.getP6().isBlank() ||
            quiz.getP7() == null || quiz.getP7().isBlank()) {
            return ResponseEntity.status(400).build();
        }

        String sql = "INSERT INTO Quiz (p1, p2, p3, p4, p5, p6, p7) VALUES (?,?,?,?,?,?,?);";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection ->{
            PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, quiz.getP1());
            ps.setString(2, quiz.getP2());
            ps.setString(3, quiz.getP3());
            ps.setString(4, quiz.getP4());
            ps.setString(5, quiz.getP5());
            ps.setString(6, quiz.getP6());
            ps.setString(7, quiz.getP7());
            return ps;
        },keyHolder);
        Integer idQuiz = keyHolder.getKeyAs(Integer.class);
        quiz.setIdQuiz(idQuiz);
        return ResponseEntity.status(201).body(quiz);
    }
}
