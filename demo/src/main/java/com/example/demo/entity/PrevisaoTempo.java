package com.example.demo.entity;

import lombok.*;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.MonthDay;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "previsaoTempo")
public class PrevisaoTempo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dia;

    @Column
    private String cidade;

    @Column
    private String pais;

    @Column
    private Integer temperaturaMaxima;

    @Column
    private Integer temperaturaMinima;

    @Column
    private Integer sensacaoTermica;

}
