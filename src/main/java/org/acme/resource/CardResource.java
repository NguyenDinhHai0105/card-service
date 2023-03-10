package org.acme.resource;

import org.acme.entity.Card;
import org.acme.model.CardModel;
import org.acme.service.CardService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("cards")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CardResource {

    @Inject
    CardService cardService;

    @GET
    public List<CardModel> getAllCards() {
        return cardService.getAllCards();
    }

}
