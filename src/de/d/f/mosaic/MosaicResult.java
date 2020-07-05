package de.d.f.mosaic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.opencv.core.Mat;

import de.d.f.mosaic.color.LegoColor;

public class MosaicResult {

	private Mat result;
	private Map<LegoColor, Integer> brickUsage = new HashMap<>();

	public void setResult(final Mat result) {
		this.result = result;
	}

	public Mat getResult() {
		return result;
	}

	public void addBrick(final LegoColor brick) {
		if (!brickUsage.containsKey(brick)) {
			brickUsage.put(brick, 0);
		}
		brickUsage.put(brick, brickUsage.get(brick) + 1);
	}

	public Map<LegoColor, Integer> getBrickUsage() {
		return brickUsage;
	}

	public void print() {
		StringBuilder sb = new StringBuilder("Brick usage:\n");
		for (Entry<LegoColor, Integer> entry : brickUsage.entrySet()) {
			LegoColor legoColor = entry.getKey();
			sb.append("Name: " + legoColor.getBlName() + " Amount: " + entry.getValue() + "\n");
		}
		System.out.println(sb.toString());
	}
}
