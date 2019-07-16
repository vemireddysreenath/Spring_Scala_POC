package Spring.Oracle.POC.SourceDB.model

import java.sql.Date

import javax.persistence.{Column, Entity, Id, Table}




@Entity
@Table(name = "abc_qc")
class ABC_QC_Model {
  /* Column names :
  DATABASE_TABLE_COLUMN_ID, ABC_QC_TYPE_ID, ABC_QC_ID, PROCESS_STEP_QC_CATEGORY_ID, CHECK_NAME, CHECK_DESCRIPTION, CHECK_ACTIVE_INDICATOR,
  , CHECK_SEQUENCE_NUMBER, CREATED_DATE, CREATED_BY, MODIFIED_BY, MODIFIED_DATE, EFFECTIVE_DATE, END_DATE, DOMAIN_ID

*/
  @Id
  var database_table_column_id :Long= _
  def getDatabase_table_column_id = database_table_column_id
  def setDatabase_table_column_id(database_table_column_id : Long) = this.database_table_column_id = database_table_column_id

  var abc_qc_type_id : Long = _
  def getAbc_qc_type_id = abc_qc_type_id
  def setAbc_qc_type_id(abc_qc_type_id : Long) = this.abc_qc_type_id = abc_qc_type_id


  //Joining Column
  @Column(name = "abc_qc_id")
  var abc_qc_id : Long = _
  def getAbc_qc_id = abc_qc_id
  def setAbc_qc_id(abc_qc_id : Long) = this.abc_qc_id = abc_qc_id

  var process_step_qc_category_id : Long = _
  def getProcess_step_qc_category_id = process_step_qc_category_id
  def setProcess_step_qc_category_id(process_step_qc_category_id : Long) = this.process_step_qc_category_id = process_step_qc_category_id

  var check_name : String = _
  def getCheck_name = check_name
  def setCheck_name(check_name : String) = this.check_name = check_name

  //CHECK_DESCRIPTION
  var check_description : String = _
  def getCheck_description = check_description
  def setCheck_description(check_description : String) = this.check_description = check_description

  var check_active_indicator : String = _
  def getCheck_active_indicator = check_active_indicator
  def setCheck_active_indicator(check_active_indicator : String) = this.check_active_indicator = check_active_indicator

  //CHECK_GROUP_NUMBER
  //var check_group_number : Long = _
  //def getCheck_group_number = check_group_number
  //def setCheck_group_number(check_group_number : Long) = this.check_group_number = check_group_number

  var check_sequence_number : Long = _
  def getCheck_sequence_number = check_sequence_number
  def setCheck_sequence_number(check_sequence_number : Long) = this.check_sequence_number = check_sequence_number

  var created_date : Date = _
  def getCreated_date = created_date
  def setCreated_date(created_date : Date) = this.created_date = created_date

  var created_by : String = _
  def getCreated_by = created_by
  def setCreated_by(created_by : String) = this.created_by = created_by

  var modified_by :String = _
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

  var domain_id : Long = _
  def getDomain_id = domain_id
  def setDomain_id(domain_id : Long) = this.domain_id = domain_id


//  @ManyToOne
//  @JoinColumn(name = "abc_qc_id", insertable = false, updatable = false,referencedColumnName = "abc_qc_id")
//  var abc_qc_result_model:ABC_QC_RESULT_Model = _
//  def setAbc_qc_result_model = abc_qc_result_model
//  def getAbc_qc_result_model(abc_qc_result_model : ABC_QC_RESULT_Model) = this.abc_qc_result_model = abc_qc_result_model

////

//  @OneToOne(fetch = FetchType.LAZY, cascade = Array(CascadeType.ALL))
//  private var abc_qc_result_model:Array[ABC_QC_RESULT_Model] = _
//  def setAbc_qc_result_model = abc_qc_result_model
//  def getAbc_qc_result_model(abc_qc_result_model : Array[ABC_QC_RESULT_Model]) = this.abc_qc_result_model = abc_qc_result_model


//  DATABASE_TABLE_COLUMN_ID, ABC_QC_TYPE_ID, ABC_QC_ID, PROCESS_STEP_QC_CATEGORY_ID, CHECK_NAME, CHECK_DESCRIPTION, CHECK_ACTIVE_INDICATOR,
//  CHECK_GROUP_NUMBER, CHECK_SEQUENCE_NUMBER, CREATED_DATE, CREATED_BY, MODIFIED_BY, MODIFIED_DATE, EFFECTIVE_DATE, END_DATE, DOMAIN_ID

//  def ABC_QC_Model(database_table_column_id:Long,abc_qc_type_id:Long,abc_qc_id:Long,process_step_qc_category_id:Long,
//                   check_name:String,check_description:String,check_active_indicator:String,check_sequence_number:Long,
//                   created_date:Date,created_by:String,modified_by:String,modified_date:Date,effective_date:Date,
//                   end_date:Date,domain_id:Long): Unit ={
//    this.database_table_column_id = database_table_column_id
//    this.abc_qc_type_id = abc_qc_type_id
//    this.abc_qc_id = abc_qc_id
//    this.process_step_qc_category_id = process_step_qc_category_id
//    this.check_name = check_name
//    this.check_description = check_description
//    this.check_active_indicator = check_active_indicator
//    this.check_sequence_number = check_sequence_number
//    this.created_date = created_date
//    this.created_by = created_by
//    this.modified_by = modified_by
//    this.modified_date = modified_date
//    this.effective_date = effective_date
//    this.end_date = end_date
//    this.domain_id = domain_id
//  }


}
