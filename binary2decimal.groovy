double binary2decimal(String s) {
	double result = 0.0
	int sLength = s.length()
	int power = 0
	for(int i = (sLength - 1); i >= 0; i--) {
		char digit = s.charAt(i)
		if (digit == '1') {
			result = result + (Math.pow(2, power))
			power++
		} else if (digit == '0') {
			power++
		} else {
			i = -1
			result = result - result
		}
	}
	return result
}

println "Please enter a binary number to convert."
String str = System.console().readLine()
Double x = binary2decimal(str)
if (x == 0) {
	println "Not a binary number."
} else {
	println "Equals: " + x
}