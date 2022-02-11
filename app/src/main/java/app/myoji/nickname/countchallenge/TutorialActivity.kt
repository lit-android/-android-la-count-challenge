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
        val toTitleActivityIntent = Intent(this, TitleActivity::class.java)
        startActivity(toTitleActivityIntent)
        finish()
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, TutorialActivity::class.java)
        }
    }
}
