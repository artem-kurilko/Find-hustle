package com.findyourhustle.chat.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {

    private String from;

    private String message;

    @Override
    public String toString() {
        return "Message [from=" + from + ", message=" + message + "]";
    }

}
