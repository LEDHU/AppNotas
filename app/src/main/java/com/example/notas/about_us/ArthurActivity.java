package com.example.notas.about_us;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.notas.R;
import android.view.Gravity;
import android.widget.TextView;

public class ArthurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arthur);

        TextView nameArthur = findViewById(R.id.name_arthur);
        TextView paragraphArthur = findViewById(R.id.paragraph_arthur);
        TextView contactArthur = findViewById(R.id.contact_arthur);

        nameArthur.setGravity(Gravity.CENTER);
        paragraphArthur.setGravity(Gravity.CENTER);
        contactArthur.setGravity(Gravity.FILL_HORIZONTAL);
    }
}