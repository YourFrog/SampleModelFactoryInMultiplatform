import android.Button
import android.Image
import kmp.ModelFactory
import kmp.model.ButtonModel
import kmp.model.ImageModel

fun main() {
    ModelFactory.register(ButtonModel::class, Button())
    ModelFactory.register(ImageModel::class, Image())

    // Przykładowe wywołanie bez apply
    val button = ModelFactory.create(ButtonModel::class)
    button.title = "xyz"
    button.draw()

    // Pełne wywołanie z draw
    val image = ModelFactory.create(ImageModel::class).apply {
        this.description = "cdf"
    }.draw()

    // Wykorzystanie listy :)
    listOf(
        ModelFactory.create(ImageModel::class),
        ModelFactory.create(ImageModel::class),
        ModelFactory.create(ImageModel::class),
        ModelFactory.create(ImageModel::class),
        ModelFactory.create(ImageModel::class),
        ModelFactory.create(ButtonModel::class)
    ).forEach {
        it.draw()
    }
}
