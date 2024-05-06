package ru.nikdan.springbootdemo.repository;

import org.springframework.stereotype.Repository;
import ru.nikdan.springbootdemo.exception.NotFoundEntityException;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class PasteBoxRepositoryMap implements PasteBoxRepository{

    private final Map<String, PasteBoxEntity> vault = new ConcurrentHashMap<>();
    @Override
    public PasteBoxEntity getByHash(String hash) {
        PasteBoxEntity pasteBoxEntity = vault.get(hash);

        if (pasteBoxEntity == null){
            throw new NotFoundEntityException("PasteBox not found with = " + hash);
        }
        return pasteBoxEntity;
    }

    @Override
    public List<PasteBoxEntity> getListOfPublicAndAlive(int amount) {
        long nowTimestamp = LocalDateTime.now()
                .atZone(ZoneId.systemDefault())
                .toInstant().getEpochSecond();

        return vault.values().stream()
                .filter(PasteBoxEntity::isPublic)
                .filter(pasteBoxEntity -> pasteBoxEntity.getLifeTime().isBefore(now));
    }

    @Override
    public PasteBoxEntity add(PasteBoxEntity pasteBoxEntity) {
        return null;
    }
}
