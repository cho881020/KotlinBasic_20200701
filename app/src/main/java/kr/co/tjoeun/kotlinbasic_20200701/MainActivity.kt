package kr.co.tjoeun.kotlinbasic_20200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchBtn.setOnClickListener {

//            touchBtn이 눌리면 실행될 코드를 적는 {  }
            Toast.makeText(this, "터치 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()

        }

    }

}