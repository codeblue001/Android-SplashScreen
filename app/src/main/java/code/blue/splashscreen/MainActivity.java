package code.blue.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.rotate);
        TextView textView = findViewById(R.id.text);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotateanim);
        imageView.startAnimation(animation);

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.downanim);
        textView.startAnimation(animation1);
    }
}
