class Graph{
	public Graph(){
		System.out.println("Graph const is created");
	}
	public void addPoint(){
		System.out.println("point is at origin(0,0)");
	}
	public void addPoint(int x,int y){
		System.out.println("point is at ("+x+","+y+")");
	}
	public void addPoint(double x, double y){
		System.out.println("point is at ("+x+","+y+")");
	}
	public void addPoint(double x, int y){
		System.out.println("point is at ("+x+","+y+")");
	}
	public void addPoint(int x, double y){
		System.out.println("point is at ("+x+","+y+")");
	}

}
class Overloading{
	public static void main(String[] args) {
		System.out.println("starts ......");
		Graph g = new Graph();
		g.addPoint();
		g.addPoint(2,3);
		g.addPoint(2.3,3.2);
		g.addPoint(2.4,3);
		g.addPoint(2,3.8);
		System.out.println("ends ........");
	}
}