// /***

//----------- creates a VALID symlink, butt the symlink when click-opened in github shows absolute path of the original file that this created symlink refers to

// SNIPPET 1 : START

import groovy.io.FileType
import java.nio.file.Path
import java.nio.file.Files;
import java.nio.file.FileAlreadyExistsException
import java.io.FileNotFoundException
import java.nio.file.Paths;

def specificFilesPath = Paths.get("toSymlink.groovy").toAbsolutePath()

def srcPath = specificFilesPath.toAbsolutePath()
println "srcPath is ------------   " + srcPath

def symLinkToCreate = Paths.get("../../../symlinkTestFiles/toSymlink.groovy").toAbsolutePath()
println "symLinkToCreate -------------   " + symLinkToCreate

try{
Path symLink = Files.createSymbolicLink(symLinkToCreate, srcPath);
println "symlink created -----   " + symLink
}catch(FileAlreadyExistsException faee){
}

// SNIPPET 1 : END
// ***/


/****

//----------- creates a INVALID symlink, and the symlink when click-opened in github shows absolute path of the original file that this created symlink refers to

// SNIPPET 2 : START

import groovy.io.FileType
import java.nio.file.Path
import java.nio.file.Files;
import java.nio.file.FileAlreadyExistsException
import java.io.FileNotFoundException
import java.nio.file.Paths;

def specificFilesPath = new File("toSymlink.groovy")

def srcPath = specificFilesPath.toPath()
println "srcPath is ------------   " + srcPath.toAbsolutePath()
def symLinkToCreate = new File("../../../symlinkTestFiles/toSymlink.groovy").toPath()


println "symLinkToCreate -------------   " + symLinkToCreate.toAbsolutePath()

try{
Path symLink = Files.createSymbolicLink(symLinkToCreate, srcPath);
println "symlink created -----   " + symLink.toAbsolutePath()
}catch(FileAlreadyExistsException faee){
}

// SNIPPET 2 : END

*****/