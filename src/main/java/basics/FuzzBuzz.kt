package basics

// fizzBuzz function that returns String that represents what should be said in the FizzBuzz game for each number between 1 and 100.
// We list all this numbers in new lines, but we replace some of them with:
// “Fizz” if number is divisible by 3
// “Buzz” if number is divisible by 5
// “FizzBuzz” if number is divisible both by 3 and 5 (by 15)
fun fizzBuzz(): String {
    var text = ""
    for (i in 1..100) {
        text += when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }
        if(i != 100) text += ", "
    }
    return text
}