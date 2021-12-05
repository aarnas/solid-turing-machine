package com.turing.util;

import com.turing.enums.EnumReader;
import org.apache.commons.io.FilenameUtils;

public class FileUtil {
    public static EnumReader getFileType(String file) {
        String ext = FilenameUtils.getExtension(file);
        EnumReader enumReader;
        switch (ext) {
            case "json":
                enumReader = EnumReader.JSON_READER;
                break;
            case "txt":
                enumReader = EnumReader.TEXT_READER;
                break;
            default:
                throw new UnsupportedOperationException("");
        }
        return enumReader;
    }

}
