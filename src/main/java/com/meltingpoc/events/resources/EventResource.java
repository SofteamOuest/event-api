package com.meltingpoc.events.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@RestController("/events")
@CrossOrigin(origins = "*")
public class EventResource {

    @GetMapping
    public Collection<EventDto> events() {

        return Arrays.asList(new EventDto(1));
    }
}
