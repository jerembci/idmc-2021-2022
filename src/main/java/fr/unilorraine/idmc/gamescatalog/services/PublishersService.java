package fr.unilorraine.idmc.gamescatalog.services;

import fr.unilorraine.idmc.gamescatalog.dto.NewPublisher;
import fr.unilorraine.idmc.gamescatalog.dto.PublisherView;
import fr.unilorraine.idmc.gamescatalog.mappers.PublisherMapper;
import fr.unilorraine.idmc.gamescatalog.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PublishersService {

    private final PublisherMapper mapper;

    private final PublisherRepository repo;

    public PublisherView create(NewPublisher newPublisher) {
        var p = mapper.toEntity(newPublisher);
        p = repo.save(p);
        return mapper.toDto(p);
    }

    public List<PublisherView> findAll() {
        return mapper.toDto(repo.findAll());
    }
}
