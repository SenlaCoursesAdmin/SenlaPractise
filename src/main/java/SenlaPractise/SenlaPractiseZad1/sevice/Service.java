package SenlaPractise.SenlaPractiseZad1.sevice;

import SenlaPractise.SenlaPractiseZad1.entity.History;

import java.util.List;

public interface Service {
    void addHistory(History history);
    List<History> showAll();
}
