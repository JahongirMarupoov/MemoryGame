package uz.gita.a5.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.a5.mymemorygame.databinding.ActivityHomeworkBinding

class HomeworkActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityHomeworkBinding::bind)
    private var opened = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework)

        binding.addBtn.setOnClickListener {
            if (opened) {
                close()
            } else
                open()
        }
    }

    fun open() {

        binding.profile.animate()
            .withStartAction {
                binding.addBtn.isClickable = false
            }
            .withEndAction {
                binding.addBtn.isClickable = true
            }
            .setDuration(1000)
            .yBy(-450f)

            .start()

        binding.addBtn.animate()
            .setDuration(1000)
            .rotation(-45f)
            .start()

        binding.message.animate()
            .setDuration(1000)
            .yBy(-300f)

            .start()
        binding.call.animate()

            .setDuration(1000)
            .yBy(-150f)

            .start()

        opened = true
    }

    fun close() {

        binding.profile.animate()
            .withStartAction {
                binding.addBtn.isClickable = false
            }
            .withEndAction {
                binding.addBtn.isClickable = true
            }
            .setDuration(1000)
            .yBy(450f)
            .start()
        binding.addBtn.animate()
            .setDuration(1000)
            .rotation(0f)
            .start()
        binding.message.animate()
            .setDuration(1000)
            .yBy(300f)
            .start()
        binding.call.animate()
            .setDuration(1000)
            .yBy(150f)
            .start()

        opened = false
    }
}