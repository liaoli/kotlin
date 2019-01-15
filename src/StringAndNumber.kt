fun main(args:Array<String>){
    var a = "13";
    var b = 13;
    //數字和字符串相互轉換。
    a = b.toString();

    b = a.toInt();

    /*
    Exception in thread "main" java.lang.NumberFormatException: For input string: "a3"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
     */
    var c = "a3";

    b = c.toInt();

}