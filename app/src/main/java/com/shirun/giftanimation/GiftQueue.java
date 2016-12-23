package com.shirun.giftanimation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ying on 2016/11/14.
 * <p>
 * 礼物队列
 */

public class GiftQueue {
    Map<String, List<GiftSendModel>> queue;

    public GiftQueue() {
        queue = new LinkedHashMap<>();
    }


    public List<GiftSendModel> getList(String key) {
        return queue.get(key);
    }

    /**
     * 获取当前队列的第一个的礼物
     *
     * @return
     */
    public synchronized GiftSendModel removeTop() {
        GiftSendModel model = null;
        if (queue.size() > 0) {
            List<GiftSendModel> giftSendModels = getTopList();

            if (giftSendModels == null) {
                return model;
            }
            if (giftSendModels.size() > 0) {
                model = giftSendModels.remove(0);
            }
            if (giftSendModels.size() == 0) {
                queue.remove(model.getNickname());
            }
        }
        return model;
    }

    /**
     * 获取第一个添加礼物的用户的 礼物列表
     *
     * @return
     */
    private List<GiftSendModel> getTopList() {
        Set<String> strings = queue.keySet();
        for (String string : strings) {
            return queue.get(string);
        }
        return null;
    }

    /**
     * 添加一个礼物到队列
     *
     * @param model
     * @return
     */
    public synchronized void add(GiftSendModel model) {
        List<GiftSendModel> mapList = getList(model.getNickname());
        if (mapList == null) {
            //新来的用户添加到任务队列中
            List<GiftSendModel> l = new ArrayList<>();
            l.add(model);
            queue.put(model.getNickname(), l);
        } else {
            boolean isRepeat = false;
            for (GiftSendModel giftModel : mapList) {
                if (giftModel.getGiftRes() == model.getGiftRes()) {
                    //礼物相同时
                    giftModel.addGifCount(model.getGiftCount());
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat) {
                //没有重复 是一个新的礼物
                mapList.add(model);
            }
        }
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

}
