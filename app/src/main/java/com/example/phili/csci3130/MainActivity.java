package com.example.phili.csci3130;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button validateBtn;
    private EditText enterPsw;
    private TextView showResult;
    private String myPsw;
    private int passedRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validateBtn = findViewById(R.id.button);
        enterPsw = findViewById(R.id.editText);
        showResult = findViewById(R.id.textView);


        // validate when submit
        validateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPsw = enterPsw.getText().toString();
                // validate
                passedRules = Validator.validatePassword(myPsw);
                //
                if(passedRules <= 3){
                    showResult.setText("Not strong!");
                } else if(passedRules == 4){
                    showResult.setText("Medium strong");
                } else if(passedRules == 5){
                    showResult.setText("Very strong");
                }
            }
        });



    }
}
