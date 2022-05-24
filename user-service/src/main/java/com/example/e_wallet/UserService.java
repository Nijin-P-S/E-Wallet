package com.example.e_wallet;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserCacheRepository userCacheRepository;

    UserService(UserRepository userRepository,
                UserCacheRepository userCacheRepository){
        this.userRepository = userRepository;
        this.userCacheRepository = userCacheRepository;
    }


    public void createUser(UserCreateRequest userCreateRequest){
        User user = userCreateRequest.to();
        //Since in UserCreateRequest we are not saving Id, so every addition to cache will just override it with id as 0
        user = userRepository.save(user);
        userCacheRepository.save(user);
    }

}
