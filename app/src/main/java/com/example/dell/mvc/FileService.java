package com.example.dell.mvc;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by johnnyTan on 2017/8/19.
 */

public class FileService {
    /**
     * 保存數據
     * @param outputStream
     * @param content
     * @throws Exception
     * */
    public void save(OutputStream outputStream, String content) throws Exception {
        outputStream.write(content.getBytes());
        outputStream.close();
    }
    /**
     * 讀取數據
     * @param inputStream
     * @return
     * @throws Exception
     * */
    public String read(InputStream inputStream) throws Exception
    {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = inputStream.read(buffer)) != -1)
        {
            outputStream.write(buffer,0,len);
        }
        byte[] data = outputStream.toByteArray();
        outputStream.close();
        inputStream.close();
        return new String(data);
    }

}
