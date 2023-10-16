package ebubekir.tosun.ders14framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ebubekir.tosun.ders14framelayout.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.frameLayout3.setOnClickListener{
            binding.frameLayout2.visibility= View.VISIBLE
            binding.frameLayout3.visibility= View.INVISIBLE
            binding.frameLayout1.visibility= View.INVISIBLE
        }
        binding.frameLayout2.setOnClickListener{
            binding.frameLayout1.visibility= View.VISIBLE
            binding.frameLayout3.visibility= View.INVISIBLE
            binding.frameLayout2.visibility= View.INVISIBLE
        }
        binding.frameLayout1.setOnClickListener{
            binding.frameLayout3.visibility= View.VISIBLE
            binding.frameLayout2.visibility= View.INVISIBLE
            binding.frameLayout1.visibility= View.INVISIBLE
        }

    }
}