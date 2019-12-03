package co.g2lab.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import co.g2lab.oop.model.Nasabah;

public class MainActivity extends AppCompatActivity {
    private Nasabah nasabah;
    private EditText namaEditText,alamatEditText, passwordEditText, tokenEditText, saldoEditText;
    private TextView namaTextView,alamatTextView, passwordTextView, tokenTextView, saldoTextView, aktifTextView;
    private TextView refreshTextView;
    private Button setNamaButton,setAlamatButton, setPasswordButton, setTokenButton, setSaldoButton, resetPasswordButton, promoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nasabah = new Nasabah();
        findViewById();
        onClickGroup();
        refreshTextView.callOnClick();
    }
    void findViewById(){
        namaEditText = (EditText) findViewById(R.id.namaEditText);
        alamatEditText = (EditText) findViewById(R.id.alamatEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        tokenEditText = (EditText) findViewById(R.id.tokenEditText);
        saldoEditText = (EditText) findViewById(R.id.saldoEditText);

        namaTextView = (TextView) findViewById(R.id.namaTextView);
        alamatTextView = (TextView) findViewById(R.id.alamatTextView);
        passwordTextView = (TextView) findViewById(R.id.passwordTextView);
        tokenTextView = (TextView) findViewById(R.id.tokenTextView);
        saldoTextView = (TextView) findViewById(R.id.saldoTextView);
        aktifTextView = (TextView) findViewById(R.id.aktifTextView);

        setNamaButton = (Button) findViewById(R.id.setNamaButton);
        setAlamatButton = (Button) findViewById(R.id.setAlamatButton);
        setPasswordButton = (Button) findViewById(R.id.setPasswordButton);
        setTokenButton = (Button) findViewById(R.id.setTokenButton);
        setSaldoButton = (Button) findViewById(R.id.setSaldoButton);

        refreshTextView = (TextView) findViewById(R.id.refreshTextView);
        resetPasswordButton = (Button) findViewById(R.id.resetPasswordButton);
        promoButton = (Button) findViewById(R.id.promoButton);

    }
    void onClickGroup(){
        refreshTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaTextView.setText("Nama : "+nasabah.getNama());
                alamatTextView.setText("Alamat : "+nasabah.getAlamat());
                passwordTextView.setText("Password : "+nasabah.getPassword());
                tokenTextView.setText("Token :"+nasabah.getToken());
                saldoTextView.setText("Saldo : "+nasabah.getSaldo().toString());
                aktifTextView.setText("Aktif : "+nasabah.getAktif().toString());

            }
        });
        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nasabah.setPassword("12345678");
            }
        });
        promoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nasabah.setSaldo( nasabah.getSaldo() + new Double(100000));
            }
        });
        setNamaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nasabah.setNama(namaEditText.getText().toString());
            }
        });
        setAlamatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nasabah.setAlamat(alamatEditText.getText().toString());
            }
        });
        setPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nasabah.setPassword(passwordEditText.getText().toString());
            }
        });
        setTokenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nasabah.setToken(tokenEditText.getText().toString());
            }
        });
        setSaldoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nasabah.setSaldo(new Double(saldoEditText.getText().toString()));
            }
        });

    }
}
