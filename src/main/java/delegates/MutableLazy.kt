package delegates

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <T> mutableLazy(initializer: () -> T): ReadWriteProperty<Any?, T> = MutableLazyDelegate<T>(initializer)

private class MutableLazyDelegate<T>(val initializer: () -> T) : ReadWriteProperty<Any?, T> {
    var value: Any? = NOT_INITIALIZED

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        if(value == NOT_INITIALIZED) {
            value = initializer()
        }
        return value as T
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        this.value = value
    }
}

private val NOT_INITIALIZED: Any = object {}

var name by mutableLazy { "Marcin" }

fun main() {
    print(name) // Marcin
    name = "AAA"
    print(name) // AAA
}