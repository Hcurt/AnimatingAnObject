package net.crimson.animatinganobject;

import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public boolean isMoving = false;
    private Random random = new Random();
    public AssignmentAnimationListener1 animation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        Button b = findViewById(R.id.toggle);
        animation = new AssignmentAnimationListener1(imageView);

        b.setOnClickListener(v->{
           animation.toggle();
        });
        imageView.setOnClickListener(v->{
           Log.i("CLICKED", "CLICKED");
        });
    }


}