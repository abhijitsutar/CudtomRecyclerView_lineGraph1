package com.bold.customrecyclerview_3_assignment_graph

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet

class LineGraphView(
    context: Context,
    attributeSet: AttributeSet?
) : androidx.appcompat.widget.AppCompatImageView(context, attributeSet){
    constructor(context: Context): this(context, null)

    var values : Array<Int>? = null
        set(value) {
            field = value
            invalidate()
        }

    @SuppressLint("SuspiciousIndentation")
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        if (values == null) {
            return
        }

        val paint = Paint()
        paint.color = Color.BLACK
        paint.strokeWidth = 5f

        val perToHeight = height / 100
        var lineWidth = width / (values!!.size -1)

        for ((position, value) in values!!.withIndex()) {
            val x1 = position * lineWidth.toFloat()
            val y1 = height - perToHeight * value.toFloat()

            if (position < values!!.size - 1) {
                val x2 = (position + 1) * lineWidth.toFloat()
                val y2 = height - perToHeight * values!![position + 1].toFloat()

                canvas.drawLine(x1, y1, x2, y2, paint)

            }
        }
    }
}