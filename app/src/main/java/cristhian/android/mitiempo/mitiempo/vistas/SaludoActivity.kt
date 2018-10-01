package cristhian.android.mitiempo.mitiempo.vistas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import cristhian.android.mitiempo.mitiempo.R

class SaludoActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSaludoTV: TextView
    private lateinit var mSaludoET: EditText
    private lateinit var mSaludoBT: Button
    private lateinit var mTiempoIV: ImageView


    override fun onClick(v: View?) {

        when(v?.id){
            mSaludoBT.id -> {
                mSaludoTV.text = mSaludoET.text.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        initViews()
    }

    fun initViews(){
        mSaludoTV = findViewById(R.id.textView1)
        mSaludoET = findViewById(R.id.LayoutNuevoNombre)
        mSaludoBT = findViewById(R.id.button)
        mTiempoIV = findViewById(R.id.imageView)

        mSaludoBT.setOnClickListener(this)
    }
}
