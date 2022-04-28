package android

import kmp.model.BaseControlModel
import kmp.model.ImageModel

class Image : ImageModel, Cloneable {
    override var description: String = "abc"

    override fun draw() {
        System.out.println("Class " + this::class.java)
    }

    override fun makeNewInstance(): BaseControlModel {
        return super.clone() as BaseControlModel
    }
}