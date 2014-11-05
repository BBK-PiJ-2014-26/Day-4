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

print "Please enter 1 to convert decimal to binary, or 2 to convert binary to decimal: "
String str = System.console().readLine()
int choice = Integer.parseInt(str)
switch (choice) {
	
	case 1:
	println "Please enter a number to convert."
	str = System.console().readLine()
	int x = Integer.parseInt(str)
	String y = decimal2binary(x)
	println "Equals: " + y
	break;

	case 2:
	println "Please enter a binary number to convert."
	str = System.console().readLine()
	Double a = binary2decimal(str)
	if (a == 0) {
		println "Not a binary number."
	} else {
		println "Equals: " + a
	}
	break;
	
	default:
	println "Not a valid selection."
	break;
}
	
	

