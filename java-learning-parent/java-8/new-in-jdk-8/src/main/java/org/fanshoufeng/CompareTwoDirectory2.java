package org.fanshoufeng;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CompareTwoDirectory2 {

	private static Set<String> listFilesPath(String directory) {
		Set<String> filesPath = new HashSet<>();
		try {
			filesPath.addAll(Files.walk(Paths.get(directory), FileVisitOption.FOLLOW_LINKS)
				.filter(path -> path.toString().endsWith(".java"))
				.map(path -> path.toString().replace(directory + "\\", ""))
				.collect(Collectors.toSet()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filesPath;
	}
	
	private static void compareAndPrint(Set<String> filesPath1, Set<String> filesPath2) {
		filesPath2.stream()
			.filter(filePath -> !filesPath1.contains(filePath))
			.sorted((str1, str2) -> str1.compareTo(str2))
			.forEach(System.out::println);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String directory1 = "E:\\Source Code\\Java\\jdk1.7.0_79\\src";
		String directory2 = "E:\\Source Code\\Java\\jdk1.8.0_171\\src";
		
		Set<String> filesPath1 = listFilesPath(directory1);
		Set<String> filesPath2 = listFilesPath(directory2);
		System.out.println("删除的文件有:");
		compareAndPrint(filesPath2, filesPath1);
		System.out.println("\n添加的文件有:");
		compareAndPrint(filesPath1, filesPath2);
	}

}
