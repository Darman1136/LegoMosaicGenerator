package de.d.f.mosaic.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import de.d.f.mosaic.color.LegoColor;

public final class BrickLinkUtils {

	private BrickLinkUtils() {
		//
	}

	/**
	 * <INVENTORY> <ITEM> <ITEMTYPE>P</ITEMTYPE> <ITEMID>3024</ITEMID>
	 * <COLOR>4</COLOR> </ITEM> </INVENTORY>
	 */
	public static void printBrickLinkImport(final int brickType, final Map<LegoColor, Integer> brickUsage) {
		// some lego colors have the same brick link color id, same color ids need to be
		// merged in order to avoid an error on wanted list import
		Map<Integer, Integer> idToAmount = new HashMap<>();
		for (Entry<LegoColor, Integer> entry : brickUsage.entrySet()) {
			LegoColor brick = entry.getKey();
			int blId = brick.getBlId();
			if (!idToAmount.containsKey(blId)) {
				idToAmount.put(blId, entry.getValue());
			} else {
				idToAmount.put(blId, idToAmount.get(blId) + entry.getValue());
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<INVENTORY>");
		for (Entry<Integer, Integer> entry : idToAmount.entrySet()) {
			addItem(sb, brickType, entry.getKey(), entry.getValue());
		}
		sb.append("</INVENTORY>");
		System.out.println(sb.toString());
	}

	private static void addItem(final StringBuilder sb, final int brickType, final int colorId, final int amount) {
		sb.append("<ITEM>");
		sb.append("<ITEMTYPE>P</ITEMTYPE>");
		sb.append("<ITEMID>" + brickType + "</ITEMID>");
		sb.append("<COLOR>" + colorId + "</COLOR>");
		sb.append("<MINQTY>" + amount + "</MINQTY>");
		sb.append("</ITEM>");
	}
}
