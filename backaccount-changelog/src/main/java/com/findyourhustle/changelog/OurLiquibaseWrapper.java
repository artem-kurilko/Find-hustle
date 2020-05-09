package com.findyourhustle.changelog;

import java.sql.Connection;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.sql.DataSource;
import liquibase.Liquibase;
import liquibase.exception.LiquibaseException;
import liquibase.integration.spring.SpringLiquibase;
import liquibase.resource.ClassLoaderResourceAccessor;
import liquibase.resource.ResourceAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ResourceLoader;

public class OurLiquibaseWrapper extends SpringLiquibase {
   /* private static final Logger log = LoggerFactory.getLogger(OurLiquibaseWrapper.class);

    public OurLiquibaseWrapper(String databaseIdentity, DataSource dataSource) {
        String changelogFile = String.format("changelogs/%s/master.yml", databaseIdentity);
        this.setDataSource(dataSource);
        this.setChangeLog(changelogFile);
        this.setDropFirst(false);
        this.setShouldRun(true);
    }

    protected Liquibase createLiquibase(Connection c) throws LiquibaseException {
        ResourceAccessor resourceAccessor = new ClassLoaderResourceAccessor(this.getClass().getClassLoader());
        Liquibase liquibase = new Liquibase(this.getChangeLog(), resourceAccessor, this.createDatabase(c, resourceAccessor));
        liquibase.setIgnoreClasspathPrefix(this.isIgnoreClasspathPrefix());
        if (this.parameters != null) {
            Iterator var4 = this.parameters.entrySet().iterator();

            while(var4.hasNext()) {
                Entry<String, String> entry = (Entry)var4.next();
                liquibase.setChangeLogParameter((String)entry.getKey(), entry.getValue());
            }
        }

        return liquibase;
    }

    public void afterPropertiesSet() throws LiquibaseException {
        if (!this.exists()) {
            log.warn("*** Cannot find default changelog file for this service: '{}' ***", this.getChangeLog());
            this.setShouldRun(false);
        }

        super.afterPropertiesSet();
    }

    private boolean exists() {
        String firstAttempt = this.getChangeLog();
        log.debug("Trying changelog file={}", firstAttempt);
        ResourceLoader resourceLoader = this.getResourceLoader();
        boolean exists = resourceLoader.getResource(firstAttempt).exists();
        if (exists) {
            return true;
        } else {
            exists = resourceLoader.getResource("classpath:/" + firstAttempt).exists();
            return exists;
        }
    }

    public void apply() throws LiquibaseException {
        if (this.exists()) {
            log.info("Applying changelog={}", this.getChangeLog());
            this.afterPropertiesSet();
        }

    }*/
}
