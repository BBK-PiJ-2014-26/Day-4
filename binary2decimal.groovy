Double binary2decimal(String s) {
	int sLength = s.length()
	for(int i = sLength; i >= 0; i--) {
		char digit = s.charAt(i)
		if (digit == 0 || digit == 1) {
			double result = 0.0
			for(int power = 0; power < sLength; power++) {
				if (digit = 1) {
					result = result + (Math.pow(2, power)
				} 
			}
		} else {
			println "Not a binary number."
			break
		}
	}
	return result
}

println "Please enter a binary number to convert.
String str = System.console().readLine()
println "In decimal, that equals: " + binary2decimal(str)