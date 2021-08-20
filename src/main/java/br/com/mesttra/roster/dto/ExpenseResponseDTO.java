package br.com.mesttra.roster.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseResponseDTO {

    private Long id;
    private String type;
    private Double amount;
    private LocalDate dueDate;

}
