package org.acme.resource;

import io.smallrye.common.constraint.NotNull;
import org.acme.model.CardModel;
import org.acme.service.CardService;

import javax.inject.Inject;
import javax.transaction.Transactional;
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

    @GET
    @Path("/{id}")
    public Response getCardById(@PathParam("id") Long id) {
        return Response.ok(cardService.getCardById(id)).build();
    }

    @POST
    @Transactional
    public Response addCard(@NotNull CardModel cardModel) {
        return cardService.createCard(cardModel);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteCardById(@PathParam("id") Long id) {
        return cardService.deleteCard(id);
    }

}
