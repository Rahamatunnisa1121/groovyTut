class FileIOTut{
    static void main(String[] args) {
        new File("test.txt").eachLine{line->
            println "$line";
        }
        //it creates a new File object representing the file "test.txt" 
        // and reads each line of the file, printing it to the console.

        new File("test.txt").withWriter('utf-8'){
            writer->writer.writeLine("This is a new line added to the file.");
        }
        //it opens the file "test.txt" for writing with UTF-8 encoding and adds a new line to the end of the file.
        //withWriter → clears the file first, then writes new content.
        //writeLine() adds a newline (\n) automatically after writing the line.

        //to append text without clearing the file, use withWriterAppend():
        new File("test.txt").withWriterAppend('utf-8'){
            writer->writer.writeLine("This line is appended to the file.");
        }

        File file=new File("test.txt");
        // file.append("Appending another line.\n");
        // //The append() method adds the specified text to the end of the file.

        println(file.text);
        //The text property reads the entire content of the file as a single string.

        println("File path: ${file.path}");
        //The path property returns the file's path as a string.

        println("File size: ${file.length()} bytes");
        //The length() method returns the size of the file in bytes.

        println("File: ${file.isFile()}");
        //The isFile() method checks if the path represents a file (not a directory)

        println("Directory: ${file.isDirectory()}");
        //The isDirectory() method checks if the path represents a directory.

        def newFile=new File("newfile.txt");
        newFile<<file.text;
        //The << operator writes the content of file to newFile.

        newFile.delete();
        //The delete() method deletes the file.

        def dirFiles=new File("").listRoots();
        //The listRoots() method lists all root directories on the system.
        dirFiles.each{
            item->println item.absolutePath;
        }
        //The absolutePath property returns the absolute path of the file or directory.

    }
}