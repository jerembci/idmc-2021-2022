package fr.unilorraine.idmc.gamescatalog.game;

import fr.unilorraine.idmc.gamescatalog.game.data.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends CrudRepository<Game, Long> {
}
