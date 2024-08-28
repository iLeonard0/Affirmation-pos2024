package unipar.edu.utfpr.affirmation_pos2024

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import unipar.edu.utfpr.affirmation_pos2024.adapter.ItemAdapter
import unipar.edu.utfpr.affirmation_pos2024.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val myDataset = Datasource().loadAffirmation()

        recyclerView.adapter = ItemAdapter(this, myDataset)

    }
}