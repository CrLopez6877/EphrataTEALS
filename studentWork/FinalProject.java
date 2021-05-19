package studentWork; 

import java.util.Arrays;
import java.util.ArrayList;
public static class point3D {
    private int x;
    private int y;
    private int z;

    public Point3D(int a, int b, int c) {
        x = a;
        x = b;
        x = c;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y; 
    }

    public int getZ() {
        return z;
    }
    public String getPoint() {
        System.out.println("("+ x +"," + y + ", "+ z +")");

        return "("+ x +"," + y+ "," + z + ")";
    }
    public double stance(Point3d point2) {
        double distanceX = x - point2.getX();
        double distanceY = Y - point2.getY();
        double distanceZ = Z - point2.getZ();
        double distance = distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ;
        distance = Mathsqrt(distance);
        return ditsance;
    }
}
