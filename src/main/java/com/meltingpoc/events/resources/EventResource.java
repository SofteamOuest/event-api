package com.meltingpoc.events.resources;

import com.meltingpoc.events.resources.dto.EventDto;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

@RestController("/events")
@CrossOrigin(origins = "*")
public class EventResource {

    @GetMapping
    public Collection<EventDto> events() {

           /* {
        "id": 3,
            "title": "",
            "composer": "",
            "status": "canceled",
            "url": "http://"
    }*/

        return Arrays.asList(new EventDto(1, "12@13 Green IT et Eco-conception des logiciels",
                "Ashoka Tano", "canceled", "http://"));
    }
}
