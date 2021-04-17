package com.example.xiheservice.service.serviceImp;

import cn.hutool.core.util.StrUtil;
import com.example.xiheservice.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String HellWorld() {
        return StrUtil.str("234");
    }
}
