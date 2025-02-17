package dev.latvian.mods.kubejs.item.forge;

import dev.latvian.mods.kubejs.entity.EntityJS;
import dev.latvian.mods.kubejs.item.ItemStackJS;
import dev.latvian.mods.kubejs.player.PlayerEventJS;
import net.minecraft.world.InteractionHand;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;

import javax.annotation.Nullable;

public class ItemDestroyedEventJS extends PlayerEventJS {
	private final PlayerDestroyItemEvent event;

	public ItemDestroyedEventJS(PlayerDestroyItemEvent e) {
		event = e;
	}

	@Override
	public boolean canCancel() {
		return true;
	}

	@Override
	public EntityJS getEntity() {
		return entityOf(event.getEntity());
	}

	@Nullable
	public InteractionHand getHand() {
		return event.getHand();
	}

	public ItemStackJS getItem() {
		return ItemStackJS.of(event.getOriginal());
	}
}