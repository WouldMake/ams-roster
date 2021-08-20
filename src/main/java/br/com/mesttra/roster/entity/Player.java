package br.com.mesttra.roster.entity;

import br.com.mesttra.roster.enums.Position;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ApiModelProperty(
            value = "Player name",
            name = "name",
            dataType = "String",
            example = "João Almeida")
    private String name;

    @Enumerated(EnumType.STRING)
    private Position position;

    private Double salary;

    private boolean available;

}
