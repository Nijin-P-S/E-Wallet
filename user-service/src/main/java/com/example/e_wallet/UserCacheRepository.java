package com.example.e_wallet;

import org.springframework.data.redis.core.RedisTemplate;

public class UserCacheRepository{

    private final RedisTemplate<String, Object> redisTemplate;

    UserCacheRepository(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    private static final String KEY_PREFIX = "user::";

    public void save(User user){
        redisTemplate.opsForValue().set(getKey(user.getId()) , user);
    }

    private String getKey(int id){
        return KEY_PREFIX+id;
    }
}
