import http from '../http-common'
class TutorialsService
{

    getALL(){
       return http.get("/tutorials/");
    }

    create(data) {
    return http.post("/tutorials", data);
  }

}


export default new TutorialsService;