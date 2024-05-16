package co.com.infovalmer.utilities;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import co.com.infovalmer.ejb.generales.ftp.FtpConnection;
import co.com.infovalmer.utilidades.LOGS;

public class DescargaArchivosUtil {
	
//	public static void downloadFileFromPath(String prefix, String path, OutputStream out){
//	    String filename = newestFileWithPrefix(prefix, path);
//	    if (filename != null)
//	    {
//	      File file = new File(path, filename);
//	      try
//	      {
//	        FileInputStream fis = new FileInputStream(file);
//	        BufferedOutputStream bos = new BufferedOutputStream(out);
//	        byte[] buffer = new byte['?'];
//	        
//	        int bytesRead = 0;
//	        while ((bytesRead = fis.read(buffer)) > 0) {
//	          bos.write(buffer, 0, bytesRead);
//	        }
//	        fis.close();
//	        bos.close();
//	      }
//	      catch (Exception e)
//	      {
//	        LOGS.LOG_DEBUG.error("ERROR DESCARGANDO ARCHIVO", e);
//	      }
//	    }
//	  }
	  
	  public static void downloadFile(InputStream in, FtpConnection fppConn, OutputStream out) throws Exception{
	      try
	      {
	        BufferedOutputStream bos = new BufferedOutputStream(out);
	        byte[] buffer = new byte['?'];
	        
	        int bytesRead = 0;
	        while ((bytesRead = in.read(buffer)) > 0) {
	          bos.write(buffer, 0, bytesRead);
	        }
	        in.close();
	        bos.close();
	        fppConn.completePendingCommand();
	      }
	      catch (Exception e)
	      {
	        LOGS.LOG_ERRORES.error("ERROR DESCARGANDO ARCHIVO DESCRIPCION ERROR: ", e);
	        throw e;
	      }
	  }
	  
	  public static boolean pathHaveFilesWithPrefix(String prefix, String path) throws Exception
	  {
	    try
	    {
	      File file = new File(path);
	      String[] files = file.list();
	      for (int i = 0; i < files.length; i++) {
	        if (files[i].contains(prefix)) {
	          return true;
	        }
	      }
	    }
	    catch (Exception e)
	    {
	      LOGS.LOG_ERRORES.error("ERROR: EL DIRECTORIO NO EXISTE DESCRIPCION ERROR: ", e);
	      throw e;
	    }
	    return false;
	  }
	  
//	  public static String newestFileWithPrefix(String prefix, String path)
//	  {
//	    File file = new File(path);
//	    String[] fileList = file.list();
//	    String filename = null;
//	    if (fileList.length > 0)
//	    {
//	      ArrayList<NemoIsinFile> files = new ArrayList();
//	      for (int i = 0; i < fileList.length; i++) {
//	        if (fileList[i].contains(prefix)) {
//	          files.add(new NemoIsinFile(fileList[i], prefix.length()));
//	        }
//	      }
//	      fileList = new String[files.size()];
//	      for (int i = 0; i < files.size(); i++) {
//	        fileList[i] = ((NemoIsinFile)files.get(i)).toString();
//	      }
//	      Arrays.sort(fileList);
//	      
//	      boolean termino = false;
//	      for (int i = 0; (i < files.size()) && (!termino); i++) {
//	        if (((NemoIsinFile)files.get(i)).toString().equalsIgnoreCase(fileList[(fileList.length - 1)]))
//	        {
//	          filename = ((NemoIsinFile)files.get(i)).getName();
//	          termino = true;
//	        }
//	      }
//	    }
//	    LOGS.LOG_DEBUG.debug("filename= " + filename);
//	    return filename;
//	  }
	  
	  public static void downloadOTCFileFromPath(String path, String filename, OutputStream out)
	  {
	    File file = new File(path, filename);
	    try
	    {
	      FileInputStream fis = new FileInputStream(file);
	      BufferedOutputStream bos = new BufferedOutputStream(out);
	      byte[] buffer = new byte['?'];
	      
	      int bytesRead = 0;
	      while ((bytesRead = fis.read(buffer)) > 0) {
	        bos.write(buffer, 0, bytesRead);
	      }
	      fis.close();
	      bos.close();
	    }
	    catch (Exception e)
	    {
	      LOGS.LOG_DEBUG.error("ERROR AL DESCARGAR EL ARCHIVO OTC, DESCRIPCION DE ERROR: " +e);
	    }
	  }
	  
	  public static boolean existFile(String path, String filename)
	  {
	    File file = new File(path, filename);
	    if (file.exists()) {
	      return true;
	    }
	    return false;
	  }
	  
	  public static boolean deleteFile(String path, String filename)
	    throws Exception
	  {
	    File file = new File(path, filename);
	    if (file.exists()) {
	      file.delete();
	    }
	    return true;
	  }
}
