fun main(args:Array<String>){
    println("hello world");

    var result = add(1,2);

    println("result = ${result}");

    var result1 = add1(1,2);
    println("result1 = ${result1}");
    //函数表达式
    var i = {x:Int,y:Int -> x+y};

    var result2 = i(1,2);
    println("result2 = ${result2}");

    var j:(Int,Int)->Int={x ,y->x+y};
    var result3 = j(1,2);
    println("result3 = ${result3}")

    //具名參數的用法
    var area1 = areaOfCircle(3.1415f,4f);

    println("area1 = ${area1}");

    var area2 = areaOfCircle(R=4f);

    println("area2 = ${area2}");
}

fun add(x:Int,y:Int):Int{
    return x+y;
}
fun add1(x:Int,y:Int) :Int= x +y
val Pi:Float = 3.14f;
fun areaOfCircle(PI:Float = Pi,R:Float):Float = PI * R *R;