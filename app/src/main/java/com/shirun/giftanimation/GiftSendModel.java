package com.shirun.giftanimation;

public class GiftSendModel {

    private int giftCount;
    private String userAvatarRes;
    private String nickname;
    private String sig;
    private int giftRes;
    private String gift_id;
    private int star;
    private boolean isPlay;

    public boolean isPlay() {
        return isPlay;
    }

    public void setPlay(boolean play) {
        isPlay = play;
    }

    public GiftSendModel(int giftCount) {
        this.giftCount = giftCount;
    }

    public int getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(int giftCount) {
        this.giftCount = giftCount;
    }
    public void addGifCount(int gitCount){
        this.giftCount = getGiftCount() + gitCount;
    }

    public String getUserAvatarRes() {
        return userAvatarRes;
    }

    public void setUserAvatarRes(String userAvatarRes) {
        this.userAvatarRes = userAvatarRes;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public int getGiftRes() {
        return giftRes;
    }

    public void setGiftRes(int giftRes) {
        this.giftRes = giftRes;
    }

    public String getGift_id() {
        return gift_id;
    }

    public void setGift_id(String gift_id) {
        this.gift_id = gift_id;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public boolean equals(Object o) {
        GiftSendModel giftSendModel = (GiftSendModel)o;
        boolean equals = nickname.equals(giftSendModel.getNickname());
        if(equals == false){
            return equals;
        }
        return giftRes == giftSendModel.giftRes;
    }
}