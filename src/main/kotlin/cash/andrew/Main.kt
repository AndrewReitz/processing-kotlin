package cash.andrew

import processing.core.PApplet

fun main(args: Array<String>) {
    PApplet.main(ProcessingApp::class.java)
}

class ProcessingApp : PApplet() {
    override fun settings() {
        size(300, 300)
    }

    override fun draw() {
        fill(255f, 0f, 255f)
        ellipse(width / 2f, height / 2f, height / 2f, height / 2f)
    }
}
