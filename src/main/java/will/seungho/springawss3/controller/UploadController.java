package will.seungho.springawss3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import will.seungho.springawss3.utils.Uploader;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class UploadController {

	private final Uploader uploader;

	@PostMapping("/api/v1/upload")
	public ApiResponse<String> upload(@RequestParam("data") MultipartFile file) throws IOException {
		return ApiResponse.of(uploader.upload(file, "static"));
	}

}
