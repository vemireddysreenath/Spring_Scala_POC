package Spring.Oracle.POC.SourceDB.repository

import Spring.Oracle.POC.SourceDB.model.ABC_QC_Model
import org.springframework.data.jpa.repository.{JpaRepository, Query}

trait ABC_QC_Repository extends JpaRepository[ABC_QC_Model,Long]{


  @Query(value = "select * from abc_qc where abc_qc_id >= :id",nativeQuery = true)
  def filterByAbc_Qc_Id(id:Int):Array[ABC_QC_Model]



}
