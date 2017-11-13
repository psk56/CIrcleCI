package eberdriver.app.com.circlecidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=new TextView(this);
        TextView textView1=new TextView(this);
        TextView textView2=new TextView(this);
        TextView textView4=new TextView(this);
        TextView textView5=new TextView(this);
        TextView textView6=new TextView(this);
        TextView textView7=new TextView(this);


    }
}
