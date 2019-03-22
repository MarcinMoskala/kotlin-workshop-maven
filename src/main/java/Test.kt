import coroutines.backend.User
import java.io.BufferedInputStream
import java.io.FileInputStream
import java.util.zip.ZipInputStream

var user: User? = User("Marcin")

fun main() {
    user = null

    (1..100).filter { it % 2 == 0 }
            .map { it * it }
            .let(::print)

//    val user = user
//    if(user != null) {
//        print(user.name)
//    }

    user?.let { u ->
        print(u.name)
    }

    val fis = FileInputStream("KOKOKOK")
    val bis = BufferedInputStream(fis)
    val zis = ZipInputStream(bis)

    val stream = ZipInputStream(BufferedInputStream(FileInputStream("KOKOKOK")))

    val streamLet = FileInputStream("KOKOKOK")
            .let { BufferedInputStream(it) }
            .let { ZipInputStream(it) }
}