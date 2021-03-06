package me.juancarloscp52.bedrockify.client.features.HeldItemTooltips.Tooltip;

import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;

public class ShulkerBoxTooltip extends Tooltip {


    public ShulkerBoxTooltip(ItemStack item){
        this.translationKey = item.getTranslationKey();
        this.primaryValue = item.getCount();
    }

    @Override
    public TranslatableText getTooltipText() {
        TranslatableText tooltip = new TranslatableText(translationKey);
        tooltip.append(" x").append(String.valueOf(primaryValue));
        return tooltip;
    }
}
