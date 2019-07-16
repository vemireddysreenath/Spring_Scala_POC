package Spring.Oracle.POC.DestDB.model

import javax.persistence.{Entity, Id, Table}
import org.springframework.context.annotation.Bean

@Bean
@Entity
@Table(name = "edc_abc_summary")
class EDC_ABC_SUMMARY_Model {
  @Id
  var rule_id :Long= _
  def getRule_id = rule_id
  def setRule_id(rule_id : Long) = this.rule_id = rule_id

  var rule_name : String = _
  def getRule_name = rule_name
  def setRule_name(rule_name : String) = this.rule_name = rule_name

  var rule_desc : String = _
  def getRule_desc = rule_desc
  def setRule_desc(rule_desc : String) = this.rule_desc = rule_desc

  var m1_total_count :Long= _
  def getM1_total_count = m1_total_count
  def setM1_total_count(m1_total_count : Long) = this.m1_total_count = m1_total_count

  var m1_error_count :Long= _
  def getM1_error_count = m1_error_count
  def setM1_error_count(m1_error_count : Long) = this.m1_error_count = m1_error_count

  var m2_total_count :Long= _
  def getM2_total_count = m2_total_count
  def setM2_total_count(m2_total_count : Long) = this.m2_total_count = m2_total_count

  var m2_error_count :Long= _
  def getM2_error_count = m2_error_count
  def setM2_error_count(m2_error_count : Long) = this.m2_error_count = m2_error_count

  var m3_total_count :Long= _
  def getM3_total_count = m3_total_count
  def setM3_total_count(m3_total_count : Long) = this.m3_total_count = m3_total_count

  var m3_error_count :Long= _
  def getM3_error_count = m3_error_count
  def setM3_error_count(m3_error_count : Long) = this.m3_error_count = m3_error_count

  var m4_total_count :Long= _
  def getM4_total_count = m4_total_count
  def setM4_total_count(m4_total_count : Long) = this.m4_total_count = m4_total_count

  var m4_error_count :Long= _
  def getM4_error_count = m4_error_count
  def setM4_error_count(m4_error_count : Long) = this.m4_error_count = m4_error_count

  var m5_total_count :Long= _
  def getM5_total_count = m5_total_count
  def setM5_total_count(m5_total_count : Long) = this.m5_total_count = m5_total_count

  var m5_error_count :Long= _
  def getM5_error_count = m5_error_count
  def setM5_error_count(m5_error_count : Long) = this.m5_error_count = m5_error_count

  var m6_total_count :Long= _
  def getM6_total_count = m6_total_count
  def setM6_total_count(m6_total_count : Long) = this.m6_total_count = m6_total_count

  var m6_error_count :Long= _
  def getM6_error_count = m6_error_count
  def setM6_error_count(m6_error_count : Long) = this.m6_error_count = m6_error_count

}
