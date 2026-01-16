package com.example.imageview;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;




public class MainActivity extends AppCompatActivity {
    private ImageView iVMAIN;
    private Random rand = new Random();
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iVMAIN = findViewById(R.id.iVMAIN);
        btn=findViewById(R.id.btn);

    }

    public void clicked(View view) {
        int random = rand.nextInt(3) + 1;
        if(random==1) {
            iVMAIN.setImageResource(R.drawable.squirtle);
            btn.setText("1");
        }
            else if(random == 2) {
            iVMAIN.setImageResource(R.drawable.bulbasaur);
            btn.setText("2");
        }
        else if(random == 3) {
            iVMAIN.setImageResource(R.drawable.charmander);
            btn.setText("3");
        }



    }
}

