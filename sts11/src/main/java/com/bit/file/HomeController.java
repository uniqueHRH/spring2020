package com.bit.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	String path="C:\\sts\\workspace\\upload\\";   // upload 파일의 경로
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("index");
		return "home";
	}

	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(int sabun, MultipartFile[] files, Model model) {   // 다중으로 받을 경우, 배열로 받으면 된다
		logger.debug(sabun+"");
		logger.debug(files.toString());
		
		List renames=new ArrayList<String>();
		int cnt=0;
		
		for(MultipartFile multi:files) {
			if(multi.getOriginalFilename().isEmpty())continue;   // 공백일 때, PASS!!!
			logger.debug(multi.getOriginalFilename());
			
			
			String filenames=multi.getOriginalFilename();
			String rename=System.currentTimeMillis()+"_"+filenames;
			renames.add(rename);
			File file=new File(path+rename);
			
			
//			스프링식
			try {
				multi.transferTo(file);   // 업로드 한 파일 데이터를 지정한 파일에 저장한다
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		cnt++;
		}
		
//		자바식		
//		try (
//			InputStream is=file1.getInputStream();
//			OutputStream os=new FileOutputStream(file);
//			) {
//			int su=-1;
//			while((is.read())!=-1) {
//				os.write(su);
//			}
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		
		model.addAttribute("sabun", sabun);
		model.addAttribute("files", renames);
		return "download";
	}
	
	
//	@PathVariable 에서는 "." 이 들어가면 잘라버림 . 확장명이 잘린다 / 다운로드시 확장명을 불러오지 않아 FileNotFoundError
//	filename:.+ 로 작성해서, 뒤의 확장명도 가져올 수 있도록 한다	
	@RequestMapping("/download/{filename:.+}")
	public void download(@PathVariable String filename, HttpServletResponse resp) { 
		String origin=filename.substring(filename.indexOf("_")+1);
		
		File file=new File(path+filename);
		resp.setContentType("application/octet-stream");   // 브라우저가 읽을 수 없는 타입으로 적어준다 (이건 지금 쓰지않는 타입이므로, 브라우저에서 열지않고, 다운로드되도록 할 수 있다)
		resp.setHeader("Content-Disposition", "attachment; filename=\""+origin+"\"");
		try (
				InputStream is=new FileInputStream(file);
				OutputStream os=resp.getOutputStream();
			) {
			int su=-1;
			while((su=is.read())!=-1)os.write(su);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
