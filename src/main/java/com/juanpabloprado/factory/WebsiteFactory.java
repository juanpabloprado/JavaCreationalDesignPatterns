package com.juanpabloprado.factory;

import static com.juanpabloprado.factory.WebsiteType.BLOG;
import static com.juanpabloprado.factory.WebsiteType.SHOP;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
