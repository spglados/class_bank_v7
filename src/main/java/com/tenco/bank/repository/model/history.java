package com.tenco.bank.repository.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class History {
    private Integer id;
    private Long amount;
    private Long wBalance;
    private Long dBalance;
    private Integer wAccountId;
    private Integer dAccountId;
    private Timestamp createdAt;
    private String receiver;
}