package me.eperson.br.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Utility {
	
	@FunctionalInterface
    public interface ExecuteMode {
        void evaluate(Scanner in);
    }
	
	public static void getFile(String nomeDoArquivo, ExecuteMode executeMode) throws IOException {
		InputStream input = new FileInputStream(nomeDoArquivo);
		Scanner in = new Scanner(input);
		executeMode.evaluate(in);
		in.close();
	}
}
