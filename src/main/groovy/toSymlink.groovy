
// import groovy.io.FileType
// import java.nio.file.Path
// import java.nio.file.Files;
// import java.nio.file.FileAlreadyExistsException
// import java.io.FileNotFoundException
// import java.nio.file.Paths;

// def specificFilesPath = new File("../../../symlinkTestFiles/abc.txt")

// def srcPath = specificFilesPath.toPath()
// println "srcPath is ------------   " + srcPath

// def symLinkToCreate = new File("../../../symlinkTestFiles/symLinkedFile/abc.txt").toPath()
// println "symLinkToCreate -------------   " + symLinkToCreate

// try{
// Path symLink = Files.createSymbolicLink(symLinkToCreate, srcPath);
// println "symlink created -----   " + symLink
// }catch(FileAlreadyExistsException faee){
//    println "File Already Exists ! AbsolutePath  :--  " + symLinkToCreate.toAbsolutePath()
//    println "File Already Exists ! Path  :--  " + symLinkToCreate
// }




import groovy.io.FileType
import java.nio.file.Path
import java.nio.file.Files;
import java.nio.file.FileAlreadyExistsException
import java.io.FileNotFoundException
import java.nio.file.Paths;

println "Hello from script"


// def specificFilesPath = new File("../../../symlinkTestFiles/abc.txt")
def specificFilesPath = Paths.get("../../../symlinkTestFiles/abc.txt").toAbsolutePath()

// println specificFilesPath.getAbsolutePath().text;

def srcPath = specificFilesPath.toAbsolutePath()
println "srcPath is ------------   " + srcPath
// def symLinkToCreate = new File("../../../symlinkTestFiles/symLinkedFile/abc.txt").toAbsolutePath()
def symLinkToCreate = Paths.get("../../../symlinkTestFiles/symLinkedFile/abc.txt").toAbsolutePath()


println "symLinkToCreate -------------   " + symLinkToCreate
// println "location ---------  "+new File("..\\symlinkTestFiles\\symLinkedFile\\abc.txt"   )
File directory = new File("./");
println "directory is :---" + directory
   System.out.println(directory.getAbsolutePath());
try{
Path symLink = Files.createSymbolicLink(symLinkToCreate, srcPath);
println "symlink created -----   " + symLink
}catch(FileAlreadyExistsException faee){
}