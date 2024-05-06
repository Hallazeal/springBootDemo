package ru.nikdan.springbootdemo.api.response;

import lombok.Data;
import ru.nikdan.springbootdemo.api.request.PublicStatus;

@Data
public class PasteBoxResponse {
    private String data;
    private PublicStatus status;
}
