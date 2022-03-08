package com.example.task241jwt.payload;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class CardDto {

    private String username;
    private Long number;
    private Double balance;
    private Date expired_date;
    private Boolean active;

}
