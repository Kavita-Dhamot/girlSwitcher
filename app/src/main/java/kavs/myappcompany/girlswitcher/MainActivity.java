package kavs.myappcompany.girlswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchGirl(View view){

        Log.i("info", "Button Pressed");

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.girl);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}