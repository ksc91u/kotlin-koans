package i_introduction._3_Default_Arguments

import util.JavaCode
import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        Several overloads of 'JavaCode3.foo()' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add parameters and replace 'todoTask3()' with a real body.
        Uncomment the commented code and make it compile.
    """,
    documentation = doc2(),
    references = { name: String -> foo(name); foo(name, 1, true) })

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    val upCaseName = if (toUpperCase) name.toUpperCase() else name
    return upCaseName+number.toString()
}

fun task3(): String {
//    todoTask3()
    return (foo("a") +
            foo("b", number = 1) +
            foo("c", toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}

