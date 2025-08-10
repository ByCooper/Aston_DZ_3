package com.aston.home_work_3.service;

import java.io.IOException;
import java.util.Collection;

public interface RecordService {
    void getInput(String line) throws IOException;
    Collection<String> getOutput();
}
