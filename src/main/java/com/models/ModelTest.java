package com.models;

/**
 * Created by iuriandreazza on 02/04/17.
 */
public class ModelTest {

    private final long id;
    private final String content;

    public ModelTest(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
