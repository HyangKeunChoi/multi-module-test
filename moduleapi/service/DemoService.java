package dev.toy.moduleapi.service;

import dev.toy.modulecommon.enums.CodeEnum;
import dev.toy.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService;

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        return "find";
    }
}
