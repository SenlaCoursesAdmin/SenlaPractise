package SenlaPractise.SenlaPractiseZad1.dao;

import SenlaPractise.SenlaPractiseZad1.entity.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HistoryDao {
    MongoTemplate template;

    @Autowired
    public HistoryDao(MongoTemplate template) {
        this.template = template;
    }

    public void insertHistory(History history){
        template.save(history);
    }

    public List<History> selectAll(){
        return template.findAll(History.class);
    }
}
