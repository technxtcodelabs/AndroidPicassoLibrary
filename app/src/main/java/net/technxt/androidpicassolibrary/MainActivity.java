package net.technxt.androidpicassolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    Button loadBtn;
    Button rotateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = findViewById(R.id.imgView);
        loadBtn = findViewById(R.id.loadBtn);
        rotateBtn = findViewById(R.id.rotateBtn);

        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("http://technxt.net/img/paris.jpg").placeholder(R.drawable.ic_image_black_24dp).into(imgView);
            }
        });

        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("http://technxt.net/img/paris.jpg").rotate(90f).into(imgView);
            }
        });



    }
}
