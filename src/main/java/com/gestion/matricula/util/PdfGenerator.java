package com.gestion.matricula.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.util.Base64;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.io.exceptions.IOException;

public class PdfGenerator {
	
	public static String pdfBase64FromHtmString(String htmlString) {
		   //System.out.println("htmlString:"+htmlString);
		    try {
		        ByteArrayOutputStream baos = new ByteArrayOutputStream();
		        HtmlConverter.convertToPdf(htmlString, baos);
		        String pdfBase64 = Base64.getEncoder().encodeToString(baos.toByteArray());
		        System.out.println("pdfBase64 "+pdfBase64);
		        return pdfBase64;
		    } catch (IOException e) {
		        throw new IllegalArgumentException("Cannot create PDF");
		    }
		}
		public static String pdfBase64FromFile(String pathFile) throws IllegalArgumentException, java.io.IOException {
		    try {
		        File file = new File(pathFile);
		        byte [] bytes = Files.readAllBytes(file.toPath());

		        String b64 = Base64.getEncoder().encodeToString(bytes);
		        return b64;
		    } catch (IOException e) {
		        throw new IllegalArgumentException("Cannot create PDF: " + e.getMessage());
		    }
		}
			
}
