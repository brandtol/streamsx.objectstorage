package com.ibm.streamsx.objectstorage;


public interface IObjectStorageAuth {
	
	public void setObjectStorageUser(String objectStorageUser);
	
	public String getObjectStorageUser();
	
	public void setObjectStoragePassword(String objectStoragePassword);
	
	public String getObjectStoragePassword();
	
	public void setObjectStorageProjectID(String objectStorageProjectID);
	
	public String getObjectStorageProjectID();	

	public void setObjectStorageURI(String objectStorageURI);
	
	public String getObjectStorageURI();

}
