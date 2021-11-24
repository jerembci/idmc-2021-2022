package fr.unilorraine.idmc.gamescatalog.mappers;

import fr.unilorraine.idmc.gamescatalog.dto.GameView;
import fr.unilorraine.idmc.gamescatalog.dto.NewPublisher;
import fr.unilorraine.idmc.gamescatalog.dto.PublisherView;
import fr.unilorraine.idmc.gamescatalog.entities.Game;
import fr.unilorraine.idmc.gamescatalog.entities.Publisher;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PublisherMapper {

    default List<PublisherView> toDto(Page<Publisher> page) {
        return page
                .map(this::toDto)
                .getContent();
    }

    PublisherView toDto(Publisher p);

    default List<PublisherView> toDto(Iterable<Publisher> publishers) {
        var result = new ArrayList<PublisherView>();
        publishers.forEach(publisher -> result.add(toDto(publisher)));

        return result;
    }

    Publisher toEntity(NewPublisher dto);
}
