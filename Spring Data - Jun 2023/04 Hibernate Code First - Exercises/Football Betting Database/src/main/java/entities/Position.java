package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Position{

    @Id
    @Column(length = 2)
    private String id;                         //      (2 letters – GK, DF, MF, FW…)

    @Column
    private String description;        //       (for example – goal keeper, defender…);
}
