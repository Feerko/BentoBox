package us.tastybento.bskyblock.api.flags;

import java.util.Optional;

import org.bukkit.event.Listener;

import us.tastybento.bskyblock.BSkyBlock;
import us.tastybento.bskyblock.api.panels.PanelItem;
import us.tastybento.bskyblock.managers.FlagsManager;

public class Flag {

    private String id;
    private PanelItem icon;
    private Listener listener;

    public Flag(String id, PanelItem icon, Listener listener) {
        this.id = id;
        this.icon = icon;
        this.listener = listener;
        BSkyBlock.getInstance().getFlagsManager().registerFlag(this);
    }

    public String getID() {
        return id;
    }

    public PanelItem getIcon() {
        return icon;
    }

    public Optional<Listener> getListener() {
        return Optional.of(listener);
    }
}
