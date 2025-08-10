package com.aston.home_work_3.service;

import com.aston.home_work_3.exception.CustomExceptionIO;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Override
    public void getInput(String line) throws IOException {
        try (BufferedWriter rec = new BufferedWriter(new FileWriter("my_dear_diary.txt", true))) {
            rec.write(line);
            rec.newLine();
        } catch (CustomExceptionIO exceptionIO) {
            System.out.println(exceptionIO.getMessage());
        }
    }

    @Override
    public Collection<String> getOutput() {
        List<String> result = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader("my_dear_diary.txt"))) {
            String line;
            while((line = read.readLine()) != null){
                result.add(line);
            }
        } catch (CustomExceptionIO exceptionIO) {
            System.out.println(exceptionIO.getMessage());
        } catch (IOException e) {
            System.out.println("Файл не найден или поврежден");
        }
        return result;
    }
}
