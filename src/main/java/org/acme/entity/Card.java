package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.acme.model.CardModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card extends PanacheEntityBase {

    @Id
    private Long id;
    private Long customer_id;
    private String card_name;
    private String description;

}
