import http from "../http-common";

class tutorialServices{
    getAllTutorials(){
        return http.get("/tutorials");
    }
    get(id) {
    return http.get(`/tutorials/${id}`);
  }

  create(data) {
    return http.post("/tutorials", data);
  }

  update(id, data) {
    return http.put(`/tutorials/${id}`, data);
  }

  delete(id) {
    return http.delete(`/tutorials/${id}`);
  }
}

export default new tutorialServices();