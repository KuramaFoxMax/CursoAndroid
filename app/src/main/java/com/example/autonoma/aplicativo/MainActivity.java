package com.example.autonoma.aplicativo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsu;
    EditText txtPass;
    EditText txtNom;
    EditText txtApell;
    RadioButton btnFe;
    RadioButton btnMas;
    Button btnGuar;
    EditText txtEMAIL;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsu = (EditText) findViewById(R.id.txtUsua);
        txtPass=(EditText)findViewById(R.id.txtPass);
        txtNom=(EditText)findViewById(R.id.txtNom);
        txtApell=(EditText)findViewById(R.id.txtApell);
        btnFe=(RadioButton)findViewById(R.id.btnFe);
        btnMas=(RadioButton)findViewById(R.id.btnMas);
        txtEMAIL=(EditText)findViewById(R.id.txtEMAIL);
        btnGuar=(Button)findViewById(R.id.btnGuardar);

        btnGuar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String sexoMensaje=" ";
                if(btnFe.isChecked()){
                    sexoMensaje= " Femenino ";

                }
                Toast.makeText(
                        MainActivity.this ,
                        txtUsu.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(
                        MainActivity.this ,
                        txtPass.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(
                        MainActivity.this ,
                        txtNom.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(
                        MainActivity.this ,
                        txtApell.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(
                        MainActivity.this ,
                        txtEMAIL.getText(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
