package org.lokeshdarla.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Bullet {
    private final String type;
    private final String texture;

    private Bullet(String type, String texture) {
        this.type = type;
        this.texture = texture;
    }

    public String getType() {
        return type;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "type='" + type + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }

    private static final Map<String,Bullet> bulletCache = new HashMap<>();

    public static Bullet getBullet(String type,String texture) {
        String key = type + "-" + texture;
        if (!bulletCache.containsKey(key)) {
            bulletCache.put(key, new Bullet(type, texture));
        }
        return bulletCache.get(key);
    }
}
