class Exer3D1 {
  public static void main(String[] args) {
    double x1,y1,x2,y2;
	x1 = 3.5; y1 = 1.0; x2 = 14.0; y2 = 6.5;
   	double xm,ym,d;
	xm = (x1+x2)/2;
	ym = (y1+y2)/2;
	d = Math.sqrt(Math.pow((xm-x1),2)+Math.pow((ym-y1),2));
	System.out.println("First point : ("+x1+","+y1+")");
	System.out.println("Second point :("+x2+","+y2+")");
	System.out.println("Middle point : ("+xm+","+ym+")");
	System.out.println("Distance from 1st to 2nd point : " +d);
    
  }
}
