package student;

import java.awt.image.BufferedImage;

public class Grid extends AbstractGrid {
    Grid(BufferedImage image, long seed) {
        super(image, seed);
    }

    Grid(BufferedImage image, long seed, boolean testMode) {
        super(image, seed, testMode);
    }

    @Override
    BufferedImage convertToBufferedImage() {
        return null;
    }

    @Override
    int getBluestColumnIndex() throws RequestFailedException {
        return 0;
    }

    @Override
    void removeBluestColumn() throws RequestFailedException {
    }
}
