package app.myoji.nickname.countchallenge

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.myoji.nickname.countchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    // カウント変数
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        setCountText()

        binding.upButton.setOnClickListener {
            count++
            setCountText()
        }
    }

    private fun setCountText() {
        binding.countText.text = count.toString()
        when (count % 2) {
            0 -> {
                binding.countText.setTextColor(Color.RED)
            }
            1 -> {
                binding.countText.setTextColor(Color.BLUE)
            }
         }
    }
}