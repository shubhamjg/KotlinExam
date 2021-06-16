import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>){

    val n = 15
    var fib1 = 0
    var fib2 = 1

    val reverseList  = ArrayList<Int>();
    val count = 0;

    for(i in 1..n){
        val f = fib1 + fib2
        fib1 =fib2
        fib2 = f
        print(" $fib1 ")
        reverseList.add( fib1);

    }


    reverseList.reverse()
    print("\n")
    for (i in 1..reverseList.size-1){
        print(" " +reverseList.get(i-1))
    }

}