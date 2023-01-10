package io.github.daodao.opslog.example.controller;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.daodao.opslog.core.annotation.Opslog;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

/**
 * 专门放置演示用的接口
 *
 * @author Roger_Luo
 */
@Slf4j
@Validated
@Tag(name = "测试")
@RestController
@RequestMapping(value = "/demo", produces = { MediaType.APPLICATION_JSON_VALUE })
public class DemoController {

  @Opslog
  @Operation(summary = "测试1",description = "测试1详情")
  @GetMapping("/t1")
  public String index() {
    return "index";
  }

}
