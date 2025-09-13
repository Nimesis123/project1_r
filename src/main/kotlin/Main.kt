import com.sun.jdi.connect.Connector.StringArgument

fun main(args: Array<String>) {
    print("Выберите номер задания для запуска (всего заданий 6 (1-6)): ")
    var inputTask = readln()
    var taskNum = inputTask.toInt()
    var exitProgram = true
    do {
        when (taskNum){
            1 -> taskNum1()
            2 -> taskNum2()
            3 -> taskNum3()
            4 -> taskNum4()
            5 -> taskNum5()
            6 -> taskNum6()
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

fun taskNum4(){
    print("Введите для числа и символ операции через один пробел (символами могут быть /, *, +, -) ")
    val inputNumNumChar = readln()
    for (i in 0 .. inputNumNumChar.length){
        if (inputNumNumChar[i]==' '){

        }
    }
    val num1 = inputNumNumChar[0]
    val num2 = inputNumNumChar[1]
    val char1 = inputNumNumChar[2]
    println("Первое число: $num1 Второе число: $num2 Символ между ними: $char1")
}

fun taskNum5(){

}

fun taskNum6(){

}
