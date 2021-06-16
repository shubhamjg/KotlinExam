import java.util.*

fun Palindrome(n:Int):Boolean{
    var ispalindrome = false
    var total = 0
    var temp = n

    while (temp>0){
        val b = temp % 10
        total = total * 10 + b
        temp/=10
    }
    if (total == n){
        ispalindrome = true
    }
    return ispalindrome
}



fun main(arg: Array<String>){

    val sc = Scanner(System.`in`)

    println("Please Enter Number :")

    val s: Int = sc.nextInt()

    if (Palindrome(s))
        println("$s is a Palindrome")
    else
        println("$s is not a Palindrome")
}