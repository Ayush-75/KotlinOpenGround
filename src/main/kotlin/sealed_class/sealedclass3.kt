
package sealed_class
/*
sealed interface ClickableItem{
    fun deviceInfo()
}

sealed class DeviceItem(val name:String):ClickableItem{
    data object Camera:DeviceItem("Camera") {
        override fun deviceInfo() {
            println("the device is $name")
        }
    }

    data object Lamp:DeviceItem("Lamp") {
        override fun deviceInfo() {
            println("the device is $name")
        }
    }
}

fun getClickableItem(item: ClickableItem){
    when(item){
        DeviceItem.Camera -> println("Camera is clicked")
        DeviceItem.Lamp -> println("Lamp is clicked")

    }
}

fun main(args: Array<String>) {
    val cameraItem = DeviceItem.Camera
    val lampItem = DeviceItem.Lamp

    val arr:Array<ClickableItem> = arrayOf(cameraItem,lampItem)
    for (obj in arr){
        if (obj is DeviceItem.Camera){
            obj.deviceInfo()
        }
        else{
            (obj as DeviceItem.Lamp).deviceInfo()
        }
    }
            getClickableItem(cameraItem)

//    (cameraItem as ClickableItem).deviceInfo()
}*/
