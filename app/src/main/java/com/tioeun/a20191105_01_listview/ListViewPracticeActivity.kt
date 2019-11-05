package com.tioeun.a20191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tioeun.a20191105_01_listview.datas.PostData

class ListViewPracticeActivity : AppCompatActivity() {
    
    var postList = ArrayList<PostData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_practice)

        addPost()
    }

    fun addPost(){
        postList.add(PostData("1번쨰 글입니다.", "내용을 1번째로 적습니다."))
        postList.add(PostData("2번쨰 글입니다.", "내용을 2번째로 적습니다."))
        postList.add(PostData("3번쨰 글입니다.", "내용을 3번째로 적습니다."))
        postList.add(PostData("4번쨰 글입니다.", "내용을 4번째로 적습니다."))
        postList.add(PostData("5번쨰 글입니다.", "내용을 5번째로 적습니다."))
        postList.add(PostData("6번쨰 글입니다.", "내용을 6번째로 적습니다."))
        postList.add(PostData("7번쨰 글입니다.", "내용을 7번째로 적습니다."))
        postList.add(PostData("8번쨰 글입니다.", "내용을 8번째로 적습니다."))
        postList.add(PostData("9번쨰 글입니다.", "내용을 9번째로 적습니다."))
        postList.add(PostData("10번쨰 글입니다.", "내용을 10번째로 적습니다."))
        postList.add(PostData("11번쨰 글입니다.", "내용을 11번째로 적습니다."))

    }
}
