package ru.nikdan.springbootdemo.service;

import ru.nikdan.springbootdemo.api.request.PasteBoxRequest;
import ru.nikdan.springbootdemo.api.response.PasteBoxResponse;
import ru.nikdan.springbootdemo.api.response.PasteBoxUrlResponse;

import java.util.List;

public interface PasteBoxService {
    PasteBoxResponse getByHash(String hash);
    List<PasteBoxResponse> getFirstPublicPasteBoxes(int amount);
    PasteBoxUrlResponse create(PasteBoxRequest request);
}
