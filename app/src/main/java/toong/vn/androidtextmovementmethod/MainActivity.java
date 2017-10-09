package toong.vn.androidtextmovementmethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textView);
        for (int i = 0; i < 1000; i++) {
            tv.append("dadsad");
        }

        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
