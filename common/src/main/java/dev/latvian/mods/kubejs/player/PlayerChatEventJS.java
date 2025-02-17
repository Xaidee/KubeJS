package dev.latvian.mods.kubejs.player;

import dev.latvian.mods.kubejs.entity.EntityJS;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

/**
 * @author LatvianModder
 */
public class PlayerChatEventJS extends PlayerEventJS {
	private final ServerPlayer player;
	private final String message;
	public Component component;

	public PlayerChatEventJS(ServerPlayer player, String message, Component component) {
		this.player = player;
		this.message = message;
		this.component = component;
	}

	@Override
	public boolean canCancel() {
		return true;
	}

	@Override
	public EntityJS getEntity() {
		return entityOf(player);
	}

	public String getUsername() {
		return player.getGameProfile().getName();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(Component text) {
		component = text;
	}
}