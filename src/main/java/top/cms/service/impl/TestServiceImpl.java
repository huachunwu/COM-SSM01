package top.cms.service.impl;

import org.springframework.stereotype.Service;
import top.cms.service.TestService;
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void save() {
        System.out.println("sds");
    }
}
