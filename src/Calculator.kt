import kotlin.Exception

fun main(args: Array<String>) {

    while (true) {
        try {
            println("請輸入第一個數字：")
            var s1 = readLine();
            println("請輸入第二個數字：")
            var s2 = readLine();

            var num1 = s1!!.toFloat();
            var num2 = s2!!.toFloat();

            println("${num1} + ${num2} = ${num1 + num2}");
        } catch (e: Exception) {
            println("輸入的數據有問題，請重新輸入。。。")
        }
    }

}