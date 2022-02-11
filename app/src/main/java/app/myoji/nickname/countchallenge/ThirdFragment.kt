package app.myoji.nickname.countchallenge

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.myoji.nickname.countchallenge.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    // クリックリスナー
    interface ClickListener {
        fun onClickButton()
    }

    // バインディング変数
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!
    private var listener: ClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            listener?.onClickButton()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? ClickListener
        if (listener == null) {
            throw ClassCastException("$context must implement ClickListener")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
