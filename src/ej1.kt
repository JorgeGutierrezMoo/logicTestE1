import java.util.*
import kotlin.random.Random



fun main() {
    check()
}

fun check() {
    val T = Random.nextInt(1, 5000)
    val MaxSize = 1000000000

    println("T: $T")

    for (item: Int in 1..T){
        val n = Random.nextInt(1, MaxSize)
        val m = Random.nextInt(1, MaxSize)
        //If you want to see the generated (n, m), just uncomment the following line
        //print("($n, $m) \n ")
        if(n > m){
            if (m%2 == 0){
                println("u")
            }else{
                println("D")
            }
        }
        else{
            if (n%2 == 0){
                println("L")
            }else{
                println("R")
            }
        }
    }
}