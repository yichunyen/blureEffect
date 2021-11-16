package yichunyen.trial.blureffect

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                applyBlur(p1)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // Do nothing.
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // Do nothing.
            }

        })
    }

    private fun applyBlur(progress: Int) {
        imageView.setRenderEffect(
            RenderEffect.createBlurEffect(
                progress.toFloat(),
                progress.toFloat(),
                Shader.TileMode.CLAMP
            )
        )
    }
}