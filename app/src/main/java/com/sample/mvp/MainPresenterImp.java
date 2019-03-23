package com.sample.mvp;

public class MainPresenterImp implements MainPresenter{

    MainView mainView;

    public MainPresenterImp(MainView mainView) {

        this.mainView = mainView;

    }

    @Override
    public void hitung(Double panjang, Double lebar) {
        Double luas = panjang * lebar;
        mainView.hasil(luas);
    }

    @Override
    public void hitungKeliling(Double panjang, Double lebar) {
        Double keliling = 2*(panjang + lebar);
        mainView.hasilKeliling(keliling);
    }
}
