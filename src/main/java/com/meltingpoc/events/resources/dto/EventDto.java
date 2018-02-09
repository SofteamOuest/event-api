package com.meltingpoc.events.resources.dto;

public class EventDto {

    private final int id;

    private final String title;

    private final String composer;

    private final String status;

    private final String url;

    public EventDto(int id, String title, String composer, String status, String url) {
        this.id = id;
        this.title = title;
        this.composer = composer;
        this.status = status;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public String getStatus() {
        return status;
    }

    public String getUrl() {
        return url;
    }

    public int getId() {
        return id;
    }
}
