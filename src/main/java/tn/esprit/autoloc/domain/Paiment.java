package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_paiment;
    BigDecimal montant;
    LocalDate date_paiment;
    @Enumerated(EnumType.STRING)
    ModePaiment modePaiment;
}
