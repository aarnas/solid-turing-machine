package com.turing.main;

import com.turing.factory.ReaderFactory;
import com.turing.machine.Processor;
import com.turing.model.Params;
import com.turing.readers.Reader;
import com.turing.util.FileUtil;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        String path = "data/running_ones.tmprog.json";
        // String path = "data/running_ones.tmprog.json";
        Reader reader = ReaderFactory.getReader(FileUtil.getFileType(path));
        Params params = reader.read(path);
        Processor.start(params);
    }

}
