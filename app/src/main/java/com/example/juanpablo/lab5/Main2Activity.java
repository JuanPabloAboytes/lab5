package com.example.juanpablo.lab5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button onButton =(Button)findViewById(R.id.button_on);
        onButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                try {

                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    camManager.setTorchMode(cameraId, true);

                }
                catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Cannot load camera module" , Toast.LENGTH_LONG).show();

                }


            }
        });

        Button offButton =(Button)findViewById(R.id.button_off);
        offButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                try {
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    camManager.setTorchMode(cameraId, false);

                }
                catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Cannot load camera module" , Toast.LENGTH_LONG).show();

                }

            }
        });


    }
    public void Enviar(View view) {
        Intent Target = new Intent(this, MainActivity.class);
        startActivity(Target);
    }
}
