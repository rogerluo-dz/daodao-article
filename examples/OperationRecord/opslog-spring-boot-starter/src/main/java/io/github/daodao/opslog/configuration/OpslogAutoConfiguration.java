package io.github.daodao.opslog.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.daodao.opslog.core.OpslogParser;
import io.github.daodao.opslog.core.function.BaseCustomFunction;
import io.github.daodao.opslog.core.function.ICustomFunction;
import io.github.daodao.opslog.core.operator.IOperatorService;
import io.github.daodao.opslog.core.persist.IResultPersistor;

/**
 * opslog configuration
 *
 * @author Roger_Luo
 *
 */
@Configuration
@EnableConfigurationProperties({ OpslogProperties.class })
@ConditionalOnProperty(prefix = OpslogProperties.PROPERTIES_PREFIX, name = OpslogProperties.PROPERTIES_ENABLED_NAME, havingValue = "true", matchIfMissing = true)
public class OpslogAutoConfiguration {

  private OpslogProperties properties;

  @Bean
  public OpslogParser opslogParser(IOperatorService operatorService, IResultPersistor resultPersistor) {
    return new OpslogParser(operatorService, resultPersistor);
  }

  @Bean
  @ConditionalOnMissingBean(ICustomFunction.class)
  public ICustomFunction customFunction() {
    return new BaseCustomFunction() {
    };
  }

  @Bean
  @ConditionalOnMissingBean(IOperatorService.class)
  public IOperatorService operatorService() {
    return new IOperatorService() {
    };
  }

  @Bean
  @ConditionalOnMissingBean(IResultPersistor.class)
  public IResultPersistor resultPersistor() {
    return new IResultPersistor() {
    };
  }
}
