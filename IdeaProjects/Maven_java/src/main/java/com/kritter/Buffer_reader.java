package com.kritter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_reader {
public static void main(String arg[]) throws IOException
{
    FileReader in =new FileReader("/home/rajat/IdeaProjects/Maven_java/src/main/java/com/kritter/input.txt");
    BufferedReader br = new BufferedReader(in);

    int i;
    while ((i=br.read())!=-1)
    {
        System.out.print((char)i);
    }

    in.close();
    br.close();
}
}
