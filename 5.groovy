class Point {
	double x
	double y

	double distanceTo(Class Point) {
		double result = Math.sqrt((Point.x * Point.x) + (Point.y * Point.y))
		return result
	}
		
	double distanceToOrgin() {
		double result = Math.sqrt((this.x * this.x) + (this.y * this.y))
		return result
	}
		
		
	void moveTo(double x, double y) {
		this.x = x
		this.y = y
	}

	void moveTo(Point) {
		this.Point = Point
	}

	Point clone() {
		Point clone = new Point()
		clone.x = this.x
		clone.y = this.y
		return clone
	}

	Point opposite() {
		Point opposite = new Point()
		opposite.x = this.x * -1
		opposite.y = this.y * -1
		return opposite
	}
}

Point myPoint = new Point()
print "Enter the x co-ordinate: "
String s = System.console().readLine()
myPoint.x = Integer.parseInt(s)
print "Enter the y co-ordinate: "
s = System.console().readLine()
myPoint.y = Integer.parseInt(s)
println myPoint.x
println myPoint.y
double distance = distanceTo(myPoint)
println "Distance to point is " + distance