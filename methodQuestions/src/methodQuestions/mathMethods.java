package methodQuestions;
import java.lang.Math;

public class mathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static double triangleArea (double t_Base, double t_Height) {
		double t_Area = 0; 
		t_Area = ((t_Base*t_Height)/2);
		return t_Area;
	}
	public static double rectangleArea (double r_Base, double r_Height) {
		double r_Area = 0; 
		r_Area = (r_Base*r_Height);
		return r_Area;
	}
	public static double circleArea (double c_Ratio) {
		double c_Area = 0; 
		c_Area = Math.PI*Math.pow(c_Ratio,2);
		return c_Area;
	}
	public static double squareArea (double s_Side) {
		double s_Area = 0; 
		s_Area = Math.pow(s_Side, 2);
		return s_Area;
	}
	public static double rectangleVolume (double r_Width, double r_Lenght, double r_Height) {
		double r_Volume = 0; 
		r_Volume = r_Lenght*r_Height*r_Width;
		return r_Volume;
	}
	public static double pyramidVolume (double p_BaseA, double p_BaseB, double p_Height) {
		double p_Volume = 0; 
		p_Volume = ((p_BaseA*p_BaseB)*p_Height*(1/3));
		return p_Volume;
	}
	public static double sphereVolume (double s_Ratio) {
		double s_Volume = 0; 
		s_Volume = (Math.PI*Math.pow(s_Ratio,3)*(1/3));
		return s_Volume;
	}
}
