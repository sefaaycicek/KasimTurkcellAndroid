

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.

// Extensions
fun Int.greaterValue(other : Int) : Int {
    if(this > other)
        return this
    else
        return other
}

fun String.add(s1 : String, s2 : String) : String {
    return this + s1 + s2
}

// Infix func

infix fun Int.ussu(other : Int) : Int {
    return 10
}

fun main() {
    var sayi = 10
    val sayi2 = 20.0f // constant
    val sayi3 = 20.0

    println(10.greaterValue(21))

    var ussuDeger = 10 ussu 20

    var isActive : Boolean = true
    var myString : String = "text1" // mutable
    myString += " text2"

    val myString2 = "dasdad" // immutable
    //myString2 += " text2"
    var gender : Char = 'M'


    sayi = 20

    println("hello world $sayi ${sayi + 1}")

    val person = Person()
    person.name = ""
    person.display(prm = 10,  prm2 = "")

    val user = User(name = "", surname = "")
}

class Person {
    var name: String = ""
    var surname: String = ""

    fun display(prm: Int, prm2: String): String {
        print(name)



        return ""
    }

    // functions as expressions
    fun max(a: Int, b: Int): Int = if (a < b) { a } else { b }
}

data class User (val name : String, val surname : String)

