package com.example.gitbasic_recyclerview_in_fragment

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.gitbasic_recyclerview_in_fragment.databinding.FragmentFragmetn1Binding
import kotlinx.android.synthetic.main.fragment_fragmetn1.view.*
import kotlinx.android.synthetic.main.mainalarm_raw.view.*

// 1. 매개변수 정의
class testAdapter(val context: Context, val message1: MutableList<String>, val viewBinding : FragmentFragmetn1Binding) : RecyclerView.Adapter<testAdapter.ViewHolder>(){

    // 3. 어떤 레이아웃을 뷰로 할 것인지 정의
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.mainalarm_raw, parent, false))
    }

    // 4. 리사이클러뷰에 넣을 아이템 갯수 선정
    override fun getItemCount(): Int {
        return message1.size
    }

    // 5. 해당 ViewHolder의 각 View에 대해 행동 정의하기
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // 각각의 textView에 텍스트 넣기
        holder.row_text1.text = message1[position]
        holder.row_button.setOnClickListener {
            Log.d("test2", "${message1[position]}")

            viewBinding.fragTextView.text = message1[position]
        }
}
    // 2. 뷰홀더 정의
    // 뷰홀더 안에 있는 각각의 view를 컨트롤 할 수 있게 만들어준다
class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val row_text1 = view.row_textView
    val row_button = view.row_button
}
}