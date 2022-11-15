package com.analysisgroup.analysis.service;
import com.analysisgroup.analysis.model.*;

public interface EventListener {
    void update(String eventType, Movie movie);
}