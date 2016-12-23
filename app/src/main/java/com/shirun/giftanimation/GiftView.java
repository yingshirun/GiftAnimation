package com.shirun.giftanimation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by ying on 2016/11/16.
 */

public class GiftView extends LinearLayout{
    GifManager gifManager1;
    private int viewCount = 1;

    public GiftView(Context context) {
        this(context, null);
    }

    public GiftView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GiftView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setViewCount(int viewCount) {
        if(viewCount<1){
            throw new IllegalArgumentException("viewCount 不能小于1");
        }
        this.viewCount = viewCount;
    }

    private void addGiftView(){
        for(int i=0; i<viewCount; i++){
            GiftFrameLayout giftFrameLayout = new GiftFrameLayout(getContext());
            giftFrameLayout.setVisibility(View.INVISIBLE);
            gifManager1.addView(giftFrameLayout);
            addView(giftFrameLayout);
        }
    }


    public void init(){
        gifManager1 = new GifManager();
        setOrientation(VERTICAL);
        addGiftView();
    }

    public void addGift(GiftSendModel model){
        gifManager1.addGift(model);
    }

}
