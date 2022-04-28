package android

import kmp.model.BaseControlModel
import kmp.model.ButtonModel

internal class Button : ButtonModel, Cloneable {
    override var title = "abc"

    override fun draw() {
        System.out.println("Class " + this::class.java + ", :: " + this)
    }

    override fun makeNewInstance(): BaseControlModel {
        return super.clone() as BaseControlModel
    }
}