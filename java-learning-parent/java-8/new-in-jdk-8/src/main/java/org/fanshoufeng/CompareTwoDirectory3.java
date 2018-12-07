package org.fanshoufeng;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

public class CompareTwoDirectory3 {

	private static void compareAndPrint(String directory1, String directory2) {
		try {
			Files.walk(Paths.get(directory1), FileVisitOption.FOLLOW_LINKS)
				.filter(path -> path.toString().endsWith(".java"))
				.filter(path -> Files.notExists(Paths.get(path.toString().replace(directory1, directory2)), LinkOption.NOFOLLOW_LINKS))
				.sorted((path1, path2) -> path1.toString().compareTo(path2.toString()))
				.forEach(path -> System.out.println(path.toString().replace(directory1 + "\\", "")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String directory1 = "E:\\Source Code\\Java\\jdk1.7.0_79\\src";
		String directory2 = "E:\\Source Code\\Java\\jdk1.8.0_171\\src";
		System.out.println("删除的文件有:");
		compareAndPrint(directory1, directory2);
		System.out.println("\n添加的文件有:");
		compareAndPrint(directory2, directory1);
	}

}
