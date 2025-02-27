package de.dafuqs.spectrum.inventories.slots;

import de.dafuqs.spectrum.helpers.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.server.network.*;
import net.minecraft.util.*;

public class PedestalPreviewSlot extends ReadOnlySlot implements SlotWithOnClickAction {
	
	public PedestalPreviewSlot(Inventory inventory, int index, int x, int y) {
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean onClicked(ItemStack heldStack, ClickType type, PlayerEntity player) {
		if (!this.inventory.getStack(0).isEmpty() && player instanceof ServerPlayerEntity serverPlayerEntity) {
			Support.grantAdvancementCriterion(serverPlayerEntity, "craft_using_pedestal_without_redstone", "try_take_out_item_from_pedestal");
		}
		return false;
	}
	
}
