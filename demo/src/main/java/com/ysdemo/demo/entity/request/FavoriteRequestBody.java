package com.ysdemo.demo.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ysdemo.demo.entity.db.Item;

public class FavoriteRequestBody {

    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}

