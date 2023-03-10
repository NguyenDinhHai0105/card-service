package org.acme.service;

import org.acme.entity.Card;
import org.acme.model.CardModel;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

public interface CardService {
    public Optional createCard();
    public Optional updateCard();
    public Optional deleteCard();
    public List<CardModel> getAllCards();
}
