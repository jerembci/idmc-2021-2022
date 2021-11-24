package fr.unilorraine.idmc.gamescatalog.publisher;

import fr.unilorraine.idmc.gamescatalog.publisher.data.NewPublisher;
import fr.unilorraine.idmc.gamescatalog.publisher.data.PublisherView;
import fr.unilorraine.idmc.gamescatalog.publisher.data.Publisher;
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
