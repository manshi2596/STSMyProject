package com.example.webapp.repository;

 import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.ektorp.http.HttpClient;

public class JavaCouchDB {

	HttpClient httpClient = new StdHttpClient.Builder().host("10.1.159.2").port(5984).username("admin")
			.password("admin123").build();
	CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
			//new StdCouchDbInstance(httpCl ent);
	//--------------- Creating database----------------------------//
	CouchDbConnector db = new StdCouchDbConnector("mydb_test", dbInstance);

	public static JavaCouchDB createDbConnection() {
		//--------------- Creating Connection--------------------------//
		JavaCouchDB jd = new JavaCouchDB();
		jd.db.createDatabaseIfNotExists();
		//--------------- Creating Document----------------------------//
		return jd;
	}
}
