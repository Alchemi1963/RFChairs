package com.rifledluffy.chairs.managers.plotsquared;

import com.plotsquared.core.api.PlotAPI;
import com.plotsquared.core.location.Location;
import com.plotsquared.core.plot.flag.GlobalFlagContainer;
import com.rifledluffy.chairs.chairs.Chair;

public class PlotSquaredManager {

    private PlotAPI api;

    public PlotSquaredManager() {}

    public void setup() {
    	api = new PlotAPI();
        GlobalFlagContainer.getInstance().addFlag(new SeatingFlag(true));
    }

    public boolean canSit(Chair chair) {
        org.bukkit.Location location = chair.getLocation();
        Location loc = new Location(location.getWorld().getName(), location.getBlockX(), location.getBlockY(), location.getBlockZ());

        return api.getAllPlots().stream()
                .filter(plot -> plot.getArea().contains(loc))
                .noneMatch(plot -> plot.getFlag(SeatingFlag.class));
    }

}
