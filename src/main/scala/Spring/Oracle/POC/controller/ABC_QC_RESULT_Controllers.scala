package Spring.Oracle.POC.controller

import Spring.Oracle.POC.SourceDB.model.{ABC_QC_Model, ABC_QC_RESULT_Model}
import Spring.Oracle.POC.SourceDB.repository.ABC_QC_RESULT_Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation._


@Bean
@RestController
@RequestMapping(Array("/abcqcresult"))
class ABC_QC_RESULT_Controllers(@Autowired aBC_QC_RESULT_Repository : ABC_QC_RESULT_Repository) {

  @GetMapping(Array(""))
  def wecomenote:String= return "To get all records use /get \nTo insert new record use /put\nTo get specific record by id /{id}\nTo delete specific record by id use /delete/{id} "


  @GetMapping(Array("/get"))
  def get_abc_qc = aBC_QC_RESULT_Repository.findAll

  @PutMapping(Array("/put"))
  def addRecord(@RequestBody record:ABC_QC_RESULT_Model) = aBC_QC_RESULT_Repository.save(record)

  @GetMapping(Array("/get/{id}"))
  def getrecord(@PathVariable id:Long) = aBC_QC_RESULT_Repository.findById(id)

  @DeleteMapping(Array("/delete/{id}"))
  def deleteabcqc(@PathVariable("id") id:Long) = aBC_QC_RESULT_Repository.deleteById(id)


//  @GetMapping(Array("test1"))
  //def test1 = aBC_QC_RESULT_Repository.test1
 /*
  @GetMapping(Array("/download"))
  def downloadFile1(response : HttpServletResponse):Unit  = {
    val filename = new FileWriter("users.csv")
    response.setContentType("text/csv")
    response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
    val writer: StatefulBeanToCsv[DestModel] = {
      new StatefulBeanToCsvBuilder[DestModel](response.getWriter)
        .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).withSeparator('\t').build()
    }
    writer.write(aBC_QC_RESULT_Repository.logic)
  }
*/


}
