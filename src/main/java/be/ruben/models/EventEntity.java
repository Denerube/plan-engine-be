package be.ruben.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity(name = "Event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity extends PanacheEntity {
    private String dateInit;
    private String name;
    private String date;
    private boolean finished;
    private boolean going;
}

