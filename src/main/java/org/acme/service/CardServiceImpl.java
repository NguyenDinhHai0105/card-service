package org.acme.service;

import org.acme.entity.Card;
import org.acme.model.CardModel;
import org.acme.repository.CardRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class CardServiceImpl implements CardService {

    @Override
    public Optional createCard() {
        return null;
    }

    @Override
    public Optional updateCard() {
        return null;
    }

    @Override
    public Optional deleteCard() {
        return null;
    }

    @Override
    public List<CardModel> getAllCards() {
        List<Card> cardList = Card.findAll().list();
        return cardList.stream().map(cm -> {
            return new CardModel(cm.getId(), cm.getCustomer_id());
        }).collect(Collectors.toList());
    }
}
