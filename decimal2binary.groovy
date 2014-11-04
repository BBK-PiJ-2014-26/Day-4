int decimal2binary(int x) {
	String result = null
	int power = (x / 2) - 1	
	char nought = '0'
	char one = '1'
	while (x!= 0) {
		int temp = Math.pow(2, power)
		if (temp <= x) {
			result = result + one
			x = x - temp
			power--
		} else {
			result = result + nought
			power--
	}
	return result
}

println "Please enter a number to convert."
String str = System.console().readLine()
int x = Integer.parseInt(str)
int y = decimal2binary(x)
println "Equals: " + y
