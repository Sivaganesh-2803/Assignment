package utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

	 private Properties properties;

	    /**
	     * Loads the properties file from the path
	     * @param fileName name of the properties file 
	     */
	    public PropertiesReader(String fileName) {
	        properties = new Properties();
	        try (InputStream file = getClass().getClassLoader().getResourceAsStream(fileName)) {
	            if (file == null) {
	                throw new RuntimeException("The file  '" + fileName + "'is not present in the given path");
	            }
	            properties.load(file);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to load the  file: " + fileName, e);
	        }
	    }
	    
	    
	    /**
	     * Using the given key , value is returned from the properties file 
	     * @param  Key in the property file
	     * @return property value
	     */
	    public String get(String key) {
	        String value = properties.getProperty(key);
	        if (value == null) {
	            throw new RuntimeException("The given key '" + key + "' is not found in properties file");
	        }
	        return value;
	    }
	}
