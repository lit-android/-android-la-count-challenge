package app.myoji.nickname.countchallenge

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

        binding.countText.text = count.toString()

        binding.upButton.setOnClickListener {
            count++
            binding.countText.text = count.toString()
        }
    }
}