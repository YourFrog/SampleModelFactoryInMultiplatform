package kmp

import kmp.model.BaseControlModel
import kotlin.reflect.KClass

/**
 *  Fabryka tworząca modele. Nie stety nie może być typu generycznego bo nie można używać "object"
 */
object ModelFactory {

    private val items: MutableMap<KClass<out BaseControlModel>, BaseControlModel> = mutableMapOf()

    fun register(classType: KClass<out BaseControlModel>, instance: BaseControlModel) {
        items[classType] = instance
    }

    fun <T: BaseControlModel> create(classType: KClass<out T>): T {
        val instance = items[classType]?.makeNewInstance() as? T

        return instance ?: throw IllegalArgumentException()
    }
}