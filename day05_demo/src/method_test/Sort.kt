package method_test

import kotlin.math.min

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/18 21:01
 */

fun sort(array: List<Int>): List<Int> {
    return array.sorted();
}

fun maxOf(arr:List<Int>):Int{
    var max = 0
    for (a in arr){
        if (a>max)
            max=a
    }
      return max
}

fun minOf(arr:List<Int>):Int{
    var min = Int.MAX_VALUE
    for (a in arr){
        if (a<min)
            min=a
    }
      return min
}

fun main() {

    val list = listOf(18, 45, 7, 456, 98, 67)

    println(sort(list))
    println(maxOf(list))
    println(minOf(list))

}