package will.seungho.springawss3.external;

import com.amazonaws.services.s3.model.ObjectMetadata;

import java.io.InputStream;

public interface UploadService {

	void uploadFile(InputStream inputStream, ObjectMetadata objectMetadata, String fileName);

	String getFileUrl(String fileName);

}
