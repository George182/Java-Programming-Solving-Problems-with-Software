import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        Integer totPoints = 0;
        for (Point currPt : s.getPoints()) {
            totPoints += 1;
        }
        return totPoints;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        Double avgLength = getPerimeter(s) / getNumPoints(s);
        return avgLength;
    }

    public double getLargestSide(Shape s) {
        double totalPerim = 0.0;
        double largestDist = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            if( currDist > largestDist){
                largestDist = currDist;
            }
            prevPt = currPt;
        }
        return largestDist;
    }

    public double getLargestX(Shape s) {
        double largestX = 0.0;
        for (Point xY : s.getPoints()) {
            int currX = xY.getX();
            if( currX > largestX){
                largestX = currX;
            }

        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        double avgLen = getAverageLength(s);
        double largestX = getLargestX(s);
        double largestSide = getLargestSide(s);

        System.out.println("perimeter = " + length);
        System.out.println("average length = " + avgLen);
        System.out.println("Largest X = " + largestX);
        System.out.println("largest side = " + largestSide);
    }

    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
