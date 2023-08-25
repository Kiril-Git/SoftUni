package entities;

import entities.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class BankAccount extends BaseEntity {

    @Column(name = "bank_name", length = 50)
    private String bank_name;

    @Column(name = "SWIFT_code", length = 50)
    private String swiftCode;
}
