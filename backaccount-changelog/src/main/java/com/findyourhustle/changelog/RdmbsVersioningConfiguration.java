package com.findyourhustle.changelog;

import java.util.Arrays;
import java.util.Optional;
import javax.sql.DataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@ConditionalOnClass({SpringLiquibase.class})
@AutoConfigureAfter({DataSourceAutoConfiguration.class})
@AutoConfigureBefore({LiquibaseAutoConfiguration.class})
public class RdmbsVersioningConfiguration {
    /*private static final Logger log = LoggerFactory.getLogger(RdmbsVersioningConfiguration.class);

    @Autowired
    ApplicationContext applicationContext;

    public RdmbsVersioningConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean({SpringLiquibase.class})
    public SpringLiquibase liquibase() {
        Optional<String> databaseIdentity = this.getDatabaseNameBasedOnMainClass();
        if (databaseIdentity.isPresent()) {
            DataSource primaryDatasource = (DataSource)this.applicationContext.getBean(DataSource.class);
            log.info("Configuring database versioning for primary datasource: {}", primaryDatasource);
            return new OurLiquibaseWrapper((String)databaseIdentity.get(), primaryDatasource);
        } else {
            log.warn("**** Database identity cannot be discovered. Disabling Liquibase ****");
            SpringLiquibase dummy = new SpringLiquibase();
            dummy.setShouldRun(false);
            return dummy;
        }
    }

    public Optional<String> getDatabaseNameBasedOnMainClass() {
        String[] beanDefinitionNames = this.applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanDefinitionNames);
        String[] var2 = beanDefinitionNames;
        int var3 = beanDefinitionNames.length;

        int var4;
        String s;
        for(var4 = 0; var4 < var3; ++var4) {
            s = var2[var4];
            if (s.endsWith("Main") || s.endsWith("Application")) {
                String[] path = this.applicationContext.getBean(s).getClass().getPackage().getName().split("\\.");
                return Optional.of(path[path.length - 1]);
            }
        }

        var2 = beanDefinitionNames;
        var3 = beanDefinitionNames.length;

        for(var4 = 0; var4 < var3; ++var4) {
            s = var2[var4];
            if (s.endsWith("Configuration")) {
                Class<?> beanClass = this.applicationContext.getBean(s).getClass();
                if (beanClass.getName().startsWith("com.findyourhustle")) {
                    String[] path = beanClass.getPackage().getName().split("\\.");
                    log.info("Probably we're in test context. Guessing that '{}' is our identity", path[2]);
                    return Optional.of(path[2]);
                }
            }
        }

        return Optional.empty();
    }

    static {
        System.setProperty("org.jboss.logging.provider", "slf4j");
    }*/
}
