// "Replace with 'FOO'" "true"

const val FOO = 1
@Deprecated("always const", ReplaceWith("FOO"))
fun foo() = 1
fun test(){
    val x = foo<caret>()
}