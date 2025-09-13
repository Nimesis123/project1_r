import com.sun.jdi.connect.Connector.StringArgument

fun main(args: Array<String>) {

    var exitProgram = true
    do {
        print("Выберите номер задания для запуска (всего заданий 6 (1-6)): ")
        var inputTask = readln()
        var taskNum = inputTask.toInt()
        when (taskNum){
            1 -> taskNum1()
            2 -> taskNum2()
            3 -> taskNum3()
            4 -> taskNum4()
            5 -> taskNum5()
            6 -> taskNum6()
            else -> break
        }
        println("Хотите завершить работу программы?")
        var inputExit = readln()
        if(inputExit=="Да" || inputExit=="да" || inputExit=="Yes" || inputExit=="yes") {
            exitProgram = false
        }
        else {
            println("----------------------------------------")
        }
    } while (exitProgram == true)
}
fun taskNum1() {
    print("Введите набор из латинских букв: ")
    val inputstring = readln()
    var result = ""
    var currentChar = inputstring[0]
    var count = 1
    for (i in 1 until inputstring.length) {
        if (inputstring[i] == currentChar) {
            count++
        } else {
            result += currentChar
            if (count > 1) {
                result += count
            }
            currentChar = inputstring[i]
            count = 1
        }
    }
    result += currentChar
    if(count>1){
        result+=count
    }
    println("Сокращенный набор букв: $result")
}

fun taskNum2(){
    print("Введите набор из латинских букв: ")
    val inputstring = readln()
    val result = inputstring.groupBy { it }.mapValues { it.value.size }
    result.keys.sorted().forEach(){
        println("$it - ${result[it]}")
    }
}

fun taskNum3(){
    print("Введите число которое будет преобразованно в двоичную систему: ")
    val inputNum = readln()
    val result = inputNum.toInt()
    println("Число $inputNum в двоичной системе: ${result.toString(2)}")
}

fun taskNum4() {
    print("Введите для числа и символ операции через один пробел (символами могут быть /, *, +, -): ")
    val inputNumNumChar = readln().split(" ")
    val num1 = inputNumNumChar[0].toDouble()
    val num2 = inputNumNumChar[1].toDouble()
    val char1 = inputNumNumChar[2].toString()
    when (char1) {
        "+" -> println("Ответ: " + (num1+num2))
        "-" -> println("Ответ: " + (num1-num2))
        "*" -> println("Ответ: " + (num1*num2))
        "/" -> println("Ответ: " + (num1/num2))
    }
}

fun taskNum5(){
    println("Введите целое число и основание степени")
    print("Введите целое число: ")
    val intNum = readln().toInt()
    print("Введите основание степени: ")
    val degreeBaseNum = readln()
    for (i in 1 .. intNum){
        var degreeNum = '0'
        var count = i
    }
}

fun taskNum6(){

}
