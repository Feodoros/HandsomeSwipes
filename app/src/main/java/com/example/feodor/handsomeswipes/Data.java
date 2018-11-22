package com.example.feodor.handsomeswipes;

public class Data {


    private int drawableId;

    public Data(int drawableId) {
        this.drawableId = drawableId;
    }

    public int getImagePath() {
        return drawableId;
    }



    //Получваем картинку по ссылке из инета.
//    private String imagePath;
//
//    public Data(String imagePath ) {
//        this.imagePath = imagePath;
//    }
//    public String getImagePath() {
//        return imagePath;
//    }
}
