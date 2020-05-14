package com.example.uncledrew.wechatui;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText accountText;
    private  EditText pswText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        Button button = findViewById(R.id.login);
        accountText = findViewById(R.id.account_text);
        pswText = findViewById(R.id.psw_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(accountText.getText())&&!TextUtils.isEmpty(pswText.getText())){
                    String account = accountText.getText().toString();
                    String psw = pswText.getText().toString();
                    if(account.equals("123456")&&psw.equals("123456")){
                        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}
