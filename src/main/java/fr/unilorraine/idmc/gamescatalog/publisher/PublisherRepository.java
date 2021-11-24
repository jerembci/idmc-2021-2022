package fr.unilorraine.idmc.gamescatalog.publisher;

import fr.unilorraine.idmc.gamescatalog.publisher.data.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
