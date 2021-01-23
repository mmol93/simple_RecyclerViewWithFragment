package com.example.gitbasic_recyclerview_in_fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gitbasic_recyclerview_in_fragment.databinding.FragmentFragmetn1Binding
import kotlinx.android.synthetic.main.fragment_fragmetn1.*

class fragmetn1 : Fragment() {
    lateinit var binder : FragmentFragmetn1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 1. 레이아웃 연결하기
        val view = inflater.inflate(R.layout.fragment_fragmetn1, null)
        // 2. 바인더 만들기
        binder = FragmentFragmetn1Binding.bind(view)
        return view
    }

    // 리스트의 경우 항상 갱신을 해야하기 때문에 onResume()에 설정한다
    override fun onResume() {
        super.onResume()
        val arg1 = mutableListOf<String>("항목1", "항목2", "항목3")
        Log.d("test1", arg1.toString())
        frag_recyclerView.layoutManager = LinearLayoutManager(requireContext())
        frag_recyclerView.adapter = testAdapter(requireContext(), arg1, binder)
    }
}