import java.io.File

fun main(args: Array<String>) {

    val ipCount = mutableMapOf<String, Int>()
    File("src/ips.txt").forEachLine {
        val previous = ipCount.getOrDefault(it, 0)
        ipCount.put(it, previous + 1)
       /* if (ipCount.contains(it)) {
            val previous = ipCount.get(it)!!
            ipCount.put(it, previous + 1)
        } else {
            ipCount.put(it, 1)
        }*/
    }
    var maxIp = ipCount.keys.first()
    var maxCount = 0
    for ((ip, count) in ipCount.entries) {
        if (count > maxCount) {
            maxCount = count
            maxIp = ip
        }
    }
    println("Most frequent IP address is $maxIp, which ocurred$maxCount times")
}