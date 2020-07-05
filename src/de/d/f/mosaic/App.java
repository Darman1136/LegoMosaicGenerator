package de.d.f.mosaic;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import de.d.f.mosaic.utils.BrickLinkConstants;
import de.d.f.mosaic.utils.BrickLinkUtils;
import de.d.f.mosaic.utils.ImageUtils;
import de.d.f.mosaic.utils.LegoConstants;

public class App {

	public static void main(final String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		if (args == null || args.length != 2) {
			System.err.println("Please specify image path and output directory");
			return;
		}

		Mat original = Imgcodecs.imread(args[0]);

		if (original.empty()) {
			System.err.println("No image found at location.");
			return;
		}

		ImageUtils.showImage("Original", original);
		MosaicGenerator mosaicGenerator = new MosaicGenerator();

		MosaicResult result16 = mosaicGenerator.generate(original, LegoConstants.BASEPLATE_16);
		ImageUtils.showImage("Mosaic16", result16.getResult());
		System.out.println("16x16:");
		BrickLinkUtils.printBrickLinkImport(BrickLinkConstants.ITEM_ID_PLATE_1x1, result16.getBrickUsage());

		MosaicResult result32 = mosaicGenerator.generate(original, LegoConstants.BASEPLATE_32);
		ImageUtils.showImage("Mosaic32", result32.getResult());
		System.out.println("32x32:");
		BrickLinkUtils.printBrickLinkImport(BrickLinkConstants.ITEM_ID_PLATE_1x1, result32.getBrickUsage());

		MosaicResult result48 = mosaicGenerator.generate(original, LegoConstants.BASEPLATE_48);
		ImageUtils.showImage("Mosaic48", result48.getResult());
		System.out.println("48x48:");
		BrickLinkUtils.printBrickLinkImport(BrickLinkConstants.ITEM_ID_PLATE_1x1, result48.getBrickUsage());

		Imgcodecs.imwrite(args[1] + "\\16.jpg", result16.getResult());
		Imgcodecs.imwrite(args[1] + "\\32.jpg", result32.getResult());
		Imgcodecs.imwrite(args[1] + "\\48.jpg", result48.getResult());
	}

}
