package com.shirun.giftanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    GiftView giftView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giftView = (GiftView) findViewById(R.id.giftView);
        giftView.setViewCount(2);
        giftView.init();
    }

    public void user1(View view) {
        GiftSendModel giftSendModel = new GiftSendModel(1);
        String s = ((Button) view).getText().toString();
        giftSendModel.setNickname(s);
        giftView.addGift(giftSendModel);
    }

    public void user2(View view) {
        GiftSendModel giftSendModel = new GiftSendModel(1);
        String s = ((Button) view).getText().toString();
        giftSendModel.setNickname(s);
        giftView.addGift(giftSendModel);
    }

    public void user3(View view) {
        GiftSendModel giftSendModel = new GiftSendModel(1);
        String s = ((Button) view).getText().toString();
        giftSendModel.setNickname(s);
        giftView.addGift(giftSendModel);
    }

    public void user4(View view) {
        GiftSendModel giftSendModel = new GiftSendModel(1);
        String s = ((Button) view).getText().toString();
        giftSendModel.setNickname(s);
        giftView.addGift(giftSendModel);

    }

}
