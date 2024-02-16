package student;

import java.awt.image.BufferedImage;

public class Grid extends AbstractGrid {
    public Grid(BufferedImage image, long seed) {
        super(image, seed);
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
