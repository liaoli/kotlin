import java.math.BigInteger

fun main(args: Array<String>) {

    var result = factorial(10);

    println("result = ${result}");

    var result2 = factorial_(BigInteger("100"));

    println("result2 = ${result2}");


    var result3 = accumulation(10);
    println("result3 = ${result3}");

    //Exception in thread "main" java.lang.StackOverflowError
//    var result4 = accumulation(1000000000);
//    println("result4 = ${result4}");

    var result5 = accumulation(100000L, 1L);

    println("result5 = ${result5}");

}

/**
 * 階乘
 */
fun factorial(num: Long): Long {
    if (num == 1L) {
        return 1;
    } else {
        return num * factorial(num - 1L);
    }
}

/**
 * 大數據階乘
 */
fun factorial_(num: BigInteger): BigInteger {
    if (num == BigInteger.ONE) {
        return BigInteger.ONE;
    } else {
        return num * factorial_(num - BigInteger.ONE);
    }
}

/**
 * 纍加
 */
fun accumulation(num: Int): Int {

    if (num == 1) {
        return 1;
    } else {
        return num + accumulation(num - 1);
    }

}

/**
 * 纍加 處理尾遞歸的問題
 */
tailrec fun accumulation(num: Long, result: Long): Long {
    println("num = ${num},result = ${result}")
    if (num == 1L) {
        return 1L;
    } else {
        return accumulation(num - 1L, result + num);
    }

}