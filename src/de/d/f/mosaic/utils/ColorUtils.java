package de.d.f.mosaic.utils;

import org.opencv.core.Scalar;

import de.d.f.mosaic.color.LegoColor;

public final class ColorUtils {

	private ColorUtils() {
		//
	}

	public static LegoColor getClostestToScalar(final Scalar scalar) {
		double minDistance = Double.MAX_VALUE;
		LegoColor rc = LegoColorConstants.UNKNOWN;
		for (LegoColor legoColor : LegoColorConstants.ALL_LEGO_COLORS_WITH_BL) {
			Scalar legoScalars = legoColor.getColor();
			double dist = absDistanceBetweenScalars(legoScalars, scalar);
			if (dist < minDistance) {
				minDistance = dist;
				rc = legoColor;
			}
		}
		return rc;
	}

	private static double absDistanceBetweenScalars(final Scalar s1, final Scalar s2) {
		return Math.sqrt(Math.pow(s2.val[0] - s1.val[0], 2) + Math.pow(s2.val[1] - s1.val[1], 2)
				+ Math.pow(s2.val[2] - s1.val[2], 2));
	}

	public static Scalar transformColorHexToScalar(final String colorHex) {
		if (colorHex.length() != 6) {
			throw new IllegalArgumentException("Color hex needs to have a length of 6");
		}
		int red = Integer.parseInt(colorHex.substring(0, 2), 16);
		int green = Integer.parseInt(colorHex.substring(2, 4), 16);
		int blue = Integer.parseInt(colorHex.substring(4, 6), 16);
		// opencv uses bgr by default
		return new Scalar(blue, green, red);
	}
}
