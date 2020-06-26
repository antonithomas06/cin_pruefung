package org.example;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;


import java.util.List;

@Configuration
public class DBInitializer {
    private final CarRepo carRepo;

    public DBInitializer(CarRepo carRepo){ this.carRepo = carRepo;}

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationEvent() {
        carRepo.saveAll(
                List.of(
                        new Car("Ford", "McQueen", 1990),
                        new Car("Fiat Mulitpla", "Horst", 2001)
                )
        );
    }
}
