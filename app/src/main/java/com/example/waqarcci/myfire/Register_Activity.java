package com.example.waqarcci.myfire;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register_Activity extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    EditText name, email, phone, password;
    Button btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        firebaseAuth =FirebaseAuth.getInstance();

        name = (EditText) findViewById(R.id.txtname);
        email = (EditText) findViewById(R.id.txtemail);
        phone = (EditText) findViewById(R.id.txtphone);
        password = (EditText) findViewById(R.id.txtpassword);
        btnreg = (Button) findViewById(R.id.btnregister);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserRegister();
            }
        });
    }
    private void UserRegister() {

        String  etemail,etpassword;

        etemail = email.getText().toString();
        etpassword = password.getText().toString();

        firebaseAuth.createUserWithEmailAndPassword(etemail,etpassword).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    Toast.makeText(Register_Activity.this,"Regestration Successfull",Toast.LENGTH_SHORT).show();
                }

                else {

                    Toast.makeText(Register_Activity.this,"Regestration not Successfull",Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}
