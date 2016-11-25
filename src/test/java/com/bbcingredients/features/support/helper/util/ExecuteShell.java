package com.bbcingredients.features.support.helper.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yarboi on 20/11/2016.
 */


public class ExecuteShell{

    public static void executeCommand(String command) {
        StringBuffer output = new StringBuffer();

        Process cmd;
        try {
            cmd = Runtime.getRuntime().exec(command);
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(cmd.getInputStream()));
            String line;
            System.out.println("Loading local server");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                output.append(line);
            }
            cmd.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(output);
        }

}
