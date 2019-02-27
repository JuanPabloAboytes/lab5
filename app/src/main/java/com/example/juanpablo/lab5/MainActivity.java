package com.example.juanpablo.lab5;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.vibrarId);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Vibrator vibrator=(Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);

            }
        });
    }

        public void Enviar(View view) {
            Intent Target = new Intent(this, Main2Activity.class);
            startActivity(Target);
        }
}
