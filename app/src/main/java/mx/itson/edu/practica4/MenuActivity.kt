package mx.itson.edu.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

       // var imgA: ImageView= findViewById(R.id.imagenView) as ImageView

        var btnAntojitos: Button= findViewById(R.id.antojitos) as Button
        var btnEspecialdades: Button= findViewById(R.id.especialidades) as Button
        var btncombinations: Button= findViewById(R.id.combinations) as Button
        var btnTortas: Button= findViewById(R.id.tortas) as Button
        var btnSopas: Button= findViewById(R.id.sopas) as Button
        var btnDrinks: Button= findViewById(R.id.drinks) as Button




        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
            //imgA.setImageResource(R.drawable.antojitos)

        }
    }
}