package com.example.task241jwt.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Outcome {
    @SequenceGenerator(name = "outcome_sequence", sequenceName = "outcome_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "outcome_sequence")
    @Id
    private Long id;

    @Column(nullable = false)
    private Long fromCardId;

    @Column(nullable = false)
    private Long toCardId;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Double commissionAmount;

}
