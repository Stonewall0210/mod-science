package malek.mod_science.screens;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class TranfusionMatrixScreen extends CottonInventoryScreen<TranfusionMatrixGuiDescription> {
    public TranfusionMatrixScreen(TranfusionMatrixGuiDescription description, PlayerEntity player, Text title) {
        super(description, player, title);
    }
}
