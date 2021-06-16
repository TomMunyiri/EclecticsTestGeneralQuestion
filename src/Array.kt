import java.util.stream.IntStream

fun main(){
    val input = arrayOf(3, 5, -4, 8,11,1,-1,6)
    val targetSum=10
    println(twoNumSum(input,targetSum))
}

fun twoNumSum(array: Array<Int>, targetSum: Int): List<Int>? {
    val ans: MutableList<Int> = ArrayList()
    IntStream.range(0, array.size).forEachOrdered { n: Int ->
        val firstNum = array[n]
        IntStream.range(n + 1, array.size).forEachOrdered { j: Int ->
            val secondNum = array[j]
            val sum = firstNum + secondNum
            if (sum == targetSum) {
                ans.add(firstNum)
                ans.add(secondNum)
            }
        }
    }
    return ans
}