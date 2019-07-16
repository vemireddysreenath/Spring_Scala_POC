package Spring.Oracle.POC.controller

import Spring.Oracle.POC.DestDB.model.EDC_ABC_SUMMARY_Model
import Spring.Oracle.POC.DestDB.repository.EDC_ABC_SUMMARY_Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._


@RestController
@RequestMapping(Array("/edcabcsummary"))
class EDC_ABC_SUMMARY_Controllers(@Autowired eDC_ABC_SUMMARY_Repository: EDC_ABC_SUMMARY_Repository) {

  @GetMapping(Array(""))
  def wecomenote:String= return "Get all records use /get " +
    "\nInsert new record use /put" +
    "\nExecute logic use /logic" +
    "\nLoad the executed logic data to EDC_ABC_SUMMATY use /load" +
    "\nDelete all records use /truncate" +
    "\nDelete record by id use /delete/{id}"

  @GetMapping(Array("/get"))
  def getall=eDC_ABC_SUMMARY_Repository.findAll

  @PutMapping(Array("/put"))
  def addRecord(@RequestBody edcrecord:EDC_ABC_SUMMARY_Model) = eDC_ABC_SUMMARY_Repository.save(edcrecord)

  @GetMapping(Array("/logic"))
  def logic = eDC_ABC_SUMMARY_Repository.logic

  @PostMapping(Array("/load"))
  def load:String = {
   eDC_ABC_SUMMARY_Repository.logic.forEach(data => eDC_ABC_SUMMARY_Repository.load(data.rule_id,data.rule_name,data.rule_desc,
                        data.m1_total_count,data.m1_error_count,data.m2_total_count,data.m2_error_count,
                        data.m3_total_count,data.m3_error_count,data.m4_total_count,data.m4_error_count,
                        data.m5_total_count,data.m5_error_count,data.m6_total_count,data.m6_error_count))
    return "data transfer is completed based on logic"
  }

  @DeleteMapping(Array("/truncate"))
  def truncate:String={
    eDC_ABC_SUMMARY_Repository.deleteAllInBatch()
    return "All records are deleted from EDC_ABC_SUMMARY"
  }

  @DeleteMapping(Array("/delete/{id}"))
  def delete(@PathVariable id:Long):String={
    eDC_ABC_SUMMARY_Repository.deleteById(id)
    return s"$id record is delete from EDC_ABC_SUMMARY"
  }


}
