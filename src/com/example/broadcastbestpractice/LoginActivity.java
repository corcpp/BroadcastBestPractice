package com.example.broadcastbestpractice;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
	
	private EditText accountEdit;
	
	private EditText passwordEdit;
	
	private Button login;
	
	@Override
	protected void onCreate(Bundle savedInstanceBundle){
		super.onCreate(savedInstanceBundle);
		setContentView(R.layout.login);
		accountEdit = (EditText) findViewById(R.id.accout);
		passwordEdit = (EditText) findViewById(R.id.password);
		login = (Button) findViewById(R.id.login);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String account = accountEdit.getText().toString();
				String password = passwordEdit.getText().toString();
				if(account.equals("admin") && password.equals("123456")){
					Intent intent = new Intent(LoginActivity.this, MainActivity.class);
					startActivity(intent);
					finish();
				}else{
					Toast.makeText(LoginActivity.this, "accout or password is invalid", 
							Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}