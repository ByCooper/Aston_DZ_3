package com.aston.home_work_3.exception;

import java.io.IOException;

public class CustomExceptionIO extends IOException {
    @Override
    public String getMessage() {
        return "Файл не найден или поврежден";
    }
}
