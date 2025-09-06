fun main(args: Array<String>) {
    """print("Введите набор из латинских букв: ")
    val imput = readln()
    var result = ""
    var currentChar = imput[0]
    var count = 1
    for (i in 1 until imput.length) {
        if (imput[i] == currentChar) {
            count++
        } else {
            result += currentChar
            if (count > 1) {
                result += count
            }
            currentChar = imput[i]
            count = 1
        }
    }
    result += currentChar
    if(count>1){
        result+=count
    }
    println("Сокращенный набор букв: "+result)"""

    print("Введите набор из латинских букв: ")
    val imput = readln()
    val result = imput.groupBy { it }.mapValues { it.value.size }
    result.keys.sorted().forEach(){
        println("$it - ${result[it]}")
    }

}