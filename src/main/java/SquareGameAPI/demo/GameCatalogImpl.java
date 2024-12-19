package SquareGameAPI.demo;

import fr.le_campus_numerique.square_games.engine.connectfour.ConnectFourGameFactory;
import fr.le_campus_numerique.square_games.engine.taquin.TaquinGameFactory;
import fr.le_campus_numerique.square_games.engine.tictactoe.TicTacToeGame;
import fr.le_campus_numerique.square_games.engine.tictactoe.TicTacToeGameFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class GameCatalogImpl implements GameCatalog {

    private final TicTacToeGameFactory ticTacToeGameFactory;
    private final ConnectFourGameFactory connectFourGameFactory;
    private final TaquinGameFactory taquinGameFactory;

    public GameCatalogImpl() {
        this.ticTacToeGameFactory = new TicTacToeGameFactory();
        this.connectFourGameFactory = new ConnectFourGameFactory();
        this.taquinGameFactory = new TaquinGameFactory();
    }

    @Override
    public Collection<String> getGameIdentifiers () {
        return List.of(ticTacToeGameFactory.getGameFactoryId(), connectFourGameFactory.getGameFactoryId(), taquinGameFactory.getGameFactoryId());
    }
}
