package com.example.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView computerMoveImage, playerMoveImage;
    Button rockButton, paperButton, scissorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computerMoveImage = findViewById(R.id.computerImage);
        playerMoveImage = findViewById(R.id.playerImage);

        rockButton = findViewById(R.id.rockButton);
        paperButton = findViewById(R.id.paperButton);
        scissorButton = findViewById(R.id.scissorsButton);

        rockButton.setOnClickListener(this);
        paperButton.setOnClickListener(this);
        scissorButton.setOnClickListener(this);
    }

    private void toast(String resultMessage) {
        Toast toast = Toast.makeText(getApplicationContext(), resultMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}
