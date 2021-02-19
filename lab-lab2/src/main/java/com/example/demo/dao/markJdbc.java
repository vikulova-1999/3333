package com.example.demo.dao;

import com.example.demo.model.mark;
//import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class markJdbc {
    private final JdbcTemplate jdbcTemplate;
    public markJdbc (JbdcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    public mark get(int id) {
        return jdbcTemplate.queryForObject(sql: "SELECT * FROM mark WHERE id = ?", this::mapMark, id);
    }


    public mark mapMark (ResultSet rs, int i) throws SQLException {
        mark mark = new mark (
                rs.getInt(columnLabel: "id"),
                rs.getString(columnLabel: "name"),
                rs.getString(columnLabel: "value"),
        );
        return mark;
    }
    public mark search(String mark) {
        return jdbcTemplate.queryForObject(sql: "SELECT * FROM mark WHERE name = ?", mark.class, mark);
    }
}
