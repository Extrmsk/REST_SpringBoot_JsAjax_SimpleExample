package com.lemanov;

/**
 * Created by Extr on 15.12.2016.
 */
public class Greeting {
    private final Long id;
    private final String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
