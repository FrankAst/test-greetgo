package com.greetgo.entities;

import java.io.Serializable;

/**
 * Created by frankast on 5/20/17.
 */
public class Word implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String text;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return getId() + ":" + getText();
    }
}
