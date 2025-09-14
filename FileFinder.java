import java.io.File;

class FileFinder {

    public File findFileByName(File rootDir, String fileName) {
        //if rootDir is not Directory return null
        if (!rootDir.isDirectory()) {
            return null;
        }
        //else add all files in rootDir to array
        //loop throw the files
        //if you find file and that file have same name return that file
        //if file is directory enter that direcotery again by
        // calling the method
        //else return null
        File[]filesInsideRootDir = rootDir.listFiles();
        for (File file: filesInsideRootDir) {
            if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                return file;
            } else if (file.isDirectory()) {
                findFileByName(file, fileName);
            }
        }
        return null;
    }
}