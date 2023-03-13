package org.acme.service;

import org.acme.entity.Card;
import org.acme.model.CardModel;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

public interface CardService {
    public Response createCard(CardModel cardModel);
    public Response updateCard(CardModel cardModel);
    public Response deleteCard(Long id);
    public List<CardModel> getAllCards();
    public CardModel getCardById(Long id);
}
