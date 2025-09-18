//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val stroka = readln()
   val sostav = stroka.split(" ")
   var rez = 0.0
   if (sostav[2] == "+") {
        rez = sostav[0].toDouble() + sostav[1].toDouble()
   }
    if (sostav[2] == "-") {
        rez = sostav[0].toDouble() - sostav[1].toDouble()
    }
    if (sostav[2] == "/") {
        rez = sostav[0].toDouble() / sostav[1].toDouble()
    }
    if (sostav[2] == "*") {
        rez = sostav[0].toDouble() * sostav[1].toDouble()
    }
    println("Результат = $rez")
}








