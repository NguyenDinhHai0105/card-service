package org.acme.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CardModel {
    private Long id;
    private Long customer_id;

}
