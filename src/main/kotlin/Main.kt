fun main(args: Array<String>) {
    """Важно!!! Для работы программы удалите ' в ответах для работы"""

    """Задание 1"""
    """print("Введите набор из латинских букв: ")
    val input = readln()
    var result = ""
    var currentChar = input[0]
    var count = 1
    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result += currentChar
            if (count > 1) {
                result += count
            }
            currentChar = input[i]
            count = 1
        }
    }
    result += currentChar
    if(count>1){
        result+=count
    }
    println("Сокращенный набор букв: "+result)"""

    """Задание 2"""
    """print("Введите набор из латинских букв: ")
    val input = readln()
    val result = input.groupBy { it }.mapValues { it.value.size }
    result.keys.sorted().forEach(){
        println("$'it - $'{result[it]}")
    }"""

    """Задание 3"""
    """print("Введите число которое будет преобразованно в двоичную систему: ")
    val input = readln()
    val result = input.toInt()
    println("Число $'input в двоичной системе: $'{result.toString(2)}")"""

    """Задание 4"""
    print("Введите для числа и :символ операции (символами могут быть /, *, +, -) ")

}