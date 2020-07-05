package de.d.f.mosaic.color;

import org.opencv.core.Scalar;

public class LegoColor {

	private int legoId;
	private String legoName;
	private int blId;
	private String blName;
	private Scalar color;
	private boolean transparent;
	private boolean glow;

	public LegoColor(final int legoId, final String legoName, final int blId, final String blName, final Scalar color,
			final boolean transparent, final boolean glow) {
		this.legoId = legoId;
		this.legoName = legoName;
		this.blId = blId;
		this.blName = blName;
		this.color = color;
		this.transparent = transparent;
		this.glow = glow;
	}

	public int getLegoId() {
		return legoId;
	}

	public String getLegoName() {
		return legoName;
	}

	public int getBlId() {
		return blId;
	}

	public String getBlName() {
		return blName;
	}

	public Scalar getColor() {
		return color;
	}

	public boolean isTransparent() {
		return transparent;
	}

	public boolean isGlow() {
		return glow;
	}

	@Override
	public String toString() {
		return "LegoColor [legoId=" + legoId + ", legoName=" + legoName + ", blId=" + blId + ", blName=" + blName
				+ ", color=" + color + ", transparent=" + transparent + ", glow=" + glow + "]";
	}

}
