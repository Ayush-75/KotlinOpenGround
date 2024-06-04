package sealed_class


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

/*
* To address the error in your Kotlin code,
*  particularly at the else statement,
* you should remember that else does not accept a condition
* because it's supposed to catch all cases
* that were not previously handled by if or else if.
*  In Kotlin, else is the default branch that executes
*  when none of the preceding conditions are met.
* If you need to check for a specific type and
* execute code based on that,
* you should use if or else if for such checks.

Moreover, when you're working with sealed classes
* or interfaces, leveraging when expressions can
* make your code more idiomatic and safe,
* taking full advantage of Kotlin's type checking
* for exhaustive cases. In the case of iterating
* through ClickableItem instances and executing
* type-specific logic, a when expression can be a better fit*/

fun main(args: Array<String>) {
    val cameraItem = DeviceItem.Camera
    val lampItem = DeviceItem.Lamp

    val arr:Array<ClickableItem> = arrayOf(cameraItem,lampItem)
   for (obj in arr){
       when(obj){
           DeviceItem.Camera -> obj.deviceInfo()
           DeviceItem.Lamp -> obj.deviceInfo()
       }
   }

    getClickableItem(cameraItem)

//    (cameraItem as ClickableItem).deviceInfo()
}

/*
* Also in your getClickableItem function,
*  directly referring to DeviceItem.Camera and DeviceItem.
* Lamp might not work as expected because DeviceItem.
* Camera and DeviceItem.Lamp are objects of DeviceItem
* class not directly comparable with instances of
* the ClickableItem interface in a when statement
* without a type check or smart cast.*/