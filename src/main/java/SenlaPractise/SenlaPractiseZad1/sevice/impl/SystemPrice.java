package SenlaPractise.SenlaPractiseZad1.sevice.impl;

import SenlaPractise.SenlaPractiseZad1.dao.HistoryDao;
import SenlaPractise.SenlaPractiseZad1.entity.History;
import SenlaPractise.SenlaPractiseZad1.sevice.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@org.springframework.stereotype.Service
public class SystemPrice implements Service {
    HistoryDao historyDao;

    @Autowired
    public SystemPrice(HistoryDao historyDao) {
        this.historyDao = historyDao;
    }

    @Override
    public void addHistory(History history) {
        historyDao.insertHistory(history);
    }

    @Override
    public List<History> showAll() {
        return historyDao.selectAll();
    }
}
