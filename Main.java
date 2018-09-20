public class Main {

    public static void main(String[] args) {
	// write your code here
        double ax = 5;
        double ay = 2;
        double az = -5;
        double bx = 4;
        double by = 9;
        double bz = 2;
        double cx = -3;
        double cy = 2;
        double cz = 6;

        double abInner1 = Math.pow((ay-by),2);
        double abInner2 = Math.pow((ax-bx), 2);
        double abInner3 = Math.pow((az-bz),2);
        double abDistance = Math.sqrt(abInner1+abInner2+abInner3);
        double acInner1 = Math.pow((ay-cy),2);
        double acInner2 = Math.pow((ax-cx), 2);
        double acInner3 = Math.pow((az-cz),2);
        double acDistance = Math.sqrt(acInner1+acInner2+acInner3);
        double bcInner1 = Math.pow((by-cy),2);
        double bcInner2 = Math.pow((bx-cx), 2);
        double bcInner3 = Math.pow((bz-cz),2);
        double bcDistance = Math.sqrt(bcInner1+bcInner2+bcInner3);

        double max1 = Math.max(abDistance, acDistance);
        double max2 = Math.max(max1, bcDistance);
        double min1 = Math.min(abDistance, acDistance);
        double min2 = Math.min(min1, bcDistance);

        System.out.println("The maximum distance is  " + max2);
        System.out.print("The Minimum distance is " + min2);

    }
}
