package com.rifledluffy.chairs.managers.plotsquared;

import org.jetbrains.annotations.NotNull;

import com.plotsquared.core.configuration.Captions;
import com.plotsquared.core.plot.flag.types.BooleanFlag;

public class SeatingFlag extends BooleanFlag<SeatingFlag>{

	public SeatingFlag(boolean value) {
		super(value, Captions.FLAG_CATEGORY_BOOLEAN);
	}

	@Override
	protected SeatingFlag flagOf(@NotNull Boolean value) {
		return new SeatingFlag(value);
	}
	

}
