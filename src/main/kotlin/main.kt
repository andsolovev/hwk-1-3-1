fun main() {
    agoToText("Oleg", 10)
    agoToText("Olga", 3211)
    agoToText("Ivan", 7300)
    agoToText("Igor", 100000)
    agoToText("Kate", 200000)
    agoToText("Elena", 2000000)
}

fun agoToText(user: String, time: Int) {
    println("$user был(а) в сети ${declension(time)}")
}

fun declension(time: Int) = when (time) {
    in 0..59 -> "только что"
    in 60..3599 -> when ((time/60) % 10) {
        1 -> "${time/60} минуту назад"
        2, 3, 4 -> "${time/60} минуты назад"
        else -> "${time/60} минут назад"
    }
    in 3600..86399 -> when ((time/3600) % 10) {
        1 -> "${time/3600} час назад"
        2, 3, 4 -> "${time/3600} часа назад"
        else -> "${time/3600} часов назад"
    }
    in 86400..172799 -> "вчера"
    in 172800..259199 -> "позавчера"
    else -> "давно"
}
