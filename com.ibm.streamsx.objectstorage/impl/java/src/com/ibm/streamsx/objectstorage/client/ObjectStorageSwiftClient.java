/*******************************************************************************
* Copyright (C) 2014, International Business Machines Corporation
* All Rights Reserved
*******************************************************************************/
package com.ibm.streamsx.objectstorage.client;

import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.hadoop.conf.Configuration;


/**
 * Object Storage Swift Client
 */
public class ObjectStorageSwiftClient extends ObjectStorageAbstractClient {
	
	public ObjectStorageSwiftClient(String objectStorageURI,
			                   String objectStorageUser, 
							   String objectStoragePassword, 
							   String objectStorageProjectID) throws Exception {
		
		super(objectStorageURI, objectStorageUser, objectStoragePassword, objectStorageProjectID);
	}
	
	public ObjectStorageSwiftClient(String objectStorageURI,
            String objectStorageUser, 
			   String objectStoragePassword, 
			   String objectStorageProjectID, Configuration config) throws Exception {
		super(objectStorageURI, objectStorageUser, objectStoragePassword, objectStorageProjectID, config);
	}
	
	
	@Override
	public void initClientConfig() throws IOException, URISyntaxException  {
		
		fConnectionProperties.set(Constants.SWIFT_FS_IMPL_CONFIG_NAME, Constants.STOCATOR_DEFAULT_FS_IMPL);
		fConnectionProperties.set(Constants.SWIFT_IS_PUBLIC_CONFIG_NAME, Boolean.toString(true));		
		fConnectionProperties.set(Constants.SWIFT_AUTH_URL_CONFIG_NAME, Constants.SWIFT_AUTH_URL);
		fConnectionProperties.set(Constants.SWIFT_USERNAME_CONFIG_NAME, fObjectStorageUser);
		fConnectionProperties.set(Constants.SWIFT_PASSWORD_CONFIG_NAME, fObjectStoragePassword);
		fConnectionProperties.set(Constants.SWIFT_PROJECT_ID_CONFIG_NAME, fObjectStorageProjectID);
		fConnectionProperties.set(Constants.SWIFT_REGION_CONFIG_NAME, Constants.SWIFT_DEFAULT_REGION);
		fConnectionProperties.set(Constants.SWIFT_NON_STREAMING_UPLOAD_CONFIG_NAME, Boolean.toString(true));
		
		
		fConnectionProperties.set(Constants.SWIFT_AUTH_METHOD_CONFIG_NAME, Constants.SWIFT_AUTH_METHOD);
		fConnectionProperties.set(Constants.SOCKET_TIMEOUT_CONFIG_NAME, Constants.SWIFT_DEFAULT_SOCKET_TIMEOUT);
		fConnectionProperties.set(Constants.REQ_LEVEL_CONNECT_TIMEOUT_CONFIG_NAME, Constants.SWIFT_REQ_LEVEL_DEFAULT_SOCKET_TIMEOUT);
		fConnectionProperties.set(Constants.CONNECTION_TIMEOUT_CONFIG_NAME, Constants.SWIFT_CONNECTION_TIMEOUT);
		fConnectionProperties.set(Constants.REQ_SOCKET_TIMEOUT_CONFIG_NAME, Constants.SWIFT_REQ_SOCKET_TIMEOUT);
	}

}
