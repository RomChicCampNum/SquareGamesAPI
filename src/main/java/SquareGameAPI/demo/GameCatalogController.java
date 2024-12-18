package SquareGameAPI.demo;
import fr.le_campus_numerique.square_games.engine.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
public class GameCatalogController {
    @Autowired
    private GameCatalog gameCatalog;

    @GetMapping("/games")
    public Collection<String> getAvailableGames() {
        return gameCatalog.getGameIdentifiers();
    }
}
