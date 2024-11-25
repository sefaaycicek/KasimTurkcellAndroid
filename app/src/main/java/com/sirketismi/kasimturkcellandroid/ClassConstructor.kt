fun main() {
    var student = Student("", 10)
}

class Student(var name : String) { // primary constructor

    constructor(n: String , id : Int) : this(n) { // secondary constructor

    }

    init {
        println("print edildi")
    }
}