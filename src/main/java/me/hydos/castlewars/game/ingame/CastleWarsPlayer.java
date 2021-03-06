package me.hydos.castlewars.game.ingame;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.GameMode;
import xyz.nucleoid.plasmid.game.player.GameTeam;
import xyz.nucleoid.plasmid.util.PlayerRef;

public class CastleWarsPlayer {

    public final GameTeam team;
    private final ServerPlayerEntity player;
    public boolean eliminated;

    public CastleWarsPlayer(GameTeam team, ServerPlayerEntity playerEntity) {
        this.player = playerEntity;
        this.team = team;
    }

    public ServerPlayerEntity player() {
        return player;
    }

    public boolean isOnline() {
        return player != null;
    }

    public PlayerRef playerRef() {
        return PlayerRef.of(player);
    }

    public void gamemode(GameMode gamemode) {
        player.setGameMode(gamemode);
    }
}
