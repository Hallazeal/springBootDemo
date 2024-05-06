package ru.nikdan.springbootdemo.service;

import ru.nikdan.springbootdemo.api.request.PasteBoxRequest;
import ru.nikdan.springbootdemo.api.response.PasteBoxResponse;
import ru.nikdan.springbootdemo.api.response.PasteBoxUrlResponse;

import java.util.List;

public class PasteBoxServiceImpl implements PasteBoxService {
    @Override
    public PasteBoxResponse getByHash(String hash) {
        return null;
    }

    @Override
    public List<PasteBoxResponse> getFirstPublicPasteBoxes(int amount) {
        return null;
    }

    @Override
    public PasteBoxUrlResponse create(PasteBoxRequest request) {
        return null;
    }
}
