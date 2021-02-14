// Adish Shah
// Computer Science 20
// Henry Wise Wood High School
// 2020-2021 Semester 1 

import java.util.Scanner;
public class TriangleClassifier {

    public TriangleClassifier() {

    }

    // Function to get the type of triangle
    public static String getClassification(int angleA, int angleB, int angleC)
    {
        // Variables to store the result
        String result1 = "";
        String result2 = "";
        String result = "";

        // Check for the right, acute or obtuse triangle
        if((angleA == 90 || angleB == 90 || angleC == 90) && (angleB+angleA+angleC == 180) && (angleA > 0 && angleB > 0 && angleC > 0))
        {
            result1 = "right";
        }
        else if((angleA > 90 || angleB > 90 || angleC > 90) && (angleB+angleA+angleC == 180) && (angleA > 0 && angleB > 0 && angleC > 0))
        {
            result1 = "obtuse";
        }
        else if(angleA == angleB && angleB == angleC && angleA == angleC)
        {
            result1 = "";
        }
        else if((angleA < 90 && angleB < 90 & angleC < 90) && (angleB+angleA+angleC == 180) && (angleA > 0 && angleB > 0 && angleC > 0))
        {
            result1 = "acute";
        }
        else
        {
            result1 = "INVALID"; // Set as Invalid if the above conditions are not met.
        }

        // Check for the equilateral, scalene or isosceles triangle
        if((angleA == angleB && angleA == angleC && angleB == angleC) && (angleB+angleA+angleC == 180) && (angleA > 0 && angleB > 0 && angleC > 0))
        {
            result2 = "equilateral";
        }
        else if((angleA != angleB && angleA != angleC && angleB != angleC) && (angleB+angleA+angleC == 180) && (angleA > 0 && angleB > 0 && angleC > 0))
        {
            result2 = "scalene";
        }
        else if(((angleA == angleB && angleA != angleC && angleC != angleB) || (angleB == angleC && angleB != angleA && angleC != angleA)
                || (angleC == angleA && angleC != angleB && angleA != angleB)) && (angleB+angleA+angleC == 180) && (angleA > 0 && angleB > 0 && angleC > 0))
        {
            result2 = "isosceles";
        }
        else
        {
            result2 = "INVALID"; // Set as Invalid if the above conditions are not met.
        }

        // If both of the triangles are invalid then the result should be invalid triangle
        if(result1 == "INVALID" && result2 == "INVALID")
        {
            result = "INVALID";
        }
        else if (result1 == "")
        {
            result = result2;
        }
        else
        {
            result = result1 + " " + result2; // If both triangles are not invalid then set the correct triangle name
        }

        // return the result
        return result;
    }
}
