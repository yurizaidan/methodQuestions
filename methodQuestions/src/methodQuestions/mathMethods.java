package methodQuestions;
import java.lang.Math;

public class mathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Triangle Area Calculation
	public static double triangleArea (double t_Base, double t_Height) {
		double triangle_Area = 0; 
		triangle_Area = (t_Base*t_Height)/2;
		return triangle_Area;
	}
	//Rectangle Area Calculation
	public static double rectangleArea (double r_Base, double r_Height) {
		double rectang_leArea = 0; 
		rectang_leArea = (r_Base*r_Height);
		return rectang_leArea;
	}
	//Circle Area Calculation
	public static double circleArea (double c_Ratio) {
		double circle_Area = 0; 
		circle_Area = Math.PI*Math.pow(c_Ratio,2);
		return circle_Area;
	}
	//Square Area Calculation
	public static double squareArea (double s_Side) {
		double square_Area = 0; 
		square_Area = Math.pow(s_Side, 2);
		return square_Area;
	}
	//Rectangular Prism Volume Calculation
	public static double rectangularPrismVolume (double r_Width, double r_Lenght, double r_Height) {
		double rectangularPrism_Volume = 0; 
		rectangularPrism_Volume = r_Lenght*r_Height*r_Width;
		return rectangularPrism_Volume;
	}
	//Pyramid Volume Calculation
	public static double pyramidVolume (double p_BaseSideA, double p_BaseSideB, double p_Height) {
		double pyramid_Volume = 0; 
		pyramid_Volume = (p_BaseSideA*p_BaseSideB)*p_Height*(1/3);
		return pyramid_Volume;
	}
	//Sphere Volume Calculation
	public static double sphereVolume (double s_Ratio) {
		double sphere_Volume = 0; 
		sphere_Volume = Math.PI*Math.pow(s_Ratio,3)*(4/3);
		return sphere_Volume;
	}
	//Cylinder Volume Calculation
	public static double cylinderVolume (double c_Ratio, double c_Height) {
		double cylinder_Volume = 0; 
		cylinder_Volume = Math.PI*Math.pow(c_Ratio,2)*c_Height;
		return cylinder_Volume;
	}
	//Rectangular Prism  Surface Area Calculation
	public static double rectangularPrismSurfaceArea (double r_Width, double r_Lenght, double r_Height) {
		double rectangularPrism_SurfaceArea = 0; 
		rectangularPrism_SurfaceArea = 2*(r_Width*r_Lenght+r_Lenght*r_Height+r_Width*r_Height);
		return rectangularPrism_SurfaceArea;
	}
	//Pyramid Surface Area Calculation
	public static double pyramidSurfaceArea (double p_BaseSideA, double p_BaseSideB, double p_Height) {
		double pyramid_SurfaceArea = 0; 
		pyramid_SurfaceArea = (p_BaseSideA*p_BaseSideB)+1/2*((p_BaseSideB*2)+(p_BaseSideA*2)*p_Height);
		return pyramid_SurfaceArea;
	}
	//Cylinder Surface Area Calculation
	public static double cylinderSurfaceArea (double c_Ratio, double c_Height) {
		double cylinder_SurfaceArea = 0; 
		cylinder_SurfaceArea = 2*Math.PI*c_Ratio*(c_Ratio*c_Height);
		return cylinder_SurfaceArea;
	}
	//Sphere Surface Area Calculation
	public static double sphereSurfaceArea (double s_Ratio) {
		double sphere_SurfaceArea = 0; 
		sphere_SurfaceArea = 4*Math.PI*Math.pow(s_Ratio,2);
		return sphere_SurfaceArea;
	}
}
