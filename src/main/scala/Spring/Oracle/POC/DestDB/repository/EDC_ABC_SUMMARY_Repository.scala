package Spring.Oracle.POC.DestDB.repository

import java.util

import Spring.Oracle.POC.DestDB.model.EDC_ABC_SUMMARY_Model
import org.springframework.data.jpa.repository.{JpaRepository, Modifying, Query}
import org.springframework.transaction.annotation.Transactional

trait EDC_ABC_SUMMARY_Repository extends JpaRepository[EDC_ABC_SUMMARY_Model,Long]{

  @Query(value = "select a.abc_qc_id rule_id,check_name rule_name,check_description rule_desc," +
    "sum(case data_month when to_date('11/01/2018','mm/dd/yyyy') then SOURCE_RESULT_AMOUNT else 0 end) as m1_total_count, " +
    "sum(case data_month when to_date('11/01/2018','mm/dd/yyyy') then RESULT_AMOUNT else 0 end) as m1_error_count," +
    "sum(case data_month when to_date('12/01/2018','mm/dd/yyyy') then SOURCE_RESULT_AMOUNT else 0 end) as m2_total_count," +
    "sum(case data_month when to_date('12/01/2018','mm/dd/yyyy') then RESULT_AMOUNT else 0 end) as m2_error_count," +
    "sum(case data_month when to_date('01/01/2019','mm/dd/yyyy') then SOURCE_RESULT_AMOUNT else 0 end) as m3_total_count," +
    "sum(case data_month when to_date('01/01/2019','mm/dd/yyyy') then RESULT_AMOUNT else 0 end) as m3_error_count," +
    "sum(case data_month when to_date('02/01/2019','mm/dd/yyyy') then SOURCE_RESULT_AMOUNT else 0 end) as m4_total_count," +
    "sum(case data_month when to_date('02/01/2019','mm/dd/yyyy') then RESULT_AMOUNT else 0 end) as m4_error_count," +
    "sum(case data_month when to_date('03/01/2019','mm/dd/yyyy') then SOURCE_RESULT_AMOUNT else 0 end) as m5_total_count," +
    "sum(case data_month when to_date('03/01/2019','mm/dd/yyyy') then RESULT_AMOUNT else 0 end) as m5_error_count," +
    "sum(case data_month when to_date('04/01/2019','mm/dd/yyyy') then SOURCE_RESULT_AMOUNT else 0 end) as m6_total_count," +
    "sum(case data_month when to_date('04/01/2019','mm/dd/yyyy') then RESULT_AMOUNT else 0 end) as m6_error_count " +
    " from " +
    " abc_qc_result r, abc_qc a " +
    " where " +
    " r.abc_qc_id = a.abc_qc_id and r.CREATED_DATE in " +
    " (  (SELECT MAX(RES.CREATED_DATE) FROM ABC_QC_RESULT RES WHERE RES.ABC_QC_ID = r.ABC_QC_ID GROUP BY RES.ABC_QC_ID, RES.DATA_MONTH)) and " +
    " data_month >= to_date('11/01/2018','mm/dd/yyyy') and a.abc_qc_id in (106975) " +
    " group by " +
    " check_name, check_description, a.abc_qc_id ",nativeQuery = true)
  def logic:util.Collection[EDC_ABC_SUMMARY_Model]

  @Modifying
  @Transactional
  @Query(value = "insert into edc_abc_summary values(:rule_id,:check_name,:rule_desc," +
    ":m1_total_count,:m1_error_count," +
    ":m2_total_count,:m2_error_count," +
    ":m3_total_count,:m3_error_count," +
    ":m4_total_count,:m4_error_count," +
    ":m5_total_count,:m5_error_count," +
    ":m6_total_count,:m6_error_count)",nativeQuery = true)
  def load(rule_id:Long,check_name:String,rule_desc:String,
           m1_total_count:Long,m1_error_count:Long,
           m2_total_count:Long,m2_error_count:Long,
           m3_total_count:Long,m3_error_count:Long,
           m4_total_count:Long,m4_error_count:Long,
           m5_total_count:Long,m5_error_count:Long,
           m6_total_count:Long,m6_error_count:Long)

  @Query(value = "select  DATABASE_TABLE_COLUMN_ID, ABC_QC_TYPE_ID, ABC_QC_ID, PROCESS_STEP_QC_CATEGORY_ID, CHECK_NAME, CHECK_DESCRIPTION, CHECK_ACTIVE_INDICATOR" +
    "  , CHECK_SEQUENCE_NUMBER, CREATED_DATE, CREATED_BY, MODIFIED_BY, MODIFIED_DATE, EFFECTIVE_DATE, END_DATE, DOMAIN_ID from abc_qc",nativeQuery = true)
  def test1:util.Collection[Object]


}
