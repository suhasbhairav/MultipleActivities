package main.tempcon.com.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.greetings_text_view);
    }

    public void showGreetings(View view){

        String button_text;
        button_text = ((Button) view).getText().toString();

        if(button_text.equals("Open Second Activity")){
            //In android, we need to create an object of intent to start a new activity
            Intent intent  = new Intent(this,SecondActivity.class );
            startActivity(intent);
        }
        else if(button_text.equals("Open Third Activity")){

            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
    }
}
