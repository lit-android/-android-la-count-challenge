package app.myoji.nickname.countchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.myoji.nickname.countchallenge.databinding.ActivityTutorialBinding

class TutorialActivity : AppCompatActivity() {
    // バインディング変数

    private lateinit var binding: ActivityTutorialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityTutorialBinding.inflate(layoutInflater).apply { setContentView(this.root) }
    }
}
