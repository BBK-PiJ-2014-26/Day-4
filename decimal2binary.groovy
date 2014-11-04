String decimal2binary(int x) {
	String result = ""	
	String nought = "0"
	String one = "1"
	int temp = x
	int power = 0
	for (int i = 0; temp > 1; i++) {
		temp = temp / 2
		power++
	}
	while (power > -1) {
		temp = Math.pow(2, power)
		if (temp <= x) {
			result = result + one
			x = x - temp
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
int x = Integer.parseInt(str)
String y = decimal2binary(x)
println "Equals: " + y
