package Spring.Oracle.POC.configurations

import javax.persistence.EntityManagerFactory
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
import org.springframework.context.annotation.{Bean, Configuration, Primary}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.{JpaTransactionManager, LocalContainerEntityManagerFactoryBean}
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "SourceEntityManagerFactory",
  transactionManagerRef = "SourceTranctionsManager",basePackages = Array("Spring.Oracle.POC.SourceDB.repository"))
class sourceDBconf {
  @Primary
  @Bean(name = Array("SourceDataSource"))
  @ConfigurationProperties(prefix = "spring.datasource")
  def datasource : DataSource= DataSourceBuilder.create.build()

  @Primary
  @Bean(name = Array("SourceEntityManagerFactory"))
  def SourceEntityManagerFactory(builder : EntityManagerFactoryBuilder,@Qualifier("SourceDataSource") dataSource: DataSource ):LocalContainerEntityManagerFactoryBean
            = builder.dataSource(dataSource).packages("Spring.Oracle.POC.SourceDB.model").persistenceUnit("source").build()

  @Bean(name = Array("SourceTranctionsManager"))
  def SourceTranctionsManager(@Qualifier("SourceEntityManagerFactory") SourceEntityManagerFactory: EntityManagerFactory):PlatformTransactionManager
              = new JpaTransactionManager(SourceEntityManagerFactory)

}
