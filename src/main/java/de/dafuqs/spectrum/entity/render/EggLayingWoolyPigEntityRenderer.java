package de.dafuqs.spectrum.entity.render;

import de.dafuqs.spectrum.*;
import de.dafuqs.spectrum.entity.entity.*;
import de.dafuqs.spectrum.entity.models.*;
import de.dafuqs.spectrum.registries.client.*;
import net.fabricmc.api.*;
import net.minecraft.client.render.entity.*;
import net.minecraft.util.*;

@Environment(EnvType.CLIENT)
public class EggLayingWoolyPigEntityRenderer extends MobEntityRenderer<EggLayingWoolyPigEntity, EggLayingWoolyPigEntityModel> {
	
	public static final Identifier TEXTURE = SpectrumCommon.locate("textures/entity/egg_laying_wooly_pig.png");
	
	public EggLayingWoolyPigEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new EggLayingWoolyPigEntityModel(context.getPart(SpectrumModelLayers.WOOLY_PIG)), 0.6F);
		this.addFeature(new EggLayingWoolyPigWoolFeatureRenderer(this, context.getModelLoader()));
	}
	
	@Override
	public Identifier getTexture(EggLayingWoolyPigEntity entity) {
		return TEXTURE;
	}
	
}