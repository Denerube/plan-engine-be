package be.ruben.services;

import be.ruben.models.EventEntity;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EventService {

    public List<EventEntity> getAll(){
       return EventEntity.listAll();
    }
}
