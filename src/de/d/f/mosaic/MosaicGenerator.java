package de.d.f.mosaic;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import de.d.f.mosaic.color.LegoColor;
import de.d.f.mosaic.utils.ColorUtils;

public class MosaicGenerator {

	public MosaicResult generate(final Mat originalMat, final int basePlateSize) {
		MosaicResult rc = new MosaicResult();
		int maxColumns = originalMat.cols();
		int maxRows = originalMat.rows();
		Mat mosaic = Mat.zeros(maxRows, maxColumns, originalMat.type());
		rc.setResult(mosaic);

		int squareSizeColumn = maxColumns / basePlateSize;
		int squareSizeRow = maxRows / basePlateSize;
		for (int currentRow = 0; currentRow < originalMat.rows(); currentRow += squareSizeRow) {
			for (int currentColumn = 0; currentColumn < originalMat.cols(); currentColumn += squareSizeColumn) {
				Rect rect = new Rect(currentColumn, currentRow,
						getMaxSquareSize(currentColumn, squareSizeColumn, maxColumns),
						getMaxSquareSize(currentRow, squareSizeRow, maxRows));
				Scalar meanOfRect = getMeanOfRect(originalMat, rect);

				LegoColor matchingLegoColor = ColorUtils.getClostestToScalar(meanOfRect);
				Imgproc.rectangle(mosaic, rect, matchingLegoColor.getColor(), -1, Imgproc.LINE_8);
				rc.addBrick(matchingLegoColor);
			}
		}
		return rc;
	}

	private int getMaxSquareSize(final int currentIndex, final int maxSquareSize, final int maxIndex) {
		int upper = currentIndex + maxSquareSize;
		if (upper > maxIndex) {
			int differenceToLarge = upper - maxIndex;
			return maxSquareSize - differenceToLarge;
		}
		return maxSquareSize;
	}

	private Scalar getMeanOfRect(final Mat originalMat, final Rect rect) {
		return Core.mean(originalMat.submat(rect));
	}
}
