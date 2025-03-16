package be.ruben.resources;

import be.ruben.models.EventEntity;
import be.ruben.services.EventService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/events")
public class EventResource {

    @Inject
    EventService eventService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EventEntity> listAll() {
        return eventService.getAll();
    }

}
