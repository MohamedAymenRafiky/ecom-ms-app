package net.rafiky.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.yaml.snakeyaml.events.Event;

@Entity
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
