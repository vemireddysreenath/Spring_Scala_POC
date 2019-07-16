package Spring.Oracle.POC.SourceDB.model

import java.sql.Date

import javax.persistence.{Column, Entity, Id, Table}



@Entity
@Table(name = "abc_qc_result")
class ABC_QC_RESULT_Model extends Serializable{
  /* Column name
  ABC_QC_RESULT_ID, ABC_QC_ID, PERCENTAGE_VALUE, SEVERITY_ID, PM_BATCH_ID, BATCH_RUN_NUMBER, SOURCE_RESULT_AMOUNT, RESULT_AMOUNT, DATA_MONTH,
  CREATED_DATE, CREATED_BY, MODIFIED_BY, MODIFIED_DATE, EFFECTIVE_DATE, END_DATE
*/
  @Id
  @Column(name = "ABC_QC_RESULT_ID")
  var abc_qc_result_id : Long = _
  def getAbc_qc_Result_id = abc_qc_result_id
  def setAbc_qc_Result_id(abc_qc_Result_id : Long) = this.abc_qc_result_id = abc_qc_Result_id

  @Column(name = "ABC_QC_ID")
  var abc_qc_id : Long = _
  def getAbc_qc_id = abc_qc_id
  def setAbc_qc_id(abc_qc_id : Long) = this.abc_qc_id = abc_qc_id

  var percentage_value : Long = _
  def getPercentage_value = percentage_value
  def setPercentage_value(percentage_value : Long) = this.percentage_value = percentage_value

  var severity_id : Long = _
  def getSeverity_id = severity_id
  def setSeverity_id(severity_id : Long) = this.severity_id = severity_id

  var pm_batch_id : Long = _
  def getPm_batch_id = pm_batch_id
  def setPm_batch_id(pm_batch_id : Long) = this.pm_batch_id = pm_batch_id

  var batch_run_number : Long = _
  def getBatch_run_number = batch_run_number
  def setBatch_run_number(batch_run_number : Long) = this.batch_run_number = batch_run_number

  var source_result_amount : Long = _
  def getSource_result_amount = source_result_amount
  def setSource_result_amount(source_result_amount : Long) = this.source_result_amount = source_result_amount

  var result_amount : Long = _
  def getResult_amount = result_amount
  def setResult_amount(result_amount : Long) = this.result_amount = result_amount

  //DATA_MONTH
  var data_month : Date = _
  def getData_month = data_month
  def setData_month(data_month : Date) = this.data_month = data_month

  var created_date : Date = _
  def getCreated_date = created_date
  def setCreated_date(created_date : Date) = this.created_date = created_date

  var created_by : String = _
  def getCreated_by = created_by
  def setCreated_by(created_by : String) = this.created_by = created_by

  var modified_by : String = _
  def getModified_by = modified_by
  def setModified_by(modified_by : String) = this.modified_by = modified_by

  var modified_date : Date = _
  def getModified_date = modified_date
  def setModified_date(modified_date : Date) = this.modified_date = modified_date

  var effective_date : Date = _
  def getEffective_date = effective_date
  def setEffective_date(effective_date : Date) = this.effective_date = effective_date

  var end_date : Date = _
  def getEnd_date = end_date
  def setEnd_date(end_date : Date) = this.end_date = end_date



//  ABC_QC_RESULT_ID, ABC_QC_ID, PERCENTAGE_VALUE, SEVERITY_ID, PM_BATCH_ID, BATCH_RUN_NUMBER, SOURCE_RESULT_AMOUNT, RESULT_AMOUNT, DATA_MONTH,
//  CREATED_DATE, CREATED_BY, MODIFIED_BY, MODIFIED_DATE, EFFECTIVE_DATE, END_DATE
//
//  def ABC_QC_RESULT_Model(abc_qc_result_id:Long,abc_qc_id:Long,percentage_value:Long,severity_id:Long,pm_batch_id:Long,
//                          batch_run_number:Long,source_result_amount:Long,
//                          result_amount:Long,data_month:Date,created_date:Date,created_by:String,
//                          modified_by:String,modified_date:Date,effective_date:Date,end_date:Date): Unit ={
//    this.abc_qc_result_id = abc_qc_result_id
//    this.abc_qc_id = abc_qc_id
//    this.percentage_value = percentage_value
//    this.severity_id = severity_id
//    this.pm_batch_id = pm_batch_id
//    this.batch_run_number = batch_run_number
//    this.source_result_amount = source_result_amount
//    this.result_amount = result_amount
//    this.data_month = data_month
//    this.created_date = created_date
//    this.created_by = created_by
//    this.modified_by = modified_by
//    this.modified_date = modified_date
//    this.effective_date = effective_date
//    this.end_date = end_date
//  }


//  @OneToMany(targetEntity = classOf[ABC_QC_Model], mappedBy = "abc_qc_id", orphanRemoval = false, fetch = FetchType.LAZY)
//  var abc_qc_result_model : util.Collection[ABC_QC_RESULT_Model] = _
//  def setAbc_qc_result_model = abc_qc_result_model
//  def getAbc_qc_result_model(abc_qc_result_model:util.Collection[ABC_QC_RESULT_Model]) = this.abc_qc_result_model = abc_qc_result_model


//  @OneToOne
//  @JoinColumn(name = "abc_qc_id",insertable = false, updatable = false)
//  var abc_qc_result_model : ABC_QC_RESULT_Model = _
//  def setAbc_qc_result_model = abc_qc_result_model
//  def getAbc_qc_result_model(abc_qc_result_model:ABC_QC_RESULT_Model) = this.abc_qc_result_model = abc_qc_result_model

}
