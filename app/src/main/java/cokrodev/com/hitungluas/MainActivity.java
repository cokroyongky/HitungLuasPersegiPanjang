package cokrodev.com.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configuration Layout
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txt_luas);


        //Part Action Button Hitung
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double panjang = Double.valueOf(edtPanjang.getText().toString());
                    double lebar = Double.valueOf(edtLebar.getText().toString());
                    double hasil = panjang * lebar;
                    txtLuas.setText("Luas : "+hasil);

                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,"*Nilai tidak boleh kosong \n*Inputan harus berupa angka",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
