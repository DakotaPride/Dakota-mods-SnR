package com.railwayteam.railways;

import com.railwayteam.railways.compat.Mods;
import com.railwayteam.railways.compat.tracks.HexCastingTrackCompat;
import com.railwayteam.railways.registry.*;

public class ModSetup {
  public static void register() {
    CRTrackMaterials.register();
    CRBogeyStyles.register();
    CRItems.register();
    CRBlockEntities.register();
    CRBlocks.register();
    CRContainerTypes.register();
    CREntities.register();
    CRSounds.register();
    CRTags.register();
    CREdgePointTypes.register();
    CRSchedule.register();
    CRDataFixers.register();
    CRExtraDisplays.register();
    Mods.HEXCASTING.executeIfInstalled(() -> () -> HexCastingTrackCompat.register());
  }
}

