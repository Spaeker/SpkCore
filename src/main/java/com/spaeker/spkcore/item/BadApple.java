package com.spaeker.spkcore.item;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.util.UtilKeyboard;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class BadApple extends Item {

    public BadApple(){
        super(new Properties().tab(SpkCore.SPK_TAB)
        .food(new Food.Builder()
                .nutrition(5)
                .saturationMod(1.5f)
                .effect(() -> new EffectInstance(Effects.WITHER, 1000, 3),1f)
                .build()));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip,
                               ITooltipFlag flag){

        if(UtilKeyboard.isHoldingShift()){
            tooltip.add(new StringTextComponent("Ever On and On I Continue"));
        }
    }


}
