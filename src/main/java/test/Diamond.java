package test;

public class Diamond {

    private int height;
    private int width;

    public void print(int height, int width) {
        int middleHeight = height / 2;
        int middleWidth = width / 2;
        int increment = Math.round((float) width / height);
        int leftMargin = middleWidth + 1 - increment;
        int rightMargin = width - leftMargin - ( leftMargin - increment );
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                System.out.printf("%" + ( middleWidth + 1 ) + "s", "#");
            } else {
                System.out.printf("%" + leftMargin + "s", "#");
                System.out.printf("%" + rightMargin + "s", "#");


                if (i == middleHeight) {
                    increment = -increment;
                }
                leftMargin = leftMargin - increment;
                if (leftMargin < 1) {
                    leftMargin = 1;
                }
                rightMargin = width - leftMargin - ( leftMargin - Math.abs(increment) );
                if (rightMargin < 1) {
                    rightMargin = Math.abs(increment);
                }
            }
            System.out.println();
        }
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
