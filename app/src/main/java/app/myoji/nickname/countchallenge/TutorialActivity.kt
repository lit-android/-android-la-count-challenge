package app.myoji.nickname.countchallenge

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import app.myoji.nickname.countchallenge.databinding.ActivityTutorialBinding

class TutorialActivity : AppCompatActivity(), ThirdFragment.ClickListener {
    // バインディング変数
    private lateinit var binding: ActivityTutorialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityTutorialBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        binding.viewPager.adapter = SlidePagerAdapter(this)
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

    inner class SlidePagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {

        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> FirstFragment()
                1 -> SecondFragment()
                2 -> ThirdFragment()
                else -> throw Exception()
            }
        }
    }

    override fun onClickButton() {
        // 初回起動のフラグの更新
        val prefs = getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.putBoolean(FIRST_LAUNCH_KEY, false)
        editor.apply()

        // TitleActivityに遷移
        val toTitleActivityIntent = Intent(this, TitleActivity::class.java)
        startActivity(toTitleActivityIntent)

        // TutorialActivityの終了
        finish()
    }

    companion object {
        const val SHARED_PREFERENCES_NAME = "Tutorial"
        const val FIRST_LAUNCH_KEY = "first"

        fun newIntent(context: Context): Intent {
            return Intent(context, TutorialActivity::class.java)
        }
    }
}
