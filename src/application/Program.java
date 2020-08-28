package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine(); // caminho completo do arquivo solicitado

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //para abrir o arquivo  try with resources
			
			Set<LogEntry> set = new HashSet<>(); //Instanciando um set, ao qual não permite repetir dados na lista. HashSet é o mais rápido nessa verificacao
			
			String line = br.readLine(); //serve para ler 1 linha do meu arquivo
			while (line != null) { //enquanto minha linha for diferente de nula, quer dizer que ainda há dados para ser lido
				String[] fields = line.split(" "); //Split serve para quebrar o string separado por virgula no meu arquivo, levando como parametro o espaço em branco
				String username = fields[0];//Esse split pegará somente o nome do String
				Date moment = Date.from(Instant.parse(fields[1])); //Pegará a data no vetor na posicao 1 que é a data
				set.add(new LogEntry(username, moment)); //instanciado objeto e guardado o username e o moment
				
				line = br.readLine(); //le a proxima linha
			}
			System.out.println("Total Users: " + set.size());//retorna o tamanho do conjunto
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
