package com.sample.mvp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {
    TextView hasil;
    EditText panjang, lebar;
    MainPresenterImp presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil = findViewById(R.id.TV_Hasil);
        panjang = findViewById(R.id.ET_Panjang);
        lebar = findViewById(R.id.ET_Lebar);

        initPresenter();
    }

    private void initPresenter() {
        presenter = new MainPresenterImp(this);
    }

    public void BTN_Hitung(View view) {
        Double pjg = Double.valueOf(panjang.getText().toString());
        Double lbr = Double.valueOf(lebar.getText().toString());

        presenter.hitung(pjg, lbr);
    }



    @SuppressLint("SetTextI18n")
    @Override
    public void hasil(Double luas) {
        hasil.setText(luas.toString());
    }
}
