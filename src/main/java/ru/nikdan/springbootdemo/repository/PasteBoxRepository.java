package ru.nikdan.springbootdemo.repository;

import java.util.List;

public interface PasteBoxRepository {
    PasteBoxEntity getByHash(String hash);

    List<PasteBoxEntity> getListOfPublicAndAlive(int amount);

    PasteBoxEntity add(PasteBoxEntity pasteBoxEntity);
}
