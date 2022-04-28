package android

import kmp.model.BaseControlModel

/**
 *  Klasa pokazująca obsługę rysowania kontrolki
 */
class Foo(
    // Dzięki "Composition" można odpalić metodę normalną w ramach composable
    // val original: Composition
) : BaseControlModel, Cloneable {

    override fun draw() {
//        original.setContent {
//            compose()
//        }
    }

    //    @Composable
    private fun compose() { /* Nothing now... */}

    override fun makeNewInstance(): BaseControlModel {
        return super.clone() as BaseControlModel
    }
}