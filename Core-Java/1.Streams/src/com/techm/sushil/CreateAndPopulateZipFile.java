package com.techm.sushil;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CreateAndPopulateZipFile {

	public static void main(String[] args) {
		String []data={
				"line 1",
				"line 2 2",
				"line 3 3 3",
				"line 4 4 4 4",
				"line 5 5 5 5 5"
		};
		try(FileSystem zipfs=openzip(Paths.get("mydata.zip"))){
			copyToZip(zipfs);
			writeToFileInZip1(zipfs,data);
			writeToFileInZip2(zipfs,data);
		}catch(Exception e){
			  System.out.println(e.getClass() + "-" + e.getMessage());
		}

	}
	//Method for creating Zip file system
	private static FileSystem openzip(Path zipPath)throws IOException, URISyntaxException {
		Map<String,String>providerProps=new HashMap<>();
		providerProps.put("create", "true");
		URI zipUri=new URI("jar:file",zipPath.toUri().getPath(),null);
		FileSystem zipfs=FileSystems.newFileSystem(zipUri, providerProps);
		
		return zipfs;
	}
	//Method for Copying file to Zip system
	private static void copyToZip(FileSystem zipfs)throws IOException {
		//Path sourceFile =Paths.get("abc.txt");
		Path sourceFile =FileSystems.getDefault().getPath("abc.txt");
		Path destFile = zipfs.getPath("/filecopied.txt");
		Files.copy(sourceFile,destFile,StandardCopyOption.REPLACE_EXISTING);
	}
	//Method to write String data into file
	private static void writeToFileInZip1(FileSystem zipfs,String[]data)throws IOException{
		try(BufferedWriter writer=Files.newBufferedWriter(zipfs.getPath("newFile1.txt"))){
			for(String d:data){
				writer.write(d);
				writer.newLine();
			}
		}
	}
	//Method to write String data into file in other way
	private static void writeToFileInZip2(FileSystem zipfs,String[]data)throws IOException{
		Files.write(zipfs.getPath("newFile2.txt"),Arrays.asList(data),
				Charset.defaultCharset(),StandardOpenOption.CREATE);
	}

}
