package Spring.Oracle.POC.configurations

import javax.persistence.EntityManagerFactory
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.{JpaTransactionManager, LocalContainerEntityManagerFactoryBean}
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "DestEntityManagerFactory",
                transactionManagerRef = "DestTranctionsManager",basePackages = Array("Spring.Oracle.POC.DestDB.repository"))
class DestDBconf {

  @Bean(name = Array("DestDataSource"))
  @ConfigurationProperties(prefix = "dest.datasource")
  def datasource : DataSource= DataSourceBuilder.create.build()

  @Bean(name = Array("DestEntityManagerFactory"))
  def DestEntityManagerFactory(builder : EntityManagerFactoryBuilder,@Qualifier("DestDataSource") dataSource: DataSource ):LocalContainerEntityManagerFactoryBean
            = builder.dataSource(dataSource).packages("Spring.Oracle.POC.DestDB.model").persistenceUnit("dest").build()

  @Bean(name = Array("DestTranctionsManager"))
  def DestTranctionsManager(@Qualifier("DestEntityManagerFactory") DestEntityManagerFactory: EntityManagerFactory):PlatformTransactionManager
              = new JpaTransactionManager(DestEntityManagerFactory)

}
