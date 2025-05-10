package com.github.raphaelfontoura.designpatterns.decorator;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

public class ExampleOfDecorator {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("example.zip");
            os = new GZIPOutputStream(os);
            writeSomContentToAnOutputStream(os);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeSomContentToAnOutputStream(OutputStream os) throws IOException {
        String someContent = "Hello, World!";
        os = new BufferedOutputStream(os);
        os.write(someContent.getBytes(Charset.forName("UTF-8")));
        os.flush();
    }

}
