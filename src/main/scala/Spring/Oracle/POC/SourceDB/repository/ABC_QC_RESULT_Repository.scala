package Spring.Oracle.POC.SourceDB.repository

import java.util

import Spring.Oracle.POC.SourceDB.model.ABC_QC_RESULT_Model
import org.springframework.data.jpa.repository.{JpaRepository, Query}

trait ABC_QC_RESULT_Repository extends JpaRepository[ABC_QC_RESULT_Model,Long] {

  @Query(value = "SELECT abc_qc_result.abc_qc_id," +
    "percentage_value," +
    "abc_qc.domain_id FROM abc_qc_result FULL JOIN abc_qc ON abc_qc.abc_qc_id = abc_qc_result.abc_qc_id", nativeQuery = true)
  def join: util.Collection[ABC_QC_RESULT_Model]


}
