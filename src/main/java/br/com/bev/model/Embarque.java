package br.com.bev.model;

import br.com.bev.repository.TuristaRepository;
import br.com.bev.repository.ViagemRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

/**
 * Tabela associativa de Turista e Viagem
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Embarque {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMBARQUE_GEN_ID")
    @SequenceGenerator(name = "EMBARQUE_GEN_ID", sequenceName = "EMBARQUE_ID_SEQ")
    private Long id;
    private Long turista;
    private Long viagem;

    public Embarque(Long turistaID, Long viagemID) {
        this.turista = turistaID;
        this.viagem = viagemID;
    }
}
