/**
 * 
 */
package org.fanshoufeng.compare;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Fan
 *
 */
public class CompareTwoDirectory {

	private static void compareUsingJava7(String directory1, String directory2) {
		List<String> filesPath1 = listFilesPath(directory1, new File(directory1));
		List<String> filesPath2 = listFilesPath(directory2, new File(directory2));
		System.out.println("删除的文件有:");
		long deleteTotal = 0;
		for(String filePath1: filesPath1) {
			if (!filesPath2.contains(filePath1)) {
				deleteTotal++;
				System.out.println(filePath1);
			}
		}
		System.out.println(String.format("一共删除%s个文件", deleteTotal));
		System.out.println("\n添加的文件有:");
		long addTotal = 0;
		for(String filePath2: filesPath2) {
			if (!filesPath1.contains(filePath2)) {
				addTotal++;
				System.out.println(filePath2);
			}
		}
		System.out.println(String.format("一共添加%s个文件", addTotal));
	}
	
	private static List<String> listFilesPath(String rooyDirectory, File folder) {
		List<String> filesPath = new ArrayList<>();
		if (folder.isDirectory()) {
			File[] files = folder.listFiles();
			for (File file : files) {
				filesPath.addAll(listFilesPath(rooyDirectory, file));
			}
		} else {
			filesPath.add(getFilePath(rooyDirectory, folder.getAbsolutePath()));
		}
		return filesPath;
	}
	
	private static void compareUsingJava7_2(String directory1, String directory2) {
		System.out.println("删除的文件有:");
		listFiles(directory1, directory2, new File(directory1));
		System.out.println("\n添加的文件有:");
		listFiles(directory2, directory1, new File(directory2));
	}
	
	private static void listFiles(String rooyDirectory1, String rooyDirectory2, File folder) {
		if (folder.isDirectory()) {
			File[] files = folder.listFiles();
			for (File file : files) {
				listFiles(rooyDirectory1, rooyDirectory2, file);
			}
		} else {
			String filePath = getFilePath(rooyDirectory1, folder.getAbsolutePath());
			File file = new File(rooyDirectory2, filePath);
			if (!file.exists()) {
				System.out.println(filePath);
			}
		}
	}
	
	private static void compareUsingJava8(String directory1, String directory2) {
		List<String> filesPath1 = listFilesPath(directory1, new File(directory1));
		List<String> filesPath2 = listFilesPath(directory2, new File(directory2));
		System.out.println("删除的文件有:");
		filesPath1.stream().filter(filePath -> !(new File(directory2, filePath).exists())).forEach(System.out::println);
		System.out.println("\n添加的文件有:");
		filesPath2.stream().filter(filePath -> !(new File(directory1, filePath).exists())).forEach(System.out::println);
	}
	
	private static void compareUsingJava8_2(String directory1, String directory2) {
		System.out.println("删除的文件有:");
		System.out.println("\n添加的文件有:");
	}
	
	private static String getFilePath(String rooyDirectory, String fileAbsolutePath) {
		return fileAbsolutePath.replace(rooyDirectory + "\\", "");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String directory1 = "E:\\Source Code\\Java\\jdk1.7.0_79\\src";
		String directory2 = "E:\\Source Code\\Java\\jdk1.8.0_171\\src";
		compareUsingJava7(directory1, directory2);
		compareUsingJava7_2(directory1, directory2);
		compareUsingJava8(directory1, directory2);
		compareUsingJava8_2(directory1, directory2);
	}

}
