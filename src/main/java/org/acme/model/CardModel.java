package org.acme.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.acme.entity.Card;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardModel {
    private Long id;
    private Long customer_id;

    public CardModel convertCardToCardModel(Card card) {
        return new CardModel(card.getId(), card.getCustomer_id());
    }

}
