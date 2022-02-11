package app.myoji.nickname.countchallenge

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.myoji.nickname.countchallenge.databinding.ActivityTitleBinding

class TitleActivity : AppCompatActivity() {
    // バインディングクラスの変数
    private lateinit var binding: ActivityTitleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTitleBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        // 初回起動の確認
        if (isFirstLaunch()) {
            // TutorialActivityに遷移
            val toTutorialActivity = TutorialActivity.newIntent(this)
            startActivity(toTutorialActivity)

            // TitleActivityの終了
            finish()
        }

        // MainActivityに遷移
        binding.button.setOnClickListener {
            val toMainActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(toMainActivityIntent)
        }
    }

    private fun isFirstLaunch(): Boolean {
        val prefs = getSharedPreferences(
            TutorialActivity.SHARED_PREFERENCES_NAME,
            Context.MODE_PRIVATE
        )
        return prefs.getBoolean(TutorialActivity.FIRST_LAUNCH_KEY, true)
    }
}