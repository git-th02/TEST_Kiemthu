/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testapp;

/**
 *
 * @author ngothithom
 */
public class TriangleClassifier {
    public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "NotATriangle";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else if (side1 * side1 == side2 * side2 + side3 * side3 || side2 * side2 == side1 * side1 + side3 * side3 || side3 * side3 == side1 * side1 + side2 * side2) {
            return "Right triangle";
        } else {
            return "Scalene";
        }
    }

    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String triangleType = classifyTriangle(side1, side2, side3);
        System.out.println(triangleType);  // Kết quả: Right triangle
    }
}
//public class tamgiac {
//    public static String isTamgiac (int a, int b, int c) {
//        if (a<=0 || b<=0 || c<=0 || a+b <= c || a+c<=b || b+c<= a) {
//            return "NotATriangle";
//            
//        } else if (a == b && b == c) {
//            return "Equilateral";
//        } else if (a==b || a==c || b==c) {
//            return "Isosceles";
//        
//        } else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
//            return "Right triangle";
//        } else {
//            return "Scalene";
//        }
//        
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        int a= 3;
//        int b= 4;
//        int c=5;
//        
//        String istamgType = isTamgiac(a, b,c);
//        System.out.println(istamgType); // Ket qua tam giac vuong
//        // TODO code application logic here
//    }
//    
//}
