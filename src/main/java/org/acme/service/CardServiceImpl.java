package org.acme.service;

import org.acme.entity.Card;
import org.acme.model.CardModel;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class CardServiceImpl implements CardService {

    @Override
    public Response createCard(CardModel cardModel) {
        if (cardModel == null || cardModel.getId() == null)
            throw new WebApplicationException("Input can not null");
        Card card = new Card(cardModel.getId(), cardModel.getCustomer_id());
        card.persist();
        return Response.ok(card).status(200).build();
    }

    @Override
    public Optional updateCard() {
        return null;
    }

    @Override
    public Response deleteCard(Long id) {
        Card.deleteById(id);
        return Response.ok().build();
    }

    @Override
    public List<CardModel> getAllCards() {
        List<Card> cardList = Card.findAll().list();
        return cardList.stream().map(cm -> {
            return new CardModel(cm.getId(), cm.getCustomer_id());
        }).collect(Collectors.toList());
    }

    @Override
    public CardModel getCardById(Long id) {
        Card card = Card.findById(id);
        CardModel cardModel = new CardModel();
        return cardModel.convertCardToCardModel(card);
    }
}
