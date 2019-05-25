package lwkge

class RGBA(var red: Double, var green: Double, var blue: Double, var alpha: Double = 1.0) {
    init {
        this.red = if (red > 1) red/255 else red
        this.green = if (green > 1) green/255 else green
        this.blue = if (blue > 1) blue/255 else blue
        this.alpha = if (alpha > 1) alpha/255 else alpha
    }
}
data class window(val id: Int, var width: Int, var height: Int, var bgColor: RGBA)

fun initializeGLFW(){

}
