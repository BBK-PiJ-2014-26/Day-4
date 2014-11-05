String decimal2binary(double x) {
	String result = ""	
	String nought = "0"
	String one = "1"
	double temp = x
	int power = 0
	for (int i = 0; temp > 1; i++) {
		temp = temp / 2
		power++
	}
	while (x != 0) {
		int sub = Math.pow(2, power)
		if (sub <= x) {
			result = result + one
			x = x - sub
			power--
		} else {
			result = result + nought
			power--
		}
	}
	return result
}

println "Please enter a number to convert."
String str = System.console().readLine()
double x = Integer.parseInt(str)
String y = decimal2binary(x)
println "Equals: " + y
